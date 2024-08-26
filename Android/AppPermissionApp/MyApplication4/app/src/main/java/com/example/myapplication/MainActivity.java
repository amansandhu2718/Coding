package com.example.myapplication;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        initializePermissions();

    }

    private ActivityResultLauncher<String[]> requestMultiplePermissions =
            registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), permissions -> {
                boolean allPermissionsGranted = true;
                for (Boolean granted : permissions.values()) {
                    if (!granted) {
                        allPermissionsGranted = false;
                        break;
                    }
                }
                if (!allPermissionsGranted) {
                    Toast.makeText(this, "Required permissions needed", Toast.LENGTH_LONG).show();
                    finish();
                } else {
                    recreate();
                }
            });

    @Override
    protected void onStart() {
        super.onStart();
        if (!hasPermissions(this, REQUIRED_PERMISSIONS)) {
            requestMultiplePermissions.launch(REQUIRED_PERMISSIONS);
        }
    }
    private boolean hasPermissions(Context context, String[] permissions) {
        if (permissions.length == 0) {
            return true;
        }
        for (String permission : permissions) {
            if (ContextCompat.checkSelfPermission(context, permission) != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        }
        return true;
    }

    private static String[] REQUIRED_PERMISSIONS;

    private static String[] getRequiredPermissions() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            return new String[]{
                    Manifest.permission.BLUETOOTH_SCAN,
                    Manifest.permission.BLUETOOTH_ADVERTISE,
                    Manifest.permission.BLUETOOTH_CONNECT,
                    Manifest.permission.ACCESS_FINE_LOCATION
            };
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            return new String[]{
                    Manifest.permission.ACCESS_FINE_LOCATION
            };
        } else {
            return new String[]{
                    Manifest.permission.ACCESS_COARSE_LOCATION
            };
        }
    }

    // Call this method during initialization (e.g., in onCreate)
    public void initializePermissions() {
        REQUIRED_PERMISSIONS = getRequiredPermissions();
//        for (int i = 0; i < REQUIRED_PERMISSIONS.length; i++) {
//            Log.d("aman", "initializePermissions: "+REQUIRED_PERMISSIONS[i]);
//        }
    }
}
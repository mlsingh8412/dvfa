package com.example.dvfa;

import android.os.Bundle;
import android.os.Environment;

import androidx.annotation.Nullable;

import java.io.File;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;

public class MainActivity extends FlutterActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final BinaryMessenger messenger = getFlutterEngine().getDartExecutor().getBinaryMessenger();
        new MethodChannel(messenger, "app").setMethodCallHandler(
                (call, result) -> {
                    if (call.method.equalsIgnoreCase("saveText")) {
                        String userDefinedFile = call.argument("fileName");
                        File newFile = new File(Environment.getExternalStorageDirectory(), userDefinedFile);
                        result.success(newFile.delete());
                    }
                }
        );
    }
}

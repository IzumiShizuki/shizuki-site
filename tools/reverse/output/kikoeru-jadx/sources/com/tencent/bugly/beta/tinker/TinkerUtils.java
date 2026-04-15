package com.tencent.bugly.beta.tinker;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.Signature;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.tencent.tinker.lib.tinker.Tinker;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Formatter;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class TinkerUtils {
    public static final int ERROR_PATCH_CONDITION_NOT_SATISFIED = -24;
    public static final int ERROR_PATCH_CRASH_LIMIT = -23;
    public static final int ERROR_PATCH_GOOGLEPLAY_CHANNEL = -20;
    public static final int ERROR_PATCH_MEMORY_LIMIT = -22;
    public static final int ERROR_PATCH_ROM_SPACE = -21;
    public static final int MIN_MEMORY_HEAP_SIZE = 45;
    public static final String PLATFORM = "platform";
    private static final String TAG = "Tinker.TinkerUtils";
    private static boolean background = false;

    /* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
    public static class ScreenState {
        public ScreenState(Context context, g gVar) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            context.registerReceiver(new f(gVar), intentFilter);
        }
    }

    public static String bytesToHexString(byte[] bArr, boolean z10) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        Formatter formatter = new Formatter(stringBuffer);
        for (byte b10 : bArr) {
            formatter.format("%02x", Byte.valueOf(b10));
        }
        formatter.close();
        return z10 ? stringBuffer.toString().toUpperCase() : stringBuffer.toString().toLowerCase();
    }

    public static int checkForPatchRecover(long j10, int i10) {
        if (isGooglePlay()) {
            return -20;
        }
        if (i10 < 45) {
            return -22;
        }
        return !checkRomSpaceEnough(j10) ? -21 : 0;
    }

    @Deprecated
    public static boolean checkRomSpaceEnough(long j10) {
        long availableBlocks;
        long blockCount;
        StatFs statFs;
        try {
            statFs = new StatFs(Environment.getDataDirectory().getPath());
            availableBlocks = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Exception unused) {
            availableBlocks = 0;
        }
        try {
            blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Exception unused2) {
            blockCount = 0;
        }
        return blockCount != 0 && availableBlocks > j10;
    }

    public static boolean copy(File file, File file2) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        if (file == null || file2 == null || !file.exists()) {
            return false;
        }
        BufferedInputStream bufferedInputStream = null;
        try {
            String absolutePath = file2.getAbsolutePath();
            File file3 = new File(absolutePath.substring(0, absolutePath.lastIndexOf(File.separator)));
            if (!file3.exists()) {
                file3.mkdirs();
            }
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file2));
                try {
                    byte[] bArr = new byte[5120];
                    while (true) {
                        int i10 = bufferedInputStream2.read(bArr);
                        if (i10 == -1) {
                            break;
                        }
                        bufferedOutputStream2.write(bArr, 0, i10);
                    }
                    bufferedOutputStream2.flush();
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                    try {
                        bufferedOutputStream2.close();
                        return true;
                    } catch (IOException e11) {
                        e11.printStackTrace();
                        return true;
                    }
                } catch (Throwable th2) {
                    bufferedOutputStream = bufferedOutputStream2;
                    th = th2;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                    if (bufferedOutputStream == null) {
                        throw th;
                    }
                    try {
                        bufferedOutputStream.close();
                        throw th;
                    } catch (IOException e13) {
                        e13.printStackTrace();
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream = null;
        }
    }

    public static String getExceptionCauseString(Throwable th2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        while (th2 != null) {
            try {
                if (th2.getCause() == null) {
                    break;
                }
                th2 = th2.getCause();
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                throw th3;
            }
        }
        if (th2 != null) {
            th2.printStackTrace(printStream);
        }
        String visualString = toVisualString(byteArrayOutputStream.toString());
        try {
            byteArrayOutputStream.close();
            return visualString;
        } catch (IOException e11) {
            e11.printStackTrace();
            return visualString;
        }
    }

    public static String getSignature(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr == null || signatureArr.length <= 0) {
                return "";
            }
            X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
            MessageDigest.getInstance("SHA-1");
            return new String(x509Certificate.getEncoded());
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static boolean isBackground() {
        return background;
    }

    public static boolean isGooglePlay() {
        return false;
    }

    public static boolean isXposedExists(Throwable th2) {
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            String className = stackTraceElement.getClassName();
            if (className != null && className.contains("de.robv.android.xposed.XposedBridge")) {
                return true;
            }
        }
        return false;
    }

    public static byte[] readBytes(InputStream inputStream) {
        try {
            byte[] bArr = new byte[512];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static byte[] readJarEntry(File file, String str) {
        if (file != null) {
            try {
                if (file.exists() && !TextUtils.isEmpty(str)) {
                    return readJarEntry(new JarFile(file), str);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public static void rollbackPatch(Context context) {
        Tinker.with(context).rollbackPatch();
    }

    public static void setBackground(boolean z10) {
        background = z10;
    }

    private static String toVisualString(String str) {
        char[] charArray;
        if (str == null || (charArray = str.toCharArray()) == null) {
            return null;
        }
        for (int i10 = 0; i10 < charArray.length; i10++) {
            if (charArray[i10] > 127) {
                charArray[i10] = 0;
                return new String(charArray, 0, i10);
            }
        }
        return str;
    }

    public static byte[] readJarEntry(JarFile jarFile, String str) {
        if (jarFile != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return readJarEntry(jarFile, jarFile.getJarEntry(str));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public static byte[] readJarEntry(JarFile jarFile, JarEntry jarEntry) {
        if (jarFile != null && jarEntry != null) {
            try {
                return readBytes(jarFile.getInputStream(jarEntry));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }
}

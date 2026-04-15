package c8;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f3761e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f3763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lock f3764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileChannel f3765d;

    public a(String str, File file, boolean z10) {
        Lock lock;
        this.f3762a = z10;
        this.f3763b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = f3761e;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f3764c = lock;
    }

    public final void a(boolean z10) {
        this.f3764c.lock();
        if (z10) {
            File file = this.f3763b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f3765d = channel;
            } catch (IOException e10) {
                this.f3765d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f3765d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f3764c.unlock();
    }
}

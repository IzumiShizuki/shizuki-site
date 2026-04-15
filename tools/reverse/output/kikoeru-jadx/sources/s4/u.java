package s4;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.tencent.bugly.CrashModule;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RandomAccessFile f19479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f19480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f19481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f19482h;

    @Override // s4.h
    public final void close() {
        this.f19480f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f19479e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new t(e10, 2000);
            }
        } finally {
            this.f19479e = null;
            if (this.f19482h) {
                this.f19482h = false;
                b();
            }
        }
    }

    @Override // s4.h
    public final long f(m mVar) throws t {
        Uri uri = mVar.f19443a;
        long j10 = mVar.f19448f;
        this.f19480f = uri;
        c();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f19479e = randomAccessFile;
            try {
                randomAccessFile.seek(j10);
                long length = mVar.f19449g;
                if (length == -1) {
                    length = this.f19479e.length() - j10;
                }
                this.f19481g = length;
                if (length < 0) {
                    throw new t(null, null, 2008);
                }
                this.f19482h = true;
                e(mVar);
                return this.f19481g;
            } catch (IOException e10) {
                throw new t(e10, 2000);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new t(e11, ((e11.getCause() instanceof ErrnoException) && ((ErrnoException) e11.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new t("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + uri.getPath() + ",query=" + uri.getQuery() + ",fragment=" + uri.getFragment(), e11, CrashModule.MODULE_ID);
        } catch (SecurityException e12) {
            throw new t(e12, 2006);
        } catch (RuntimeException e13) {
            throw new t(e13, 2000);
        }
    }

    @Override // m4.i
    public final int read(byte[] bArr, int i10, int i11) throws t {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f19481g;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f19479e;
            int i12 = p4.c0.f16548a;
            int i13 = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (i13 > 0) {
                this.f19481g -= (long) i13;
                a(i13);
            }
            return i13;
        } catch (IOException e10) {
            throw new t(e10, 2000);
        }
    }

    @Override // s4.h
    public final Uri w() {
        return this.f19480f;
    }
}

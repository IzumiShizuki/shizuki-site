package s4;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AssetManager f19382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f19383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InputStream f19384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f19385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19386i;

    public b(Context context) {
        super(false);
        this.f19382e = context.getAssets();
    }

    @Override // s4.h
    public final void close() {
        this.f19383f = null;
        try {
            try {
                InputStream inputStream = this.f19384g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        } finally {
            this.f19384g = null;
            if (this.f19386i) {
                this.f19386i = false;
                b();
            }
        }
    }

    @Override // s4.h
    public final long f(m mVar) throws a {
        try {
            Uri uri = mVar.f19443a;
            long j10 = mVar.f19448f;
            this.f19383f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            c();
            InputStream inputStreamOpen = this.f19382e.open(path, 1);
            this.f19384g = inputStreamOpen;
            if (inputStreamOpen.skip(j10) < j10) {
                throw new a(null, 2008);
            }
            long j11 = mVar.f19449g;
            if (j11 != -1) {
                this.f19385h = j11;
            } else {
                long jAvailable = this.f19384g.available();
                this.f19385h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f19385h = -1L;
                }
            }
            this.f19386i = true;
            e(mVar);
            return this.f19385h;
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // m4.i
    public final int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f19385h;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e10) {
                    throw new a(e10, 2000);
                }
            }
            InputStream inputStream = this.f19384g;
            int i12 = p4.c0.f16548a;
            int i13 = inputStream.read(bArr, i10, i11);
            if (i13 != -1) {
                long j11 = this.f19385h;
                if (j11 != -1) {
                    this.f19385h = j11 - ((long) i13);
                }
                a(i13);
                return i13;
            }
        }
        return -1;
    }

    @Override // s4.h
    public final Uri w() {
        return this.f19383f;
    }
}

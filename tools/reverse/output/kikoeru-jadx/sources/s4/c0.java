package s4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.bugly.CrashModule;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f19391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f19392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f19393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FileInputStream f19394h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f19395i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f19396j;

    public c0(Context context) {
        super(false);
        this.f19391e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    @Override // s4.h
    public final void close() {
        this.f19392f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f19394h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f19394h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f19393g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new b0(null, e10, 2000);
                    }
                } finally {
                    this.f19393g = null;
                    if (this.f19396j) {
                        this.f19396j = false;
                        b();
                    }
                }
            } catch (IOException e11) {
                throw new b0(null, e11, 2000);
            }
        } catch (Throwable th2) {
            this.f19394h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f19393g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f19393g = null;
                    if (this.f19396j) {
                        this.f19396j = false;
                        b();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new b0(null, e12, 2000);
                }
            } finally {
                this.f19393g = null;
                if (this.f19396j) {
                    this.f19396j = false;
                    b();
                }
            }
        }
    }

    @Override // s4.h
    public final long f(m mVar) throws b0 {
        Resources resourcesForApplication;
        int identifier;
        int i10;
        Resources resources;
        this.f19392f = mVar;
        c();
        Uri uri = mVar.f19443a;
        long j10 = mVar.f19449g;
        long j11 = mVar.f19448f;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.f19391e;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new b0("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i10 = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new b0("Resource identifier must be an integer.", null, CrashModule.MODULE_ID);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new b0("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, CrashModule.MODULE_ID);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new b0("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e10, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new b0("Resource identifier must be an integer.", null, CrashModule.MODULE_ID);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(j2.h0.k(packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new b0("Resource not found.", null, 2005);
                }
            }
            i10 = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i10);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new b0("Resource is compressed: " + uriNormalizeScheme, null, 2000);
            }
            this.f19393g = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f19393g.getFileDescriptor());
            this.f19394h = fileInputStream;
            try {
                if (length != -1 && j11 > length) {
                    throw new b0(null, null, 2008);
                }
                long startOffset = this.f19393g.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j11) - startOffset;
                if (jSkip != j11) {
                    throw new b0(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f19395i = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f19395i = size;
                        if (size < 0) {
                            throw new b0(null, null, 2008);
                        }
                    }
                } else {
                    long j12 = length - jSkip;
                    this.f19395i = j12;
                    if (j12 < 0) {
                        throw new j(2008);
                    }
                }
                if (j10 != -1) {
                    long j13 = this.f19395i;
                    this.f19395i = j13 == -1 ? j10 : Math.min(j13, j10);
                }
                this.f19396j = true;
                e(mVar);
                return j10 != -1 ? j10 : this.f19395i;
            } catch (b0 e11) {
                throw e11;
            } catch (IOException e12) {
                throw new b0(null, e12, 2000);
            }
        } catch (Resources.NotFoundException e13) {
            throw new b0(null, e13, 2005);
        }
    }

    @Override // m4.i
    public final int read(byte[] bArr, int i10, int i11) throws b0 {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f19395i;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e10) {
                    throw new b0(null, e10, 2000);
                }
            }
            FileInputStream fileInputStream = this.f19394h;
            int i12 = p4.c0.f16548a;
            int i13 = fileInputStream.read(bArr, i10, i11);
            if (i13 != -1) {
                long j11 = this.f19395i;
                if (j11 != -1) {
                    this.f19395i = j11 - ((long) i13);
                }
                a(i13);
                return i13;
            }
            if (this.f19395i != -1) {
                throw new b0("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }

    @Override // s4.h
    public final Uri w() {
        m mVar = this.f19392f;
        if (mVar != null) {
            return mVar.f19443a;
        }
        return null;
    }
}

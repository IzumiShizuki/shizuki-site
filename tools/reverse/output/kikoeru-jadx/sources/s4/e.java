package s4;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ContentResolver f19400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f19401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f19402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FileInputStream f19403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f19404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f19405j;

    public e(Context context) {
        super(false);
        this.f19400e = context.getContentResolver();
    }

    @Override // s4.h
    public final void close() {
        this.f19401f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f19403h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f19403h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f19402g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new d(e10, 2000);
                    }
                } finally {
                    this.f19402g = null;
                    if (this.f19405j) {
                        this.f19405j = false;
                        b();
                    }
                }
            } catch (IOException e11) {
                throw new d(e11, 2000);
            }
        } catch (Throwable th2) {
            this.f19403h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f19402g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f19402g = null;
                    if (this.f19405j) {
                        this.f19405j = false;
                        b();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new d(e12, 2000);
                }
            } finally {
                this.f19402g = null;
                if (this.f19405j) {
                    this.f19405j = false;
                    b();
                }
            }
        }
    }

    @Override // s4.h
    public final long f(m mVar) throws d {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uri = mVar.f19443a;
            long j10 = mVar.f19449g;
            long j11 = mVar.f19448f;
            Uri uriNormalizeScheme = uri.normalizeScheme();
            this.f19401f = uriNormalizeScheme;
            c();
            boolean zEquals = "content".equals(uriNormalizeScheme.getScheme());
            ContentResolver contentResolver = this.f19400e;
            if (zEquals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.f19402g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new d(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f19403h = fileInputStream;
            if (length != -1 && j11 > length) {
                throw new d(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(startOffset + j11) - startOffset;
            if (jSkip != j11) {
                throw new d(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f19404i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f19404i = jPosition;
                    if (jPosition < 0) {
                        throw new d(null, 2008);
                    }
                }
            } else {
                long j12 = length - jSkip;
                this.f19404i = j12;
                if (j12 < 0) {
                    throw new d(null, 2008);
                }
            }
            if (j10 != -1) {
                long j13 = this.f19404i;
                this.f19404i = j13 == -1 ? j10 : Math.min(j13, j10);
            }
            this.f19405j = true;
            e(mVar);
            return j10 != -1 ? j10 : this.f19404i;
        } catch (d e10) {
            throw e10;
        } catch (IOException e11) {
            throw new d(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // m4.i
    public final int read(byte[] bArr, int i10, int i11) throws d {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f19404i;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e10) {
                    throw new d(e10, 2000);
                }
            }
            FileInputStream fileInputStream = this.f19403h;
            int i12 = p4.c0.f16548a;
            int i13 = fileInputStream.read(bArr, i10, i11);
            if (i13 != -1) {
                long j11 = this.f19404i;
                if (j11 != -1) {
                    this.f19404i = j11 - ((long) i13);
                }
                a(i13);
                return i13;
            }
        }
        return -1;
    }

    @Override // s4.h
    public final Uri w() {
        return this.f19401f;
    }
}

package s4;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import m4.p0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f19410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f19411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19413h;

    @Override // s4.h
    public final void close() {
        if (this.f19411f != null) {
            this.f19411f = null;
            b();
        }
        this.f19410e = null;
    }

    @Override // s4.h
    public final long f(m mVar) throws j, p0 {
        c();
        this.f19410e = mVar;
        Uri uri = mVar.f19443a;
        long j10 = mVar.f19449g;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        p4.c.b("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i10 = p4.c0.f16548a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new p0("Unexpected URI format: " + uriNormalizeScheme, null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f19411f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw new p0(j2.h0.x("Error while parsing Base64 encoded string: ", str), e10, true, 0);
            }
        } else {
            this.f19411f = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j11 = mVar.f19448f;
        byte[] bArr = this.f19411f;
        if (j11 > bArr.length) {
            this.f19411f = null;
            throw new j(2008);
        }
        int i11 = (int) j11;
        this.f19412g = i11;
        int length = bArr.length - i11;
        this.f19413h = length;
        if (j10 != -1) {
            this.f19413h = (int) Math.min(length, j10);
        }
        e(mVar);
        return j10 != -1 ? j10 : this.f19413h;
    }

    @Override // m4.i
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f19413h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.f19411f;
        int i13 = p4.c0.f16548a;
        System.arraycopy(bArr2, this.f19412g, bArr, i10, iMin);
        this.f19412g += iMin;
        this.f19413h -= iMin;
        a(iMin);
        return iMin;
    }

    @Override // s4.h
    public final Uri w() {
        m mVar = this.f19410e;
        if (mVar != null) {
            return mVar.f19443a;
        }
        return null;
    }
}

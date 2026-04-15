package c5;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import s4.f0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements s4.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s4.h f3421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f3422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f3423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CipherInputStream f3424d;

    public a(s4.h hVar, byte[] bArr, byte[] bArr2) {
        this.f3421a = hVar;
        this.f3422b = bArr;
        this.f3423c = bArr2;
    }

    @Override // s4.h
    public final void close() {
        if (this.f3424d != null) {
            this.f3424d = null;
            this.f3421a.close();
        }
    }

    @Override // s4.h
    public final long f(s4.m mVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f3422b, "AES"), new IvParameterSpec(this.f3423c));
                s4.k kVar = new s4.k(this.f3421a, mVar);
                this.f3424d = new CipherInputStream(kVar, cipher);
                kVar.b();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // s4.h
    public final Map p() {
        return this.f3421a.p();
    }

    @Override // m4.i
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        this.f3424d.getClass();
        int i12 = this.f3424d.read(bArr, i10, i11);
        if (i12 < 0) {
            return -1;
        }
        return i12;
    }

    @Override // s4.h
    public final void t(f0 f0Var) {
        f0Var.getClass();
        this.f3421a.t(f0Var);
    }

    @Override // s4.h
    public final Uri w() {
        return this.f3421a.w();
    }
}

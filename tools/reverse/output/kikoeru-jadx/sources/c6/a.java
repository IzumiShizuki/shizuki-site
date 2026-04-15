package c6;

import java.util.Arrays;
import java.util.Objects;
import m4.k0;
import m4.m0;
import m4.o0;
import m4.p;
import m4.q;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements m0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q f3571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q f3572h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f3577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3578f;

    static {
        p pVar = new p();
        pVar.f14488m = o0.p("application/id3");
        f3571g = new q(pVar);
        p pVar2 = new p();
        pVar2.f14488m = o0.p("application/x-scte35");
        f3572h = new q(pVar2);
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f3573a = str;
        this.f3574b = str2;
        this.f3575c = j10;
        this.f3576d = j11;
        this.f3577e = bArr;
    }

    @Override // m4.m0
    public final q a() {
        String str = this.f3573a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f3572h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f3571g;
            default:
                return null;
        }
    }

    @Override // m4.m0
    public final byte[] c() {
        if (a() != null) {
            return this.f3577e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f3575c == aVar.f3575c && this.f3576d == aVar.f3576d) {
                String str = aVar.f3573a;
                int i10 = c0.f16548a;
                if (Objects.equals(this.f3573a, str) && Objects.equals(this.f3574b, aVar.f3574b) && Arrays.equals(this.f3577e, aVar.f3577e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f3578f == 0) {
            String str = this.f3573a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f3574b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j10 = this.f3575c;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f3576d;
            this.f3578f = Arrays.hashCode(this.f3577e) + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f3578f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f3573a + ", id=" + this.f3576d + ", durationMs=" + this.f3575c + ", value=" + this.f3574b;
    }

    @Override // m4.m0
    public final /* synthetic */ void b(k0 k0Var) {
    }
}

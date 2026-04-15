package m4;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d1 implements xa.d, p4.g, r.v, r1.i, p4.l, p4.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14186a;

    public /* synthetic */ d1(int i10) {
        this.f14186a = i10;
    }

    @Override // p4.k
    public void a(Object obj) {
        switch (this.f14186a) {
            case 21:
                ((w0) obj).I();
                break;
            case 22:
                ((w4.i) obj).getClass();
                break;
            case 23:
                ((w4.i) obj).getClass();
                break;
            case 24:
                ((w4.i) obj).getClass();
                break;
            case 25:
                ((w4.i) obj).getClass();
                break;
            case 26:
                ((w4.i) obj).getClass();
                break;
            case 27:
                ((w4.i) obj).getClass();
                break;
            case 28:
                ((w4.i) obj).getClass();
                break;
            default:
                ((w4.i) obj).getClass();
                break;
        }
    }

    @Override // p4.g
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0438  */
    @Override // xa.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r47) {
        /*
            Method dump skipped, instruction units count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.d1.apply(java.lang.Object):java.lang.Object");
    }

    @Override // r1.i
    public double c(double d10) {
        switch (this.f14186a) {
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                double d11 = d10 < 0.0d ? -d10 : d10;
                return Math.copySign(d11 >= 0.0031308049535603718d ? (Math.pow(d11, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d11 / 0.07739938080495357d, d10);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                double d12 = d10 < 0.0d ? -d10 : d10;
                return Math.copySign(d12 >= 0.04045d ? Math.pow((0.9478672985781991d * d12) + 0.05213270142180095d, 2.4d) : d12 * 0.07739938080495357d, d10);
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                float[] fArr = r1.d.f18653a;
                return r1.d.b(r1.d.f18655c, d10);
            case 11:
                float[] fArr2 = r1.d.f18653a;
                return r1.d.a(r1.d.f18655c, d10);
            case 12:
                float[] fArr3 = r1.d.f18653a;
                return r1.d.d(r1.d.f18656d, d10);
            case 13:
                float[] fArr4 = r1.d.f18653a;
                return r1.d.c(r1.d.f18656d, d10);
            default:
                return d10;
        }
    }

    public Constructor d() {
        switch (this.f14186a) {
            case 15:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(r5.n.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(r5.n.class).getConstructor(null);
        }
    }

    @Override // p4.l
    public void g(Object obj, o oVar) {
        ((w0) obj).M(new v0(oVar));
    }

    public /* synthetic */ d1(v4.v vVar) {
        this.f14186a = 20;
    }

    @Override // r.v
    public float b(float f10) {
        return f10;
    }
}

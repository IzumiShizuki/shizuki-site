package l9;

import java.nio.ByteBuffer;
import jc.s;
import jc.z;
import pc.f0;
import pc.u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ u[] f11891l = {z.f10839a.g(new s(d.class, "volume", "getVolume()D", 0))};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final hg.b f11892k = f0.P(gg.c.a(), "volumeAudioDouble", Double.valueOf(1.0d), z.a(Double.TYPE));

    @Override // l9.a
    public final boolean l(ByteBuffer byteBuffer) {
        if (this.f11885i) {
            u uVar = f11891l[0];
            if (((Number) this.f11892k.c(uVar)).doubleValue() != 1.0d) {
                while (byteBuffer.remaining() > 0) {
                    double d10 = 32767;
                    this.f11886j.putShort((short) (nh.b.i(((Number) r4.c(r1[0])).doubleValue() * (((double) byteBuffer.getShort()) / d10), -1.0d, 1.0d) * d10));
                }
                this.f11886j.flip();
                return true;
            }
        }
        return false;
    }
}

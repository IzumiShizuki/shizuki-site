package l9;

import java.nio.ByteBuffer;
import jc.s;
import jc.z;
import pc.f0;
import pc.u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ u[] f11887l = {z.f10839a.g(new s(b.class, "enable", "getEnable()Z", 0))};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final hg.b f11888k = f0.P(gg.c.a(), "mergeAudio", Boolean.FALSE, z.a(Boolean.TYPE));

    @Override // l9.a
    public final boolean l(ByteBuffer byteBuffer) {
        if (this.f11885i) {
            if (((Boolean) this.f11888k.c(f11887l[0])).booleanValue()) {
                while (byteBuffer.remaining() >= 4) {
                    short s10 = (short) ((byteBuffer.getShort() + byteBuffer.getShort()) / 2);
                    this.f11886j.putShort(s10);
                    this.f11886j.putShort(s10);
                }
                this.f11886j.flip();
                return true;
            }
        }
        return false;
    }
}

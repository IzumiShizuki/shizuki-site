package g5;

import android.media.MediaCodec;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class m extends u4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7384a;

    public m(IllegalStateException illegalStateException, n nVar) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(nVar == null ? null : nVar.f7385a);
        super(sb.toString(), illegalStateException);
        boolean z10 = illegalStateException instanceof MediaCodec.CodecException;
        this.f7384a = c0.f16548a >= 23 ? z10 ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0 : c0.x(z10 ? ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo() : null);
    }
}

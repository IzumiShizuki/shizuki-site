package g5;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import b0.c1;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public interface k {
    void B();

    ByteBuffer E0(int i10);

    void N(int i10, long j10);

    int O();

    int W(MediaCodec.BufferInfo bufferInfo);

    void a();

    void c(Bundle bundle);

    void d(int i10, int i11, int i12, long j10);

    void e(int i10, u4.b bVar, long j10, int i11);

    void flush();

    void h(p5.h hVar, Handler handler);

    void i(int i10);

    boolean j0(c1 c1Var);

    void o0(int i10);

    MediaFormat x();

    ByteBuffer x0(int i10);

    void y0(Surface surface);
}

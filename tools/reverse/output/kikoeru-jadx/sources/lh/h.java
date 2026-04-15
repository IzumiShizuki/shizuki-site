package lh;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public interface h extends h0, ReadableByteChannel {
    String F(Charset charset);

    int K(w wVar);

    i N();

    boolean P(long j10);

    void a0(long j10);

    i j(long j10);

    byte readByte();

    int readInt();

    short readShort();

    f s();

    void skip(long j10);

    long w(a0 a0Var);

    String x(long j10);
}

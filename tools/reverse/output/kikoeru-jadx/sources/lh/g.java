package lh;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public interface g extends f0, WritableByteChannel {
    g E(String str);

    g J(i iVar);

    g b0(long j10);

    @Override // lh.f0, java.io.Flushable
    void flush();

    g write(byte[] bArr);

    g writeByte(int i10);

    g writeInt(int i10);

    g writeShort(int i10);
}

package lh;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public interface f0 extends Closeable, Flushable {
    void H(f fVar, long j10);

    j0 a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();
}

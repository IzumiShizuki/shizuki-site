package b8;

import android.database.sqlite.SQLiteProgram;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class h implements a8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f2260a;

    public h(SQLiteProgram sQLiteProgram) {
        l.e(sQLiteProgram, "delegate");
        this.f2260a = sQLiteProgram;
    }

    @Override // a8.c
    public final void Q(double d10, int i10) {
        this.f2260a.bindDouble(i10, d10);
    }

    @Override // a8.c
    public final void c(int i10, long j10) {
        this.f2260a.bindLong(i10, j10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2260a.close();
    }

    @Override // a8.c
    public final void d(byte[] bArr, int i10) {
        l.e(bArr, "value");
        this.f2260a.bindBlob(i10, bArr);
    }

    @Override // a8.c
    public final void e(int i10) {
        this.f2260a.bindNull(i10);
    }

    @Override // a8.c
    public final void m(int i10, String str) {
        l.e(str, "value");
        this.f2260a.bindString(i10, str);
    }
}

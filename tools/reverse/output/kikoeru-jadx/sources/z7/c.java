package z7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public interface c extends AutoCloseable {
    String M(int i10);

    int V();

    boolean Z();

    void c(int i10, long j10);

    void d(byte[] bArr, int i10);

    void e(int i10);

    byte[] getBlob(int i10);

    int getColumnCount();

    String getColumnName(int i10);

    long getLong(int i10);

    boolean isNull(int i10);

    void reset();

    void v(int i10, String str);

    boolean z();
}

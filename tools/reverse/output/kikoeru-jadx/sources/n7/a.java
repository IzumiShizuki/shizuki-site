package n7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements z7.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z7.c f15395a;

    public a(z7.c cVar) {
        jc.l.e(cVar, "delegate");
        this.f15395a = cVar;
    }

    @Override // z7.c
    public final String M(int i10) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // z7.c
    public final int V() {
        return this.f15395a.V();
    }

    @Override // z7.c
    public final boolean Z() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // z7.c
    public final void c(int i10, long j10) {
        this.f15395a.c(i10, j10);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // z7.c
    public final void d(byte[] bArr, int i10) {
        jc.l.e(bArr, "value");
        this.f15395a.d(bArr, i10);
    }

    @Override // z7.c
    public final void e(int i10) {
        this.f15395a.e(i10);
    }

    @Override // z7.c
    public final byte[] getBlob(int i10) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // z7.c
    public final int getColumnCount() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // z7.c
    public final String getColumnName(int i10) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // z7.c
    public final long getLong(int i10) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // z7.c
    public final boolean isNull(int i10) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // z7.c
    public final void reset() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // z7.c
    public final void v(int i10, String str) {
        jc.l.e(str, "value");
        this.f15395a.v(i10, str);
    }

    @Override // z7.c
    public final boolean z() {
        return this.f15395a.z();
    }
}

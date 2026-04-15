package ya;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w extends y {
    public static y f(int i10) {
        return i10 < 0 ? y.f26075b : i10 > 0 ? y.f26076c : y.f26074a;
    }

    @Override // ya.y
    public final y a(int i10, int i11) {
        return f(Integer.compare(i10, i11));
    }

    @Override // ya.y
    public final y b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // ya.y
    public final y c(boolean z10, boolean z11) {
        return f(Boolean.compare(z10, z11));
    }

    @Override // ya.y
    public final y d(boolean z10, boolean z11) {
        return f(Boolean.compare(z11, z10));
    }

    @Override // ya.y
    public final int e() {
        return 0;
    }
}

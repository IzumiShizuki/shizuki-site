package q;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        x0 x0Var = (x0) obj;
        x0 x0Var2 = (x0) obj2;
        return ud.b.j(Float.valueOf((x0Var.e() == 0.0f && (x0Var instanceof h1) && ((h1) x0Var).f17326l == null) ? -1.0f : x0Var.e()), Float.valueOf((x0Var2.e() == 0.0f && (x0Var2 instanceof h1) && ((h1) x0Var2).f17326l == null) ? -1.0f : x0Var2.e()));
    }
}

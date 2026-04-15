package jc;

import java.util.Collections;
import java.util.List;
import sc.b2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f10839a;

    static {
        a0 a0Var = null;
        try {
            a0Var = (a0) b2.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (a0Var == null) {
            a0Var = new a0();
        }
        f10839a = a0Var;
    }

    public static pc.v a(Class cls) {
        a0 a0Var = f10839a;
        return a0Var.j(a0Var.b(cls), Collections.EMPTY_LIST);
    }

    public static pc.v b(pc.y yVar) {
        a0 a0Var = f10839a;
        return a0Var.j(a0Var.b(List.class), Collections.singletonList(yVar));
    }
}

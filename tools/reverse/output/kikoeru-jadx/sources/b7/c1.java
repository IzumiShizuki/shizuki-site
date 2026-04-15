package b7;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c7.l0 f1666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c7.p1 f1667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c7.r0 f1668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f1669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f1670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bundle f1673h;

    public c1() {
        this.f1666a = null;
        this.f1667b = null;
        this.f1668c = null;
        this.f1669d = Collections.EMPTY_LIST;
        this.f1670e = null;
        this.f1671f = 0;
        this.f1672g = 0;
        this.f1673h = Bundle.EMPTY;
    }

    public c1(c7.l0 l0Var, c7.p1 p1Var, c7.r0 r0Var, List list, CharSequence charSequence, int i10, int i11, Bundle bundle) {
        this.f1666a = l0Var;
        this.f1667b = p1Var;
        this.f1668c = r0Var;
        list.getClass();
        this.f1669d = list;
        this.f1670e = charSequence;
        this.f1671f = i10;
        this.f1672g = i11;
        this.f1673h = bundle == null ? Bundle.EMPTY : bundle;
    }

    public c1(c1 c1Var) {
        this.f1666a = c1Var.f1666a;
        this.f1667b = c1Var.f1667b;
        this.f1668c = c1Var.f1668c;
        this.f1669d = c1Var.f1669d;
        this.f1670e = c1Var.f1670e;
        this.f1671f = c1Var.f1671f;
        this.f1672g = c1Var.f1672g;
        this.f1673h = c1Var.f1673h;
    }
}

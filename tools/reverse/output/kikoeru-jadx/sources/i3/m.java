package i3;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import i2.p1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f8988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.k f8989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n f8990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1.g f8991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f8992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ View f8993g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, ic.k kVar, x0.n nVar, g1.g gVar, int i10, View view) {
        super(0);
        this.f8988b = context;
        this.f8989c = kVar;
        this.f8990d = nVar;
        this.f8991e = gVar;
        this.f8992f = i10;
        this.f8993g = view;
    }

    @Override // ic.a
    public final Object b() {
        KeyEvent.Callback callback = this.f8993g;
        jc.l.c(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        return new q(this.f8988b, this.f8989c, this.f8990d, this.f8991e, this.f8992f, (p1) callback).getLayoutNode();
    }
}

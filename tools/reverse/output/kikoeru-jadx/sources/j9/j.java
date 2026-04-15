package j9;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f10707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u f10708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f10710h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u f10711i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10712j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u uVar, ac.c cVar) {
        super(cVar);
        this.f10711i = uVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f10710h = obj;
        this.f10712j |= Integer.MIN_VALUE;
        return this.f10711i.f(false, this);
    }
}

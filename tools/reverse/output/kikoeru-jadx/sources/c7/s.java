package c7;

import android.os.IBinder;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k1 f3722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f3723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f3724f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f0 f3725g;

    public s(f0 f0Var, String str, int i10, int i11, n nVar) {
        this.f3725g = f0Var;
        this.f3719a = str;
        this.f3720b = i10;
        this.f3721c = i11;
        this.f3722d = new k1(i10, i11, str);
        this.f3723e = nVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.f3725g.f3628g.post(new r(0, this));
    }
}

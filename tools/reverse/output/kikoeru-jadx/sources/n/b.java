package n;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f15225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f15226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15227c;

    public b(c cVar, c cVar2, int i10) {
        this.f15227c = i10;
        this.f15225a = cVar2;
        this.f15226b = cVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.f15225a == cVar && cVar == this.f15226b) {
            this.f15226b = null;
            this.f15225a = null;
        }
        c cVar3 = this.f15225a;
        if (cVar3 == cVar) {
            switch (this.f15227c) {
                case 0:
                    cVar2 = cVar3.f15231d;
                    break;
                default:
                    cVar2 = cVar3.f15230c;
                    break;
            }
            this.f15225a = cVar2;
        }
        c cVar4 = this.f15226b;
        if (cVar4 == cVar) {
            c cVar5 = this.f15225a;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.f15226b = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.f15227c) {
            case 0:
                return cVar.f15230c;
            default:
                return cVar.f15231d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15226b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f15226b;
        c cVar2 = this.f15225a;
        this.f15226b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}

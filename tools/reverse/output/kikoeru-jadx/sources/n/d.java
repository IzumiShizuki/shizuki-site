package n;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f15232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15233b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f15234c;

    public d(a aVar) {
        this.f15234c = aVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f15232a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f15231d;
            this.f15232a = cVar3;
            this.f15233b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f15233b) {
            return this.f15234c.f15220a != null;
        }
        c cVar = this.f15232a;
        return (cVar == null || cVar.f15230c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f15233b) {
            this.f15233b = false;
            this.f15232a = this.f15234c.f15220a;
        } else {
            c cVar = this.f15232a;
            this.f15232a = cVar != null ? cVar.f15230c : null;
        }
        return this.f15232a;
    }
}

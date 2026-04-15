package ce;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t extends AbstractList implements RandomAccess, u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m0 f3984b = new m0(new t());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3985a;

    public t() {
        this.f3985a = new ArrayList();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        this.f3985a.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f3985a.size(), collection);
    }

    @Override // ce.u
    public final void c(w wVar) {
        this.f3985a.add(wVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f3985a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // ce.u
    public final List d() {
        return Collections.unmodifiableList(this.f3985a);
    }

    @Override // ce.u
    public final e g(int i10) {
        e wVar;
        ArrayList arrayList = this.f3985a;
        Object obj = arrayList.get(i10);
        if (obj instanceof e) {
            wVar = (e) obj;
        } else if (obj instanceof String) {
            try {
                wVar = new w(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("UTF-8 not supported?", e10);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            wVar = new w(bArr2);
        }
        if (wVar != obj) {
            arrayList.set(i10, wVar);
        }
        return wVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        ArrayList arrayList = this.f3985a;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            String strT = eVar.t();
            if (eVar.n()) {
                arrayList.set(i10, strT);
            }
            return strT;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = r.f3963a;
        try {
            String str = new String(bArr, "UTF-8");
            if (f0.c(bArr, 0, bArr.length) == 0) {
                arrayList.set(i10, str);
            }
            return str;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    @Override // ce.u
    public final m0 h() {
        return new m0(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        Object objRemove = this.f3985a.remove(i10);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof e) {
            return ((e) objRemove).t();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = r.f3963a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        Object obj2 = this.f3985a.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof e) {
            return ((e) obj2).t();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = r.f3963a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3985a.size();
    }

    public t(u uVar) {
        this.f3985a = new ArrayList(uVar.size());
        addAll(uVar);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection instanceof u) {
            collection = ((u) collection).d();
        }
        boolean zAddAll = this.f3985a.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}

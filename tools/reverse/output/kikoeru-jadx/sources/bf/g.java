package bf;

import j2.h0;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2802b;

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i10 == 2 || i10 == 3) {
            objArr[1] = "iterator";
        } else if (i10 == 5 || i10 == 6 || i10 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int i10 = this.f2801a;
        if (i10 == 0) {
            this.f2802b = obj;
        } else if (i10 == 1) {
            this.f2802b = new Object[]{this.f2802b, obj};
        } else {
            Object[] objArr = (Object[]) this.f2802b;
            int length = objArr.length;
            if (i10 >= length) {
                int i11 = ((length * 3) / 2) + 1;
                int i12 = i10 + 1;
                if (i11 < i12) {
                    i11 = i12;
                }
                Object[] objArr2 = new Object[i11];
                this.f2802b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f2801a] = obj;
        }
        this.f2801a++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f2802b = null;
        this.f2801a = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f2801a)) {
            return i11 == 1 ? this.f2802b : ((Object[]) this.f2802b)[i10];
        }
        StringBuilder sbO = h0.o(i10, "Index: ", ", Size: ");
        sbO.append(this.f2801a);
        throw new IndexOutOfBoundsException(sbO.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        int i10 = this.f2801a;
        if (i10 == 0) {
            return e.f2797a;
        }
        if (i10 == 1) {
            return new f(this);
        }
        Iterator it = super.iterator();
        if (it != null) {
            return it;
        }
        a(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        Object obj;
        if (i10 < 0 || i10 >= (i11 = this.f2801a)) {
            StringBuilder sbO = h0.o(i10, "Index: ", ", Size: ");
            sbO.append(this.f2801a);
            throw new IndexOutOfBoundsException(sbO.toString());
        }
        if (i11 == 1) {
            obj = this.f2802b;
            this.f2802b = null;
        } else {
            Object[] objArr = (Object[]) this.f2802b;
            Object obj2 = objArr[i10];
            if (i11 == 2) {
                this.f2802b = objArr[1 - i10];
            } else {
                int i12 = (i11 - i10) - 1;
                if (i12 > 0) {
                    System.arraycopy(objArr, i10 + 1, objArr, i10, i12);
                }
                objArr[this.f2801a - 1] = null;
            }
            obj = obj2;
        }
        this.f2801a--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f2801a)) {
            StringBuilder sbO = h0.o(i10, "Index: ", ", Size: ");
            sbO.append(this.f2801a);
            throw new IndexOutOfBoundsException(sbO.toString());
        }
        if (i11 == 1) {
            Object obj2 = this.f2802b;
            this.f2802b = obj;
            return obj2;
        }
        Object[] objArr = (Object[]) this.f2802b;
        Object obj3 = objArr[i10];
        objArr[i10] = obj;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2801a;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        int i10 = this.f2801a;
        if (i10 >= 2) {
            Arrays.sort((Object[]) this.f2802b, 0, i10, comparator);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            a(4);
            throw null;
        }
        int length = objArr.length;
        int i10 = this.f2801a;
        if (i10 == 1) {
            if (length == 0) {
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                objArr2[0] = this.f2802b;
                return objArr2;
            }
            objArr[0] = this.f2802b;
        } else {
            if (length < i10) {
                Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.f2802b, i10, objArr.getClass());
                if (objArrCopyOf != null) {
                    return objArrCopyOf;
                }
                a(6);
                throw null;
            }
            if (i10 != 0) {
                System.arraycopy(this.f2802b, 0, objArr, 0, i10);
            }
        }
        int i11 = this.f2801a;
        if (length > i11) {
            objArr[i11] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        if (i10 >= 0 && i10 <= (i11 = this.f2801a)) {
            if (i11 == 0) {
                this.f2802b = obj;
            } else if (i11 == 1 && i10 == 0) {
                this.f2802b = new Object[]{obj, this.f2802b};
            } else {
                Object[] objArr = new Object[i11 + 1];
                if (i11 == 1) {
                    objArr[0] = this.f2802b;
                } else {
                    Object[] objArr2 = (Object[]) this.f2802b;
                    System.arraycopy(objArr2, 0, objArr, 0, i10);
                    System.arraycopy(objArr2, i10, objArr, i10 + 1, this.f2801a - i10);
                }
                objArr[i10] = obj;
                this.f2802b = objArr;
            }
            this.f2801a++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbO = h0.o(i10, "Index: ", ", Size: ");
        sbO.append(this.f2801a);
        throw new IndexOutOfBoundsException(sbO.toString());
    }
}

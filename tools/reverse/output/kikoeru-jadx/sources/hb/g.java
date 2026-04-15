package hb;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends eb.z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f8311c = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f8312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8313b;

    public g() {
        ArrayList arrayList = new ArrayList();
        this.f8313b = arrayList;
        this.f8312a = f.f8310a;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (gb.h.f7479a >= 9) {
            arrayList.add(new SimpleDateFormat(j2.h0.k("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    @Override // eb.z
    public final Object a(mb.a aVar) throws IOException {
        Date dateB;
        if (aVar.h0() == 9) {
            aVar.c0();
            return null;
        }
        String strF0 = aVar.f0();
        synchronized (this.f8313b) {
            try {
                Iterator it = this.f8313b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            dateB = ib.a.b(strF0, new ParsePosition(0));
                            break;
                        } catch (ParseException e10) {
                            StringBuilder sbK = a0.c.K("Failed parsing '", strF0, "' as Date; at path ");
                            sbK.append(aVar.u(true));
                            throw new eb.t(sbK.toString(), e10);
                        }
                    }
                    DateFormat dateFormat = (DateFormat) it.next();
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            dateB = dateFormat.parse(strF0);
                            break;
                        } finally {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f8312a.getClass();
        return dateB;
    }

    @Override // eb.z
    public final void b(mb.b bVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bVar.y();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f8313b.get(0);
        synchronized (this.f8313b) {
            str = dateFormat.format(date);
        }
        bVar.Y(str);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f8313b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}

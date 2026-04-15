package kb;

import eb.a0;
import eb.m;
import eb.t;
import eb.z;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0000a f11316b = new C0000a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f11317a;

    /* JADX INFO: renamed from: kb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
    public class C0000a implements a0 {
        @Override // eb.a0
        public final z a(m mVar, lb.a aVar) {
            if (aVar.f12165a == Date.class) {
                return new a(0);
            }
            return null;
        }
    }

    public /* synthetic */ a(int i10) {
        this();
    }

    @Override // eb.z
    public final Object a(mb.a aVar) throws IOException {
        Date date;
        if (aVar.h0() == 9) {
            aVar.c0();
            return null;
        }
        String strF0 = aVar.f0();
        synchronized (this) {
            TimeZone timeZone = this.f11317a.getTimeZone();
            try {
                try {
                    date = new Date(this.f11317a.parse(strF0).getTime());
                } catch (ParseException e10) {
                    throw new t("Failed parsing '" + strF0 + "' as SQL Date; at path " + aVar.u(true), e10);
                }
            } finally {
                this.f11317a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // eb.z
    public final void b(mb.b bVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bVar.y();
            return;
        }
        synchronized (this) {
            str = this.f11317a.format((java.util.Date) date);
        }
        bVar.Y(str);
    }

    private a() {
        this.f11317a = new SimpleDateFormat("MMM d, yyyy");
    }
}

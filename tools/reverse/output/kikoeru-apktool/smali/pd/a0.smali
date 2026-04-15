.class public final Lpd/a0;
.super Ljava/lang/Object;

# interfaces
.implements Lbf/b;


# static fields
.field public static final a:Lpd/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lpd/a0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lpd/a0;->a:Lpd/a0;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final d(Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 2

    .line 1
    check-cast p1, Lyc/e;

    .line 2
    .line 3
    sget v0, Lpd/c0;->p:I

    .line 4
    .line 5
    invoke-interface {p1}, Lyc/h;->Q()Lse/k0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Lse/k0;->i()Ljava/util/Collection;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string v0, "getSupertypes(...)"

    .line 14
    .line 15
    invoke-static {p1, v0}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    check-cast p1, Ljava/lang/Iterable;

    .line 19
    .line 20
    invoke-static {p1}, Lvb/m;->R(Ljava/lang/Iterable;)Ldf/n;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    sget-object v0, Lpd/l;->f:Lpd/l;

    .line 25
    .line 26
    invoke-static {p1, v0}, Ldf/m;->f0(Ldf/k;Lic/k;)Ldf/h;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance v0, Ldf/o;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-direct {v0, v1, p1}, Ldf/o;-><init>(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

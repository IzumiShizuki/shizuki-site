.class public final Lwf/a2;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lsf/a;


# static fields
.field public static final a:Lwf/a2;

.field public static final b:Lwf/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lwf/a2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lwf/a2;->a:Lwf/a2;

    .line 7
    .line 8
    const-string v0, "kotlin.UShort"

    .line 9
    .line 10
    sget-object v1, Lwf/m1;->a:Lwf/m1;

    .line 11
    .line 12
    invoke-static {v0, v1}, Lwf/z0;->a(Ljava/lang/String;Lsf/a;)Lwf/f0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Lwf/a2;->b:Lwf/f0;

    .line 17
    .line 18
    return-void
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
.method public final a()Luf/g;
    .locals 1

    .line 1
    sget-object v0, Lwf/a2;->b:Lwf/f0;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
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

.method public final b(Lvf/b;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lwf/a2;->b:Lwf/f0;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lvf/b;->f(Luf/g;)Lvf/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p1}, Lvf/b;->A()S

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    new-instance v0, Lub/y;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lub/y;-><init>(S)V

    .line 14
    .line 15
    .line 16
    return-object v0
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final d(Lyf/t;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p2, Lub/y;

    .line 2
    .line 3
    iget-short p2, p2, Lub/y;->a:S

    .line 4
    .line 5
    sget-object v0, Lwf/a2;->b:Lwf/f0;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lyf/t;->j(Luf/g;)Lyf/t;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1, p2}, Lyf/t;->t(S)V

    .line 12
    .line 13
    .line 14
    return-void
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

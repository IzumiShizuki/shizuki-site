.class public final Lxf/o;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lsf/a;


# static fields
.field public static final a:Lxf/o;

.field public static final b:Luf/h;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lxf/o;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxf/o;->a:Lxf/o;

    .line 7
    .line 8
    sget-object v0, Luf/c;->c:Luf/c;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    new-array v1, v1, [Luf/g;

    .line 12
    .line 13
    new-instance v2, Lt9/c;

    .line 14
    .line 15
    const/16 v3, 0x13

    .line 16
    .line 17
    invoke-direct {v2, v3}, Lt9/c;-><init>(I)V

    .line 18
    .line 19
    .line 20
    const-string v3, "kotlinx.serialization.json.JsonElement"

    .line 21
    .line 22
    invoke-static {v3, v0, v1, v2}, Lud/e;->f(Ljava/lang/String;Lud/n;[Luf/g;Lic/k;)Luf/h;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Lxf/o;->b:Luf/h;

    .line 27
    .line 28
    return-void
    .line 29
.end method


# virtual methods
.method public final a()Luf/g;
    .locals 1

    .line 1
    sget-object v0, Lxf/o;->b:Luf/h;

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
    .locals 0

    .line 1
    invoke-static {p1}, Lua/j;->e(Lvf/b;)Lxf/k;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Lxf/k;->l()Lxf/m;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
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
    check-cast p2, Lxf/m;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lua/j;->d(Lyf/t;)V

    .line 9
    .line 10
    .line 11
    instance-of v0, p2, Lxf/c0;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Lxf/d0;->a:Lxf/d0;

    .line 16
    .line 17
    invoke-virtual {p1, v0, p2}, Lyf/t;->s(Lsf/a;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    instance-of v0, p2, Lxf/y;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    sget-object v0, Lxf/a0;->a:Lxf/a0;

    .line 26
    .line 27
    invoke-virtual {p1, v0, p2}, Lyf/t;->s(Lsf/a;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    instance-of v0, p2, Lxf/e;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    sget-object v0, Lxf/g;->a:Lxf/g;

    .line 36
    .line 37
    invoke-virtual {p1, v0, p2}, Lyf/t;->s(Lsf/a;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    new-instance p1, Lce/j0;

    .line 42
    .line 43
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 44
    .line 45
    .line 46
    throw p1
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

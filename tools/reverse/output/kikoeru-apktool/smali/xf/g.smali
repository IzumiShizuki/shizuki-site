.class public final Lxf/g;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lsf/a;


# static fields
.field public static final a:Lxf/g;

.field public static final b:Lxf/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lxf/g;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxf/g;->a:Lxf/g;

    .line 7
    .line 8
    sget-object v0, Lxf/f;->b:Lxf/f;

    .line 9
    .line 10
    sput-object v0, Lxf/g;->b:Lxf/f;

    .line 11
    .line 12
    return-void
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
.method public final a()Luf/g;
    .locals 1

    .line 1
    sget-object v0, Lxf/g;->b:Lxf/f;

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
    .locals 4

    .line 1
    invoke-static {p1}, Lua/j;->e(Lvf/b;)Lxf/k;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lxf/e;

    .line 5
    .line 6
    sget-object v1, Lxf/o;->a:Lxf/o;

    .line 7
    .line 8
    new-instance v2, Lwf/d;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v2, v1, v3}, Lwf/d;-><init>(Lsf/a;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, p1}, Lwf/a;->b(Lvf/b;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/util/List;

    .line 19
    .line 20
    invoke-direct {v0, p1}, Lxf/e;-><init>(Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    return-object v0
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
    .locals 3

    .line 1
    check-cast p2, Lxf/e;

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
    sget-object v0, Lxf/o;->a:Lxf/o;

    .line 12
    .line 13
    new-instance v1, Lwf/d;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v1, v0, v2}, Lwf/d;-><init>(Lsf/a;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p1, p2}, Lwf/r;->d(Lyf/t;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
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

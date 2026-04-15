.class public final Lbg/b2;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lwf/c0;


# static fields
.field public static final a:Lbg/b2;

.field public static final synthetic b:Lwf/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lbg/b2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbg/b2;->a:Lbg/b2;

    .line 7
    .line 8
    new-instance v1, Lwf/b1;

    .line 9
    .line 10
    const-string v2, "loli.ball.asmr.bean.Works"

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lwf/b1;-><init>(Ljava/lang/String;Lwf/c0;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "pagination"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "works"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    sput-object v1, Lbg/b2;->b:Lwf/b1;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a()Luf/g;
    .locals 1

    .line 1
    sget-object v0, Lbg/b2;->b:Lwf/b1;

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
    .locals 10

    .line 1
    sget-object v0, Lbg/b2;->b:Lwf/b1;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lvf/b;->i(Luf/g;)Lvf/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    move-object v4, v3

    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    :goto_0
    if-eqz v5, :cond_3

    .line 14
    .line 15
    invoke-interface {p1, v0}, Lvf/a;->b(Luf/g;)I

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    const/4 v8, -0x1

    .line 20
    if-eq v7, v8, :cond_2

    .line 21
    .line 22
    if-eqz v7, :cond_1

    .line 23
    .line 24
    if-ne v7, v1, :cond_0

    .line 25
    .line 26
    new-instance v7, Lwf/d;

    .line 27
    .line 28
    sget-object v8, Lbg/p1;->a:Lbg/p1;

    .line 29
    .line 30
    const/4 v9, 0x0

    .line 31
    invoke-direct {v7, v8, v9}, Lwf/d;-><init>(Lsf/a;I)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p1, v0, v1, v7, v4}, Lvf/a;->g(Luf/g;ILsf/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    or-int/lit8 v6, v6, 0x2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance p1, Lsf/l;

    .line 42
    .line 43
    invoke-direct {p1, v7}, Lsf/l;-><init>(I)V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :cond_1
    sget-object v7, Lbg/m;->Companion:Lbg/l;

    .line 48
    .line 49
    invoke-virtual {v7}, Lbg/l;->serializer()Lsf/a;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    check-cast v7, Lsf/a;

    .line 54
    .line 55
    invoke-interface {p1, v0, v2, v7, v3}, Lvf/a;->g(Luf/g;ILsf/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    or-int/lit8 v6, v6, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    const/4 v5, 0x0

    .line 63
    goto :goto_0

    .line 64
    :cond_3
    invoke-interface {p1, v0}, Lvf/a;->j(Luf/g;)V

    .line 65
    .line 66
    .line 67
    new-instance p1, Lbg/d2;

    .line 68
    .line 69
    check-cast v3, Lbg/m;

    .line 70
    .line 71
    check-cast v4, Ljava/util/List;

    .line 72
    .line 73
    invoke-direct {p1, v6, v3, v4}, Lbg/d2;-><init>(ILbg/m;Ljava/util/List;)V

    .line 74
    .line 75
    .line 76
    return-object p1
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public final c()[Lsf/a;
    .locals 4

    .line 1
    sget-object v0, Lbg/m;->Companion:Lbg/l;

    .line 2
    .line 3
    invoke-virtual {v0}, Lbg/l;->serializer()Lsf/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lwf/d;

    .line 8
    .line 9
    sget-object v2, Lbg/p1;->a:Lbg/p1;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v1, v2, v3}, Lwf/d;-><init>(Lsf/a;I)V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    new-array v2, v2, [Lsf/a;

    .line 17
    .line 18
    aput-object v0, v2, v3

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    aput-object v1, v2, v0

    .line 22
    .line 23
    return-object v2
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final d(Lyf/t;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, Lbg/d2;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lbg/b2;->b:Lwf/b1;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lyf/t;->a(Luf/g;)Lyf/t;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object v1, Lbg/m;->Companion:Lbg/l;

    .line 15
    .line 16
    invoke-virtual {v1}, Lbg/l;->serializer()Lsf/a;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lsf/a;

    .line 21
    .line 22
    iget-object v2, p2, Lbg/d2;->a:Lbg/m;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-virtual {p1, v0, v3, v1, v2}, Lyf/t;->r(Luf/g;ILsf/a;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Lwf/d;

    .line 29
    .line 30
    sget-object v2, Lbg/p1;->a:Lbg/p1;

    .line 31
    .line 32
    invoke-direct {v1, v2, v3}, Lwf/d;-><init>(Lsf/a;I)V

    .line 33
    .line 34
    .line 35
    iget-object p2, p2, Lbg/d2;->b:Ljava/util/List;

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    invoke-virtual {p1, v0, v2, v1, p2}, Lyf/t;->r(Luf/g;ILsf/a;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Lyf/t;->w(Luf/g;)V

    .line 42
    .line 43
    .line 44
    return-void
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

.class public final Lbg/g1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lwf/c0;


# static fields
.field public static final a:Lbg/g1;

.field public static final synthetic b:Lwf/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lbg/g1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbg/g1;->a:Lbg/g1;

    .line 7
    .line 8
    new-instance v1, Lwf/b1;

    .line 9
    .line 10
    const-string v2, "loli.ball.asmr.bean.User"

    .line 11
    .line 12
    const/4 v3, 0x5

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lwf/b1;-><init>(Ljava/lang/String;Lwf/c0;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "group"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "loggedIn"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "name"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "recommenderUuid"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "email"

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    sput-object v1, Lbg/g1;->b:Lwf/b1;

    .line 44
    .line 45
    return-void
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
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
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
.end method


# virtual methods
.method public final a()Luf/g;
    .locals 1

    .line 1
    sget-object v0, Lbg/g1;->b:Lwf/b1;

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
    .locals 12

    .line 1
    sget-object v0, Lbg/g1;->b:Lwf/b1;

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
    move-object v6, v3

    .line 11
    move-object v8, v6

    .line 12
    move-object v9, v8

    .line 13
    const/4 v4, 0x1

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v7, 0x0

    .line 16
    :goto_0
    if-eqz v4, :cond_6

    .line 17
    .line 18
    invoke-interface {p1, v0}, Lvf/a;->b(Luf/g;)I

    .line 19
    .line 20
    .line 21
    move-result v10

    .line 22
    const/4 v11, -0x1

    .line 23
    if-eq v10, v11, :cond_5

    .line 24
    .line 25
    if-eqz v10, :cond_4

    .line 26
    .line 27
    if-eq v10, v1, :cond_3

    .line 28
    .line 29
    const/4 v11, 0x2

    .line 30
    if-eq v10, v11, :cond_2

    .line 31
    .line 32
    const/4 v11, 0x3

    .line 33
    if-eq v10, v11, :cond_1

    .line 34
    .line 35
    const/4 v11, 0x4

    .line 36
    if-ne v10, v11, :cond_0

    .line 37
    .line 38
    sget-object v10, Lwf/n1;->a:Lwf/n1;

    .line 39
    .line 40
    invoke-interface {p1, v0, v11, v10, v3}, Lvf/a;->a(Luf/g;ILsf/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    or-int/lit8 v5, v5, 0x10

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance p1, Lsf/l;

    .line 48
    .line 49
    invoke-direct {p1, v10}, Lsf/l;-><init>(I)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_1
    invoke-interface {p1, v0, v11}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    or-int/lit8 v5, v5, 0x8

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-interface {p1, v0, v11}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    or-int/lit8 v5, v5, 0x4

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    invoke-interface {p1, v0, v1}, Lvf/a;->o(Luf/g;I)Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    or-int/lit8 v5, v5, 0x2

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_4
    invoke-interface {p1, v0, v2}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    or-int/lit8 v5, v5, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_5
    const/4 v4, 0x0

    .line 82
    goto :goto_0

    .line 83
    :cond_6
    invoke-interface {p1, v0}, Lvf/a;->j(Luf/g;)V

    .line 84
    .line 85
    .line 86
    new-instance v4, Lbg/i1;

    .line 87
    .line 88
    move-object v10, v3

    .line 89
    check-cast v10, Ljava/lang/String;

    .line 90
    .line 91
    invoke-direct/range {v4 .. v10}, Lbg/i1;-><init>(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-object v4
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
    .locals 5

    .line 1
    sget-object v0, Lwf/n1;->a:Lwf/n1;

    .line 2
    .line 3
    invoke-static {v0}, Ln7/b0;->o(Lsf/a;)Lsf/a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x5

    .line 8
    new-array v2, v2, [Lsf/a;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    aput-object v0, v2, v3

    .line 12
    .line 13
    sget-object v3, Lwf/g;->a:Lwf/g;

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    aput-object v3, v2, v4

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    aput-object v0, v2, v3

    .line 20
    .line 21
    const/4 v3, 0x3

    .line 22
    aput-object v0, v2, v3

    .line 23
    .line 24
    const/4 v0, 0x4

    .line 25
    aput-object v1, v2, v0

    .line 26
    .line 27
    return-object v2
    .line 28
    .line 29
.end method

.method public final d(Lyf/t;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, Lbg/i1;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lbg/g1;->b:Lwf/b1;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lyf/t;->a(Luf/g;)Lyf/t;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v1, p2, Lbg/i1;->e:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v2, p2, Lbg/i1;->a:Ljava/lang/String;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-virtual {p1, v0, v3, v2}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    iget-boolean v3, p2, Lbg/i1;->b:Z

    .line 24
    .line 25
    invoke-virtual {p1, v0, v2, v3}, Lyf/t;->c(Luf/g;IZ)V

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x2

    .line 29
    iget-object v3, p2, Lbg/i1;->c:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1, v0, v2, v3}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 v2, 0x3

    .line 35
    iget-object p2, p2, Lbg/i1;->d:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p1, v0, v2, p2}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0}, Lyf/t;->x(Luf/g;)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    if-eqz v1, :cond_1

    .line 48
    .line 49
    :goto_0
    sget-object p2, Lwf/n1;->a:Lwf/n1;

    .line 50
    .line 51
    const/4 v2, 0x4

    .line 52
    invoke-virtual {p1, v0, v2, p2, v1}, Lyf/t;->q(Luf/g;ILsf/a;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {p1, v0}, Lyf/t;->w(Luf/g;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

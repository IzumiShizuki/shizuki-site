.class public final synthetic Loa/a;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lwf/c0;


# static fields
.field public static final a:Loa/a;

.field private static final descriptor:Luf/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Loa/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Loa/a;->a:Loa/a;

    .line 7
    .line 8
    new-instance v1, Lwf/b1;

    .line 9
    .line 10
    const-string v2, "com.cnl.kikoeru.utils.translate.DeepLAPITranslate.RequestBody"

    .line 11
    .line 12
    const/4 v3, 0x3

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lwf/b1;-><init>(Ljava/lang/String;Lwf/c0;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "text"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "target_lang"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "source_lang"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    sput-object v1, Loa/a;->descriptor:Luf/g;

    .line 33
    .line 34
    return-void
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
    sget-object v0, Loa/a;->descriptor:Luf/g;

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
    .locals 11

    .line 1
    sget-object v0, Loa/a;->descriptor:Luf/g;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lvf/b;->i(Luf/g;)Lvf/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v1, Loa/c;->d:[Lub/h;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    move-object v5, v4

    .line 13
    move-object v6, v5

    .line 14
    const/4 v7, 0x1

    .line 15
    const/4 v8, 0x0

    .line 16
    :goto_0
    if-eqz v7, :cond_4

    .line 17
    .line 18
    invoke-interface {p1, v0}, Lvf/a;->b(Luf/g;)I

    .line 19
    .line 20
    .line 21
    move-result v9

    .line 22
    const/4 v10, -0x1

    .line 23
    if-eq v9, v10, :cond_3

    .line 24
    .line 25
    if-eqz v9, :cond_2

    .line 26
    .line 27
    if-eq v9, v2, :cond_1

    .line 28
    .line 29
    const/4 v6, 0x2

    .line 30
    if-ne v9, v6, :cond_0

    .line 31
    .line 32
    invoke-interface {p1, v0, v6}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    or-int/lit8 v8, v8, 0x4

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance p1, Lsf/l;

    .line 40
    .line 41
    invoke-direct {p1, v9}, Lsf/l;-><init>(I)V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_1
    invoke-interface {p1, v0, v2}, Lvf/a;->q(Luf/g;I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    or-int/lit8 v8, v8, 0x2

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    aget-object v9, v1, v3

    .line 53
    .line 54
    invoke-interface {v9}, Lub/h;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    check-cast v9, Lsf/a;

    .line 59
    .line 60
    invoke-interface {p1, v0, v3, v9, v4}, Lvf/a;->g(Luf/g;ILsf/a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    check-cast v4, Ljava/util/List;

    .line 65
    .line 66
    or-int/lit8 v8, v8, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    const/4 v7, 0x0

    .line 70
    goto :goto_0

    .line 71
    :cond_4
    invoke-interface {p1, v0}, Lvf/a;->j(Luf/g;)V

    .line 72
    .line 73
    .line 74
    new-instance p1, Loa/c;

    .line 75
    .line 76
    invoke-direct {p1, v8, v4, v5, v6}, Loa/c;-><init>(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-object p1
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
    .locals 3

    .line 1
    sget-object v0, Loa/c;->d:[Lub/h;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    new-array v1, v1, [Lsf/a;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aget-object v0, v0, v2

    .line 8
    .line 9
    invoke-interface {v0}, Lub/h;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    aput-object v0, v1, v2

    .line 14
    .line 15
    sget-object v0, Lwf/n1;->a:Lwf/n1;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    aput-object v0, v1, v2

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    aput-object v0, v1, v2

    .line 22
    .line 23
    return-object v1
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
    check-cast p2, Loa/c;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Loa/a;->descriptor:Luf/g;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lyf/t;->a(Luf/g;)Lyf/t;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object v1, Loa/c;->d:[Lub/h;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    aget-object v1, v1, v2

    .line 18
    .line 19
    invoke-interface {v1}, Lub/h;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lsf/a;

    .line 24
    .line 25
    iget-object v3, p2, Loa/c;->a:Ljava/util/List;

    .line 26
    .line 27
    invoke-virtual {p1, v0, v2, v1, v3}, Lyf/t;->r(Luf/g;ILsf/a;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    iget-object v2, p2, Loa/c;->b:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p1, v0, v1, v2}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 v1, 0x2

    .line 37
    iget-object p2, p2, Loa/c;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p1, v0, v1, p2}, Lyf/t;->v(Luf/g;ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0}, Lyf/t;->w(Luf/g;)V

    .line 43
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
.end method

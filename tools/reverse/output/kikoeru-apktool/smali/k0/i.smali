.class public final Lk0/i;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lh0/c1;


# instance fields
.field public a:J

.field public b:J

.field public final synthetic c:Lk0/g;

.field public final synthetic d:Ll0/y0;

.field public final synthetic e:J


# direct methods
.method public constructor <init>(Lk0/g;Ll0/y0;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk0/i;->c:Lk0/g;

    .line 5
    .line 6
    iput-object p2, p0, Lk0/i;->d:Ll0/y0;

    .line 7
    .line 8
    iput-wide p3, p0, Lk0/i;->e:J

    .line 9
    .line 10
    const-wide/16 p1, 0x0

    .line 11
    .line 12
    iput-wide p1, p0, Lk0/i;->a:J

    .line 13
    .line 14
    iput-wide p1, p0, Lk0/i;->b:J

    .line 15
    .line 16
    return-void
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method


# virtual methods
.method public final a(J)V
    .locals 6

    .line 1
    iget-object v0, p0, Lk0/i;->c:Lk0/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/g;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lg2/c0;

    .line 8
    .line 9
    iget-object v1, p0, Lk0/i;->d:Ll0/y0;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-interface {v0}, Lg2/c0;->h()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-object v2, Ll0/t;->e:Ll0/s;

    .line 21
    .line 22
    move-object v3, v1

    .line 23
    check-cast v3, Ll0/a1;

    .line 24
    .line 25
    iget-object v3, v3, Ll0/a1;->f:Lk1/o;

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 30
    .line 31
    new-instance v5, Lp1/b;

    .line 32
    .line 33
    invoke-direct {v5, p1, p2}, Lp1/b;-><init>(J)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v4, v0, v5, v2}, Lk1/o;->l(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_1
    iput-wide p1, p0, Lk0/i;->a:J

    .line 40
    .line 41
    :cond_2
    iget-wide p1, p0, Lk0/i;->e:J

    .line 42
    .line 43
    invoke-static {v1, p1, p2}, Ll0/b1;->a(Ll0/y0;J)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-nez p1, :cond_3

    .line 48
    .line 49
    :goto_0
    return-void

    .line 50
    :cond_3
    const-wide/16 p1, 0x0

    .line 51
    .line 52
    iput-wide p1, p0, Lk0/i;->b:J

    .line 53
    .line 54
    return-void
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-wide v0, p0, Lk0/i;->e:J

    .line 2
    .line 3
    iget-object v2, p0, Lk0/i;->d:Ll0/y0;

    .line 4
    .line 5
    invoke-static {v2, v0, v1}, Ll0/b1;->a(Ll0/y0;J)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast v2, Ll0/a1;

    .line 12
    .line 13
    iget-object v0, v2, Ll0/a1;->h:Ll0/x;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ll0/x;->b()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
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

.method public final c()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public final d()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public final e(J)V
    .locals 9

    .line 1
    iget-object v0, p0, Lk0/i;->c:Lk0/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/g;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v2, v0

    .line 8
    check-cast v2, Lg2/c0;

    .line 9
    .line 10
    if-eqz v2, :cond_2

    .line 11
    .line 12
    invoke-interface {v2}, Lg2/c0;->h()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lk0/i;->d:Ll0/y0;

    .line 20
    .line 21
    iget-wide v3, p0, Lk0/i;->e:J

    .line 22
    .line 23
    invoke-static {v0, v3, v4}, Ll0/b1;->a(Ll0/y0;J)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-wide v3, p0, Lk0/i;->b:J

    .line 31
    .line 32
    invoke-static {v3, v4, p1, p2}, Lp1/b;->i(JJ)J

    .line 33
    .line 34
    .line 35
    move-result-wide p1

    .line 36
    iput-wide p1, p0, Lk0/i;->b:J

    .line 37
    .line 38
    iget-wide v3, p0, Lk0/i;->a:J

    .line 39
    .line 40
    invoke-static {v3, v4, p1, p2}, Lp1/b;->i(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide v3

    .line 44
    iget-wide v5, p0, Lk0/i;->a:J

    .line 45
    .line 46
    sget-object v7, Ll0/t;->e:Ll0/s;

    .line 47
    .line 48
    const/4 v8, 0x1

    .line 49
    move-object v1, v0

    .line 50
    check-cast v1, Ll0/a1;

    .line 51
    .line 52
    invoke-virtual/range {v1 .. v8}, Ll0/a1;->b(Lg2/c0;JJLl0/s;Z)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    iput-wide v3, p0, Lk0/i;->a:J

    .line 59
    .line 60
    const-wide/16 p1, 0x0

    .line 61
    .line 62
    iput-wide p1, p0, Lk0/i;->b:J

    .line 63
    .line 64
    :cond_2
    :goto_0
    return-void
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public final onCancel()V
    .locals 3

    .line 1
    iget-wide v0, p0, Lk0/i;->e:J

    .line 2
    .line 3
    iget-object v2, p0, Lk0/i;->d:Ll0/y0;

    .line 4
    .line 5
    invoke-static {v2, v0, v1}, Ll0/b1;->a(Ll0/y0;J)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast v2, Ll0/a1;

    .line 12
    .line 13
    iget-object v0, v2, Ll0/a1;->h:Ll0/x;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ll0/x;->b()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
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

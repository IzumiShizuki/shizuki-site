.class public final Li2/d1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Li2/j0;

.field public final b:Li2/c1;

.field public final c:Li2/u;

.field public d:Li2/g1;

.field public final e:Li2/a2;

.field public f:Lj1/p;

.field public g:Lz0/e;

.field public h:Lz0/e;

.field public final i:Lz0/e;

.field public j:Lb7/d4;


# direct methods
.method public constructor <init>(Li2/j0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li2/d1;->a:Li2/j0;

    .line 5
    .line 6
    new-instance v0, Li2/c1;

    .line 7
    .line 8
    invoke-direct {v0}, Lj1/p;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v1, -0x1

    .line 12
    iput v1, v0, Lj1/p;->d:I

    .line 13
    .line 14
    iput-object v0, p0, Li2/d1;->b:Li2/c1;

    .line 15
    .line 16
    new-instance v0, Li2/u;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Li2/u;-><init>(Li2/j0;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Li2/d1;->c:Li2/u;

    .line 22
    .line 23
    iput-object v0, p0, Li2/d1;->d:Li2/g1;

    .line 24
    .line 25
    iget-object p1, v0, Li2/u;->R:Li2/a2;

    .line 26
    .line 27
    iput-object p1, p0, Li2/d1;->e:Li2/a2;

    .line 28
    .line 29
    iput-object p1, p0, Li2/d1;->f:Lj1/p;

    .line 30
    .line 31
    new-instance p1, Lz0/e;

    .line 32
    .line 33
    const/16 v0, 0x10

    .line 34
    .line 35
    new-array v0, v0, [Lj1/q;

    .line 36
    .line 37
    invoke-direct {p1, v0}, Lz0/e;-><init>([Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Li2/d1;->i:Lz0/e;

    .line 41
    .line 42
    return-void
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
.end method

.method public static final a(Li2/d1;Lj1/p;Li2/g1;)V
    .locals 1

    .line 1
    iget-object p1, p1, Lj1/p;->e:Lj1/p;

    .line 2
    .line 3
    :goto_0
    if-eqz p1, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Li2/d1;->b:Li2/c1;

    .line 6
    .line 7
    if-ne p1, v0, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Li2/d1;->a:Li2/j0;

    .line 10
    .line 11
    invoke-virtual {p1}, Li2/j0;->v()Li2/j0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p1, Li2/j0;->F:Li2/d1;

    .line 18
    .line 19
    iget-object p1, p1, Li2/d1;->c:Li2/u;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    :goto_1
    iput-object p1, p2, Li2/g1;->s:Li2/g1;

    .line 24
    .line 25
    iput-object p2, p0, Li2/d1;->d:Li2/g1;

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    iget v0, p1, Lj1/p;->c:I

    .line 29
    .line 30
    and-int/lit8 v0, v0, 0x2

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_2
    invoke-virtual {p1, p2}, Lj1/p;->A0(Li2/g1;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p1, Lj1/p;->e:Lj1/p;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_3
    :goto_2
    return-void
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

.method public static b(Lj1/o;Lj1/p;)Lj1/p;
    .locals 2

    .line 1
    instance-of v0, p0, Li2/a1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Li2/a1;

    .line 6
    .line 7
    invoke-virtual {p0}, Li2/a1;->h()Lj1/p;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Li2/h1;->f(Lj1/p;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p0, Lj1/p;->c:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, Li2/c;

    .line 19
    .line 20
    invoke-direct {v0}, Lj1/p;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-static {p0}, Li2/h1;->d(Lj1/o;)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iput v1, v0, Lj1/p;->c:I

    .line 28
    .line 29
    iput-object p0, v0, Li2/c;->o:Lj1/o;

    .line 30
    .line 31
    new-instance p0, Ljava/util/HashSet;

    .line 32
    .line 33
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p0, v0, Li2/c;->q:Ljava/util/HashSet;

    .line 37
    .line 38
    move-object p0, v0

    .line 39
    :goto_0
    iget-boolean v0, p0, Lj1/p;->n:Z

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    const-string v0, "A ModifierNodeElement cannot return an already attached node from create() "

    .line 44
    .line 45
    invoke-static {v0}, Lf2/a;->b(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    const/4 v0, 0x1

    .line 49
    iput-boolean v0, p0, Lj1/p;->i:Z

    .line 50
    .line 51
    iget-object v0, p1, Lj1/p;->f:Lj1/p;

    .line 52
    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    iput-object p0, v0, Lj1/p;->e:Lj1/p;

    .line 56
    .line 57
    iput-object v0, p0, Lj1/p;->f:Lj1/p;

    .line 58
    .line 59
    :cond_2
    iput-object p0, p1, Lj1/p;->f:Lj1/p;

    .line 60
    .line 61
    iput-object p1, p0, Lj1/p;->e:Lj1/p;

    .line 62
    .line 63
    return-object p0
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
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public static c(Lj1/p;)Lj1/p;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lj1/p;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget-object v1, Li2/h1;->a:Lo/f0;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "autoInvalidateRemovedNode called on unattached node"

    .line 10
    .line 11
    invoke-static {v0}, Lf2/a;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, -0x1

    .line 15
    const/4 v1, 0x2

    .line 16
    invoke-static {p0, v0, v1}, Li2/h1;->a(Lj1/p;II)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lj1/p;->y0()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lj1/p;->q0()V

    .line 23
    .line 24
    .line 25
    :cond_1
    iget-object v0, p0, Lj1/p;->f:Lj1/p;

    .line 26
    .line 27
    iget-object v1, p0, Lj1/p;->e:Lj1/p;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    iput-object v1, v0, Lj1/p;->e:Lj1/p;

    .line 33
    .line 34
    iput-object v2, p0, Lj1/p;->f:Lj1/p;

    .line 35
    .line 36
    :cond_2
    if-eqz v1, :cond_3

    .line 37
    .line 38
    iput-object v0, v1, Lj1/p;->f:Lj1/p;

    .line 39
    .line 40
    iput-object v2, p0, Lj1/p;->e:Lj1/p;

    .line 41
    .line 42
    :cond_3
    invoke-static {v1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-object v1
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
.end method

.method public static h(Lj1/o;Lj1/o;Lj1/p;)V
    .locals 2

    .line 1
    instance-of p0, p0, Li2/a1;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eqz p0, :cond_1

    .line 5
    .line 6
    instance-of p0, p1, Li2/a1;

    .line 7
    .line 8
    if-eqz p0, :cond_1

    .line 9
    .line 10
    check-cast p1, Li2/a1;

    .line 11
    .line 12
    const-string p0, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe"

    .line 13
    .line 14
    invoke-static {p2, p0}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p2}, Li2/a1;->l(Lj1/p;)V

    .line 18
    .line 19
    .line 20
    iget-boolean p0, p2, Lj1/p;->n:Z

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-static {p2}, Li2/h1;->c(Lj1/p;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    iput-boolean v0, p2, Lj1/p;->j:Z

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    instance-of p0, p2, Li2/c;

    .line 32
    .line 33
    if-eqz p0, :cond_5

    .line 34
    .line 35
    move-object p0, p2

    .line 36
    check-cast p0, Li2/c;

    .line 37
    .line 38
    iget-boolean v1, p0, Lj1/p;->n:Z

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0}, Li2/c;->C0()V

    .line 43
    .line 44
    .line 45
    :cond_2
    iput-object p1, p0, Li2/c;->o:Lj1/o;

    .line 46
    .line 47
    invoke-static {p1}, Li2/h1;->d(Lj1/o;)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    iput p1, p0, Lj1/p;->c:I

    .line 52
    .line 53
    iget-boolean p1, p0, Lj1/p;->n:Z

    .line 54
    .line 55
    if-eqz p1, :cond_3

    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    invoke-virtual {p0, p1}, Li2/c;->B0(Z)V

    .line 59
    .line 60
    .line 61
    :cond_3
    iget-boolean p0, p2, Lj1/p;->n:Z

    .line 62
    .line 63
    if-eqz p0, :cond_4

    .line 64
    .line 65
    invoke-static {p2}, Li2/h1;->c(Lj1/p;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_4
    iput-boolean v0, p2, Lj1/p;->j:Z

    .line 70
    .line 71
    return-void

    .line 72
    :cond_5
    const-string p0, "Unknown Modifier.Node type"

    .line 73
    .line 74
    invoke-static {p0}, Lf2/a;->b(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-void
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
.method public final d(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Li2/d1;->f:Lj1/p;

    .line 2
    .line 3
    iget v0, v0, Lj1/p;->d:I

    .line 4
    .line 5
    and-int/2addr p1, v0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    return p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return p1
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

.method public final e()V
    .locals 3

    .line 1
    iget-object v0, p0, Li2/d1;->f:Lj1/p;

    .line 2
    .line 3
    :goto_0
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {v0}, Lj1/p;->x0()V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, v0, Lj1/p;->i:Z

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    sget-object v1, Li2/h1;->a:Lo/f0;

    .line 13
    .line 14
    iget-boolean v1, v0, Lj1/p;->n:Z

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    const-string v1, "autoInvalidateInsertedNode called on unattached node"

    .line 19
    .line 20
    invoke-static {v1}, Lf2/a;->b(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    const/4 v1, -0x1

    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-static {v0, v1, v2}, Li2/h1;->a(Lj1/p;II)V

    .line 26
    .line 27
    .line 28
    :cond_1
    iget-boolean v1, v0, Lj1/p;->j:Z

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    invoke-static {v0}, Li2/h1;->c(Lj1/p;)V

    .line 33
    .line 34
    .line 35
    :cond_2
    const/4 v1, 0x0

    .line 36
    iput-boolean v1, v0, Lj1/p;->i:Z

    .line 37
    .line 38
    iput-boolean v1, v0, Lj1/p;->j:Z

    .line 39
    .line 40
    iget-object v0, v0, Lj1/p;->f:Lj1/p;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    return-void
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

.method public final f(ILz0/e;Lz0/e;Lj1/p;Z)V
    .locals 31

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Li2/d1;->j:Lb7/d4;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lb7/d4;

    .line 8
    .line 9
    move/from16 v3, p1

    .line 10
    .line 11
    move-object/from16 v4, p2

    .line 12
    .line 13
    move-object/from16 v5, p3

    .line 14
    .line 15
    move-object/from16 v2, p4

    .line 16
    .line 17
    move/from16 v6, p5

    .line 18
    .line 19
    invoke-direct/range {v0 .. v6}, Lb7/d4;-><init>(Li2/d1;Lj1/p;ILz0/e;Lz0/e;Z)V

    .line 20
    .line 21
    .line 22
    iput-object v0, v1, Li2/d1;->j:Lb7/d4;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move/from16 v3, p1

    .line 26
    .line 27
    move-object/from16 v4, p2

    .line 28
    .line 29
    move-object/from16 v5, p3

    .line 30
    .line 31
    move-object/from16 v2, p4

    .line 32
    .line 33
    iput-object v2, v0, Lb7/d4;->d:Ljava/lang/Object;

    .line 34
    .line 35
    iput v3, v0, Lb7/d4;->c:I

    .line 36
    .line 37
    iput-object v4, v0, Lb7/d4;->e:Ljava/lang/Object;

    .line 38
    .line 39
    iput-object v5, v0, Lb7/d4;->f:Ljava/lang/Object;

    .line 40
    .line 41
    move/from16 v6, p5

    .line 42
    .line 43
    iput-boolean v6, v0, Lb7/d4;->b:Z

    .line 44
    .line 45
    :goto_0
    iget-object v2, v0, Lb7/d4;->g:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, Li2/d1;

    .line 48
    .line 49
    iget v4, v4, Lz0/e;->c:I

    .line 50
    .line 51
    sub-int/2addr v4, v3

    .line 52
    iget v5, v5, Lz0/e;->c:I

    .line 53
    .line 54
    sub-int/2addr v5, v3

    .line 55
    add-int v3, v4, v5

    .line 56
    .line 57
    const/4 v6, 0x1

    .line 58
    add-int/2addr v3, v6

    .line 59
    const/4 v7, 0x2

    .line 60
    div-int/2addr v3, v7

    .line 61
    new-instance v8, Li2/v;

    .line 62
    .line 63
    mul-int/lit8 v9, v3, 0x3

    .line 64
    .line 65
    invoke-direct {v8, v9}, Li2/v;-><init>(I)V

    .line 66
    .line 67
    .line 68
    new-instance v9, Li2/v;

    .line 69
    .line 70
    mul-int/lit8 v10, v3, 0x4

    .line 71
    .line 72
    invoke-direct {v9, v10}, Li2/v;-><init>(I)V

    .line 73
    .line 74
    .line 75
    const/4 v10, 0x0

    .line 76
    invoke-virtual {v9, v10, v4, v10, v5}, Li2/v;->e(IIII)V

    .line 77
    .line 78
    .line 79
    mul-int/lit8 v3, v3, 0x2

    .line 80
    .line 81
    add-int/2addr v3, v6

    .line 82
    new-array v11, v3, [I

    .line 83
    .line 84
    new-array v12, v3, [I

    .line 85
    .line 86
    const/4 v13, 0x5

    .line 87
    new-array v13, v13, [I

    .line 88
    .line 89
    :goto_1
    iget v14, v9, Li2/v;->b:I

    .line 90
    .line 91
    if-eqz v14, :cond_1d

    .line 92
    .line 93
    const/16 p1, 0x2

    .line 94
    .line 95
    iget-object v7, v9, Li2/v;->a:[I

    .line 96
    .line 97
    const/16 p2, 0x0

    .line 98
    .line 99
    add-int/lit8 v10, v14, -0x1

    .line 100
    .line 101
    iput v10, v9, Li2/v;->b:I

    .line 102
    .line 103
    aget v10, v7, v10

    .line 104
    .line 105
    const/16 p3, 0x3

    .line 106
    .line 107
    add-int/lit8 v15, v14, -0x2

    .line 108
    .line 109
    iput v15, v9, Li2/v;->b:I

    .line 110
    .line 111
    aget v15, v7, v15

    .line 112
    .line 113
    add-int/lit8 v6, v14, -0x3

    .line 114
    .line 115
    iput v6, v9, Li2/v;->b:I

    .line 116
    .line 117
    aget v6, v7, v6

    .line 118
    .line 119
    add-int/lit8 v14, v14, -0x4

    .line 120
    .line 121
    iput v14, v9, Li2/v;->b:I

    .line 122
    .line 123
    aget v7, v7, v14

    .line 124
    .line 125
    sub-int v14, v6, v7

    .line 126
    .line 127
    move/from16 p5, v3

    .line 128
    .line 129
    sub-int v3, v10, v15

    .line 130
    .line 131
    move-object/from16 v16, v11

    .line 132
    .line 133
    const/4 v11, 0x1

    .line 134
    if-lt v14, v11, :cond_1c

    .line 135
    .line 136
    if-ge v3, v11, :cond_1

    .line 137
    .line 138
    goto/16 :goto_19

    .line 139
    .line 140
    :cond_1
    add-int v17, v14, v3

    .line 141
    .line 142
    add-int/lit8 v17, v17, 0x1

    .line 143
    .line 144
    const/16 p4, 0x1

    .line 145
    .line 146
    div-int/lit8 v11, v17, 0x2

    .line 147
    .line 148
    div-int/lit8 v17, p5, 0x2

    .line 149
    .line 150
    add-int/lit8 v18, v17, 0x1

    .line 151
    .line 152
    aput v7, v16, v18

    .line 153
    .line 154
    aput v6, v12, v18

    .line 155
    .line 156
    move/from16 v18, v3

    .line 157
    .line 158
    const/4 v3, 0x0

    .line 159
    :goto_2
    if-ge v3, v11, :cond_1c

    .line 160
    .line 161
    sub-int v19, v14, v18

    .line 162
    .line 163
    invoke-static/range {v19 .. v19}, Ljava/lang/Math;->abs(I)I

    .line 164
    .line 165
    .line 166
    move-result v20

    .line 167
    move/from16 v21, v11

    .line 168
    .line 169
    and-int/lit8 v11, v20, 0x1

    .line 170
    .line 171
    move-object/from16 v20, v12

    .line 172
    .line 173
    const/4 v12, 0x1

    .line 174
    if-ne v11, v12, :cond_2

    .line 175
    .line 176
    const/4 v11, 0x1

    .line 177
    goto :goto_3

    .line 178
    :cond_2
    const/4 v11, 0x0

    .line 179
    :goto_3
    neg-int v12, v3

    .line 180
    move/from16 v22, v11

    .line 181
    .line 182
    move v11, v12

    .line 183
    :goto_4
    const/16 v23, 0x4

    .line 184
    .line 185
    if-gt v11, v3, :cond_b

    .line 186
    .line 187
    if-eq v11, v12, :cond_5

    .line 188
    .line 189
    if-eq v11, v3, :cond_3

    .line 190
    .line 191
    add-int/lit8 v24, v11, 0x1

    .line 192
    .line 193
    add-int v24, v24, v17

    .line 194
    .line 195
    move/from16 v25, v11

    .line 196
    .line 197
    aget v11, v16, v24

    .line 198
    .line 199
    add-int/lit8 v24, v25, -0x1

    .line 200
    .line 201
    add-int v24, v24, v17

    .line 202
    .line 203
    move-object/from16 v26, v13

    .line 204
    .line 205
    aget v13, v16, v24

    .line 206
    .line 207
    if-le v11, v13, :cond_4

    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_3
    move/from16 v25, v11

    .line 211
    .line 212
    move-object/from16 v26, v13

    .line 213
    .line 214
    :cond_4
    add-int/lit8 v11, v25, -0x1

    .line 215
    .line 216
    add-int v11, v11, v17

    .line 217
    .line 218
    aget v11, v16, v11

    .line 219
    .line 220
    add-int/lit8 v13, v11, 0x1

    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_5
    move/from16 v25, v11

    .line 224
    .line 225
    move-object/from16 v26, v13

    .line 226
    .line 227
    :goto_5
    add-int/lit8 v11, v25, 0x1

    .line 228
    .line 229
    add-int v11, v11, v17

    .line 230
    .line 231
    aget v11, v16, v11

    .line 232
    .line 233
    move v13, v11

    .line 234
    :goto_6
    sub-int v24, v13, v7

    .line 235
    .line 236
    add-int v24, v24, v15

    .line 237
    .line 238
    sub-int v24, v24, v25

    .line 239
    .line 240
    if-eqz v3, :cond_6

    .line 241
    .line 242
    const/16 v27, 0x1

    .line 243
    .line 244
    goto :goto_7

    .line 245
    :cond_6
    const/16 v27, 0x0

    .line 246
    .line 247
    :goto_7
    if-ne v13, v11, :cond_7

    .line 248
    .line 249
    const/16 v28, 0x1

    .line 250
    .line 251
    goto :goto_8

    .line 252
    :cond_7
    const/16 v28, 0x0

    .line 253
    .line 254
    :goto_8
    and-int v27, v27, v28

    .line 255
    .line 256
    sub-int v27, v24, v27

    .line 257
    .line 258
    move/from16 v30, v24

    .line 259
    .line 260
    move/from16 v24, v11

    .line 261
    .line 262
    move/from16 v11, v30

    .line 263
    .line 264
    :goto_9
    if-ge v13, v6, :cond_8

    .line 265
    .line 266
    if-ge v11, v10, :cond_8

    .line 267
    .line 268
    invoke-virtual {v0, v13, v11}, Lb7/d4;->f(II)Z

    .line 269
    .line 270
    .line 271
    move-result v28

    .line 272
    if-eqz v28, :cond_8

    .line 273
    .line 274
    add-int/lit8 v13, v13, 0x1

    .line 275
    .line 276
    add-int/lit8 v11, v11, 0x1

    .line 277
    .line 278
    goto :goto_9

    .line 279
    :cond_8
    add-int v28, v17, v25

    .line 280
    .line 281
    aput v13, v16, v28

    .line 282
    .line 283
    if-eqz v22, :cond_9

    .line 284
    .line 285
    move/from16 v28, v11

    .line 286
    .line 287
    sub-int v11, v19, v25

    .line 288
    .line 289
    move/from16 v29, v14

    .line 290
    .line 291
    add-int/lit8 v14, v12, 0x1

    .line 292
    .line 293
    if-lt v11, v14, :cond_a

    .line 294
    .line 295
    add-int/lit8 v14, v3, -0x1

    .line 296
    .line 297
    if-gt v11, v14, :cond_a

    .line 298
    .line 299
    add-int v11, v17, v11

    .line 300
    .line 301
    aget v11, v20, v11

    .line 302
    .line 303
    if-gt v11, v13, :cond_a

    .line 304
    .line 305
    aput v24, v26, p2

    .line 306
    .line 307
    const/4 v11, 0x1

    .line 308
    aput v27, v26, v11

    .line 309
    .line 310
    aput v13, v26, p1

    .line 311
    .line 312
    aput v28, v26, p3

    .line 313
    .line 314
    aput p2, v26, v23

    .line 315
    .line 316
    const/4 v11, 0x1

    .line 317
    goto/16 :goto_11

    .line 318
    .line 319
    :cond_9
    move/from16 v29, v14

    .line 320
    .line 321
    :cond_a
    add-int/lit8 v11, v25, 0x2

    .line 322
    .line 323
    move-object/from16 v13, v26

    .line 324
    .line 325
    move/from16 v14, v29

    .line 326
    .line 327
    goto/16 :goto_4

    .line 328
    .line 329
    :cond_b
    move-object/from16 v26, v13

    .line 330
    .line 331
    move/from16 v29, v14

    .line 332
    .line 333
    and-int/lit8 v11, v19, 0x1

    .line 334
    .line 335
    if-nez v11, :cond_c

    .line 336
    .line 337
    const/4 v11, 0x1

    .line 338
    goto :goto_a

    .line 339
    :cond_c
    const/4 v11, 0x0

    .line 340
    :goto_a
    move v13, v12

    .line 341
    :goto_b
    if-gt v13, v3, :cond_1b

    .line 342
    .line 343
    if-eq v13, v12, :cond_f

    .line 344
    .line 345
    if-eq v13, v3, :cond_d

    .line 346
    .line 347
    add-int/lit8 v14, v13, 0x1

    .line 348
    .line 349
    add-int v14, v14, v17

    .line 350
    .line 351
    aget v14, v20, v14

    .line 352
    .line 353
    add-int/lit8 v22, v13, -0x1

    .line 354
    .line 355
    add-int v22, v22, v17

    .line 356
    .line 357
    move/from16 v24, v11

    .line 358
    .line 359
    aget v11, v20, v22

    .line 360
    .line 361
    if-ge v14, v11, :cond_e

    .line 362
    .line 363
    goto :goto_c

    .line 364
    :cond_d
    move/from16 v24, v11

    .line 365
    .line 366
    :cond_e
    add-int/lit8 v11, v13, -0x1

    .line 367
    .line 368
    add-int v11, v11, v17

    .line 369
    .line 370
    aget v11, v20, v11

    .line 371
    .line 372
    add-int/lit8 v14, v11, -0x1

    .line 373
    .line 374
    goto :goto_d

    .line 375
    :cond_f
    move/from16 v24, v11

    .line 376
    .line 377
    :goto_c
    add-int/lit8 v11, v13, 0x1

    .line 378
    .line 379
    add-int v11, v11, v17

    .line 380
    .line 381
    aget v11, v20, v11

    .line 382
    .line 383
    move v14, v11

    .line 384
    :goto_d
    sub-int v22, v6, v14

    .line 385
    .line 386
    sub-int v22, v22, v13

    .line 387
    .line 388
    sub-int v22, v10, v22

    .line 389
    .line 390
    if-eqz v3, :cond_10

    .line 391
    .line 392
    const/16 v25, 0x1

    .line 393
    .line 394
    goto :goto_e

    .line 395
    :cond_10
    const/16 v25, 0x0

    .line 396
    .line 397
    :goto_e
    if-ne v14, v11, :cond_11

    .line 398
    .line 399
    const/16 v27, 0x1

    .line 400
    .line 401
    goto :goto_f

    .line 402
    :cond_11
    const/16 v27, 0x0

    .line 403
    .line 404
    :goto_f
    and-int v25, v25, v27

    .line 405
    .line 406
    add-int v25, v22, v25

    .line 407
    .line 408
    move/from16 v30, v22

    .line 409
    .line 410
    move/from16 v22, v11

    .line 411
    .line 412
    move/from16 v11, v30

    .line 413
    .line 414
    :goto_10
    if-le v14, v7, :cond_12

    .line 415
    .line 416
    if-le v11, v15, :cond_12

    .line 417
    .line 418
    move/from16 v27, v11

    .line 419
    .line 420
    add-int/lit8 v11, v14, -0x1

    .line 421
    .line 422
    move/from16 v28, v13

    .line 423
    .line 424
    add-int/lit8 v13, v27, -0x1

    .line 425
    .line 426
    invoke-virtual {v0, v11, v13}, Lb7/d4;->f(II)Z

    .line 427
    .line 428
    .line 429
    move-result v11

    .line 430
    if-eqz v11, :cond_13

    .line 431
    .line 432
    add-int/lit8 v14, v14, -0x1

    .line 433
    .line 434
    add-int/lit8 v11, v27, -0x1

    .line 435
    .line 436
    move/from16 v13, v28

    .line 437
    .line 438
    goto :goto_10

    .line 439
    :cond_12
    move/from16 v27, v11

    .line 440
    .line 441
    move/from16 v28, v13

    .line 442
    .line 443
    :cond_13
    add-int v13, v17, v28

    .line 444
    .line 445
    aput v14, v20, v13

    .line 446
    .line 447
    if-eqz v24, :cond_1a

    .line 448
    .line 449
    sub-int v11, v19, v28

    .line 450
    .line 451
    if-lt v11, v12, :cond_1a

    .line 452
    .line 453
    if-gt v11, v3, :cond_1a

    .line 454
    .line 455
    add-int v11, v17, v11

    .line 456
    .line 457
    aget v11, v16, v11

    .line 458
    .line 459
    if-lt v11, v14, :cond_1a

    .line 460
    .line 461
    aput v14, v26, p2

    .line 462
    .line 463
    const/4 v11, 0x1

    .line 464
    aput v27, v26, v11

    .line 465
    .line 466
    aput v22, v26, p1

    .line 467
    .line 468
    aput v25, v26, p3

    .line 469
    .line 470
    aput v11, v26, v23

    .line 471
    .line 472
    :goto_11
    aget v3, v26, p1

    .line 473
    .line 474
    aget v12, v26, p2

    .line 475
    .line 476
    sub-int/2addr v3, v12

    .line 477
    aget v12, v26, p3

    .line 478
    .line 479
    aget v13, v26, v11

    .line 480
    .line 481
    sub-int/2addr v12, v13

    .line 482
    invoke-static {v3, v12}, Ljava/lang/Math;->min(II)I

    .line 483
    .line 484
    .line 485
    move-result v3

    .line 486
    if-lez v3, :cond_19

    .line 487
    .line 488
    aget v3, v26, p2

    .line 489
    .line 490
    aget v12, v26, v11

    .line 491
    .line 492
    aget v11, v26, p3

    .line 493
    .line 494
    sub-int/2addr v11, v12

    .line 495
    aget v13, v26, p1

    .line 496
    .line 497
    sub-int/2addr v13, v3

    .line 498
    if-eq v11, v13, :cond_18

    .line 499
    .line 500
    invoke-static {v13, v11}, Ljava/lang/Math;->min(II)I

    .line 501
    .line 502
    .line 503
    move-result v13

    .line 504
    aget v11, v26, v23

    .line 505
    .line 506
    if-eqz v11, :cond_14

    .line 507
    .line 508
    const/4 v14, 0x1

    .line 509
    goto :goto_12

    .line 510
    :cond_14
    const/4 v14, 0x0

    .line 511
    :goto_12
    aget v17, v26, p3

    .line 512
    .line 513
    const/16 v18, 0x1

    .line 514
    .line 515
    aget v19, v26, v18

    .line 516
    .line 517
    move/from16 p4, v3

    .line 518
    .line 519
    sub-int v3, v17, v19

    .line 520
    .line 521
    aget v21, v26, p1

    .line 522
    .line 523
    aget v22, v26, p2

    .line 524
    .line 525
    move/from16 v23, v11

    .line 526
    .line 527
    sub-int v11, v21, v22

    .line 528
    .line 529
    if-le v3, v11, :cond_15

    .line 530
    .line 531
    const/4 v3, 0x1

    .line 532
    goto :goto_13

    .line 533
    :cond_15
    const/4 v3, 0x0

    .line 534
    :goto_13
    or-int/2addr v3, v14

    .line 535
    xor-int/lit8 v3, v3, 0x1

    .line 536
    .line 537
    add-int v3, p4, v3

    .line 538
    .line 539
    if-eqz v23, :cond_16

    .line 540
    .line 541
    const/4 v11, 0x1

    .line 542
    goto :goto_14

    .line 543
    :cond_16
    const/4 v11, 0x0

    .line 544
    :goto_14
    sub-int v14, v17, v19

    .line 545
    .line 546
    move/from16 p4, v3

    .line 547
    .line 548
    sub-int v3, v21, v22

    .line 549
    .line 550
    if-le v14, v3, :cond_17

    .line 551
    .line 552
    const/4 v3, 0x1

    .line 553
    goto :goto_15

    .line 554
    :cond_17
    const/4 v3, 0x0

    .line 555
    :goto_15
    xor-int/lit8 v3, v3, 0x1

    .line 556
    .line 557
    or-int/2addr v3, v11

    .line 558
    xor-int/lit8 v3, v3, 0x1

    .line 559
    .line 560
    add-int/2addr v12, v3

    .line 561
    move/from16 v3, p4

    .line 562
    .line 563
    goto :goto_16

    .line 564
    :cond_18
    move/from16 p4, v3

    .line 565
    .line 566
    const/16 v18, 0x1

    .line 567
    .line 568
    :goto_16
    invoke-virtual {v8, v3, v12, v13}, Li2/v;->d(III)V

    .line 569
    .line 570
    .line 571
    goto :goto_17

    .line 572
    :cond_19
    const/16 v18, 0x1

    .line 573
    .line 574
    :goto_17
    aget v3, v26, p2

    .line 575
    .line 576
    aget v11, v26, v18

    .line 577
    .line 578
    invoke-virtual {v9, v7, v3, v15, v11}, Li2/v;->e(IIII)V

    .line 579
    .line 580
    .line 581
    aget v3, v26, p1

    .line 582
    .line 583
    aget v7, v26, p3

    .line 584
    .line 585
    invoke-virtual {v9, v3, v6, v7, v10}, Li2/v;->e(IIII)V

    .line 586
    .line 587
    .line 588
    :goto_18
    move/from16 v3, p5

    .line 589
    .line 590
    move-object/from16 v11, v16

    .line 591
    .line 592
    move-object/from16 v12, v20

    .line 593
    .line 594
    move-object/from16 v13, v26

    .line 595
    .line 596
    const/4 v6, 0x1

    .line 597
    const/4 v7, 0x2

    .line 598
    const/4 v10, 0x0

    .line 599
    goto/16 :goto_1

    .line 600
    .line 601
    :cond_1a
    add-int/lit8 v13, v28, 0x2

    .line 602
    .line 603
    move/from16 v11, v24

    .line 604
    .line 605
    goto/16 :goto_b

    .line 606
    .line 607
    :cond_1b
    add-int/lit8 v3, v3, 0x1

    .line 608
    .line 609
    move-object/from16 v12, v20

    .line 610
    .line 611
    move/from16 v11, v21

    .line 612
    .line 613
    move-object/from16 v13, v26

    .line 614
    .line 615
    move/from16 v14, v29

    .line 616
    .line 617
    const/16 p4, 0x1

    .line 618
    .line 619
    goto/16 :goto_2

    .line 620
    .line 621
    :cond_1c
    :goto_19
    move-object/from16 v20, v12

    .line 622
    .line 623
    move-object/from16 v26, v13

    .line 624
    .line 625
    goto :goto_18

    .line 626
    :cond_1d
    const/16 p1, 0x2

    .line 627
    .line 628
    const/16 p2, 0x0

    .line 629
    .line 630
    const/16 p3, 0x3

    .line 631
    .line 632
    iget v3, v8, Li2/v;->b:I

    .line 633
    .line 634
    rem-int/lit8 v6, v3, 0x3

    .line 635
    .line 636
    if-nez v6, :cond_1e

    .line 637
    .line 638
    :goto_1a
    const/4 v6, 0x3

    .line 639
    goto :goto_1b

    .line 640
    :cond_1e
    const-string v6, "Array size not a multiple of 3"

    .line 641
    .line 642
    invoke-static {v6}, Lf2/a;->b(Ljava/lang/String;)V

    .line 643
    .line 644
    .line 645
    goto :goto_1a

    .line 646
    :goto_1b
    if-le v3, v6, :cond_1f

    .line 647
    .line 648
    sub-int/2addr v3, v6

    .line 649
    const/4 v6, 0x0

    .line 650
    invoke-virtual {v8, v6, v3}, Li2/v;->f(II)V

    .line 651
    .line 652
    .line 653
    goto :goto_1c

    .line 654
    :cond_1f
    const/4 v6, 0x0

    .line 655
    :goto_1c
    invoke-virtual {v8, v4, v5, v6}, Li2/v;->d(III)V

    .line 656
    .line 657
    .line 658
    const/4 v3, 0x0

    .line 659
    const/4 v4, 0x0

    .line 660
    const/4 v5, 0x0

    .line 661
    :cond_20
    iget v7, v8, Li2/v;->b:I

    .line 662
    .line 663
    if-ge v3, v7, :cond_29

    .line 664
    .line 665
    iget-object v7, v8, Li2/v;->a:[I

    .line 666
    .line 667
    aget v9, v7, v3

    .line 668
    .line 669
    add-int/lit8 v10, v3, 0x2

    .line 670
    .line 671
    aget v10, v7, v10

    .line 672
    .line 673
    sub-int/2addr v9, v10

    .line 674
    add-int/lit8 v11, v3, 0x1

    .line 675
    .line 676
    aget v7, v7, v11

    .line 677
    .line 678
    sub-int/2addr v7, v10

    .line 679
    add-int/lit8 v3, v3, 0x3

    .line 680
    .line 681
    :goto_1d
    if-ge v4, v9, :cond_23

    .line 682
    .line 683
    iget-object v11, v0, Lb7/d4;->d:Ljava/lang/Object;

    .line 684
    .line 685
    check-cast v11, Lj1/p;

    .line 686
    .line 687
    iget-object v11, v11, Lj1/p;->f:Lj1/p;

    .line 688
    .line 689
    invoke-static {v11}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 690
    .line 691
    .line 692
    iget v12, v11, Lj1/p;->c:I

    .line 693
    .line 694
    and-int/lit8 v12, v12, 0x2

    .line 695
    .line 696
    if-eqz v12, :cond_22

    .line 697
    .line 698
    iget-object v12, v11, Lj1/p;->h:Li2/g1;

    .line 699
    .line 700
    invoke-static {v12}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 701
    .line 702
    .line 703
    iget-object v13, v12, Li2/g1;->s:Li2/g1;

    .line 704
    .line 705
    iget-object v12, v12, Li2/g1;->r:Li2/g1;

    .line 706
    .line 707
    invoke-static {v12}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 708
    .line 709
    .line 710
    if-eqz v13, :cond_21

    .line 711
    .line 712
    iput-object v12, v13, Li2/g1;->r:Li2/g1;

    .line 713
    .line 714
    :cond_21
    iput-object v13, v12, Li2/g1;->s:Li2/g1;

    .line 715
    .line 716
    iget-object v13, v0, Lb7/d4;->d:Ljava/lang/Object;

    .line 717
    .line 718
    check-cast v13, Lj1/p;

    .line 719
    .line 720
    invoke-static {v2, v13, v12}, Li2/d1;->a(Li2/d1;Lj1/p;Li2/g1;)V

    .line 721
    .line 722
    .line 723
    :cond_22
    invoke-static {v11}, Li2/d1;->c(Lj1/p;)Lj1/p;

    .line 724
    .line 725
    .line 726
    move-result-object v11

    .line 727
    iput-object v11, v0, Lb7/d4;->d:Ljava/lang/Object;

    .line 728
    .line 729
    add-int/lit8 v4, v4, 0x1

    .line 730
    .line 731
    goto :goto_1d

    .line 732
    :cond_23
    :goto_1e
    if-ge v5, v7, :cond_27

    .line 733
    .line 734
    iget v9, v0, Lb7/d4;->c:I

    .line 735
    .line 736
    add-int/2addr v9, v5

    .line 737
    iget-object v11, v0, Lb7/d4;->d:Ljava/lang/Object;

    .line 738
    .line 739
    check-cast v11, Lj1/p;

    .line 740
    .line 741
    iget-object v12, v0, Lb7/d4;->f:Ljava/lang/Object;

    .line 742
    .line 743
    check-cast v12, Lz0/e;

    .line 744
    .line 745
    iget-object v12, v12, Lz0/e;->a:[Ljava/lang/Object;

    .line 746
    .line 747
    aget-object v9, v12, v9

    .line 748
    .line 749
    check-cast v9, Lj1/o;

    .line 750
    .line 751
    invoke-static {v9, v11}, Li2/d1;->b(Lj1/o;Lj1/p;)Lj1/p;

    .line 752
    .line 753
    .line 754
    move-result-object v9

    .line 755
    iput-object v9, v0, Lb7/d4;->d:Ljava/lang/Object;

    .line 756
    .line 757
    iget-boolean v11, v0, Lb7/d4;->b:Z

    .line 758
    .line 759
    if-eqz v11, :cond_26

    .line 760
    .line 761
    iget-object v9, v9, Lj1/p;->f:Lj1/p;

    .line 762
    .line 763
    invoke-static {v9}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 764
    .line 765
    .line 766
    iget-object v9, v9, Lj1/p;->h:Li2/g1;

    .line 767
    .line 768
    invoke-static {v9}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 769
    .line 770
    .line 771
    iget-object v11, v0, Lb7/d4;->d:Ljava/lang/Object;

    .line 772
    .line 773
    check-cast v11, Lj1/p;

    .line 774
    .line 775
    invoke-static {v11}, Li2/f;->g(Lj1/p;)Li2/z;

    .line 776
    .line 777
    .line 778
    move-result-object v11

    .line 779
    if-eqz v11, :cond_24

    .line 780
    .line 781
    new-instance v12, Li2/c0;

    .line 782
    .line 783
    iget-object v13, v2, Li2/d1;->a:Li2/j0;

    .line 784
    .line 785
    invoke-direct {v12, v13, v11}, Li2/c0;-><init>(Li2/j0;Li2/z;)V

    .line 786
    .line 787
    .line 788
    iget-object v11, v0, Lb7/d4;->d:Ljava/lang/Object;

    .line 789
    .line 790
    check-cast v11, Lj1/p;

    .line 791
    .line 792
    invoke-virtual {v11, v12}, Lj1/p;->A0(Li2/g1;)V

    .line 793
    .line 794
    .line 795
    iget-object v11, v0, Lb7/d4;->d:Ljava/lang/Object;

    .line 796
    .line 797
    check-cast v11, Lj1/p;

    .line 798
    .line 799
    invoke-static {v2, v11, v12}, Li2/d1;->a(Li2/d1;Lj1/p;Li2/g1;)V

    .line 800
    .line 801
    .line 802
    iget-object v11, v9, Li2/g1;->s:Li2/g1;

    .line 803
    .line 804
    iput-object v11, v12, Li2/g1;->s:Li2/g1;

    .line 805
    .line 806
    iput-object v9, v12, Li2/g1;->r:Li2/g1;

    .line 807
    .line 808
    iput-object v12, v9, Li2/g1;->s:Li2/g1;

    .line 809
    .line 810
    goto :goto_1f

    .line 811
    :cond_24
    iget-object v11, v0, Lb7/d4;->d:Ljava/lang/Object;

    .line 812
    .line 813
    check-cast v11, Lj1/p;

    .line 814
    .line 815
    invoke-virtual {v11, v9}, Lj1/p;->A0(Li2/g1;)V

    .line 816
    .line 817
    .line 818
    :goto_1f
    iget-object v9, v0, Lb7/d4;->d:Ljava/lang/Object;

    .line 819
    .line 820
    check-cast v9, Lj1/p;

    .line 821
    .line 822
    invoke-virtual {v9}, Lj1/p;->p0()V

    .line 823
    .line 824
    .line 825
    iget-object v9, v0, Lb7/d4;->d:Ljava/lang/Object;

    .line 826
    .line 827
    check-cast v9, Lj1/p;

    .line 828
    .line 829
    invoke-virtual {v9}, Lj1/p;->x0()V

    .line 830
    .line 831
    .line 832
    iget-object v9, v0, Lb7/d4;->d:Ljava/lang/Object;

    .line 833
    .line 834
    check-cast v9, Lj1/p;

    .line 835
    .line 836
    sget-object v11, Li2/h1;->a:Lo/f0;

    .line 837
    .line 838
    iget-boolean v11, v9, Lj1/p;->n:Z

    .line 839
    .line 840
    if-nez v11, :cond_25

    .line 841
    .line 842
    const-string v11, "autoInvalidateInsertedNode called on unattached node"

    .line 843
    .line 844
    invoke-static {v11}, Lf2/a;->b(Ljava/lang/String;)V

    .line 845
    .line 846
    .line 847
    :cond_25
    const/4 v11, -0x1

    .line 848
    const/4 v12, 0x1

    .line 849
    invoke-static {v9, v11, v12}, Li2/h1;->a(Lj1/p;II)V

    .line 850
    .line 851
    .line 852
    goto :goto_20

    .line 853
    :cond_26
    const/4 v12, 0x1

    .line 854
    iput-boolean v12, v9, Lj1/p;->i:Z

    .line 855
    .line 856
    :goto_20
    add-int/lit8 v5, v5, 0x1

    .line 857
    .line 858
    goto :goto_1e

    .line 859
    :cond_27
    const/4 v12, 0x1

    .line 860
    :goto_21
    add-int/lit8 v7, v10, -0x1

    .line 861
    .line 862
    if-lez v10, :cond_20

    .line 863
    .line 864
    iget-object v9, v0, Lb7/d4;->d:Ljava/lang/Object;

    .line 865
    .line 866
    check-cast v9, Lj1/p;

    .line 867
    .line 868
    iget-object v9, v9, Lj1/p;->f:Lj1/p;

    .line 869
    .line 870
    invoke-static {v9}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 871
    .line 872
    .line 873
    iput-object v9, v0, Lb7/d4;->d:Ljava/lang/Object;

    .line 874
    .line 875
    iget-object v9, v0, Lb7/d4;->e:Ljava/lang/Object;

    .line 876
    .line 877
    check-cast v9, Lz0/e;

    .line 878
    .line 879
    iget v10, v0, Lb7/d4;->c:I

    .line 880
    .line 881
    add-int v11, v10, v4

    .line 882
    .line 883
    iget-object v9, v9, Lz0/e;->a:[Ljava/lang/Object;

    .line 884
    .line 885
    aget-object v9, v9, v11

    .line 886
    .line 887
    check-cast v9, Lj1/o;

    .line 888
    .line 889
    iget-object v11, v0, Lb7/d4;->f:Ljava/lang/Object;

    .line 890
    .line 891
    check-cast v11, Lz0/e;

    .line 892
    .line 893
    add-int/2addr v10, v5

    .line 894
    iget-object v11, v11, Lz0/e;->a:[Ljava/lang/Object;

    .line 895
    .line 896
    aget-object v10, v11, v10

    .line 897
    .line 898
    check-cast v10, Lj1/o;

    .line 899
    .line 900
    invoke-static {v9, v10}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 901
    .line 902
    .line 903
    move-result v11

    .line 904
    if-nez v11, :cond_28

    .line 905
    .line 906
    iget-object v11, v0, Lb7/d4;->d:Ljava/lang/Object;

    .line 907
    .line 908
    check-cast v11, Lj1/p;

    .line 909
    .line 910
    invoke-static {v9, v10, v11}, Li2/d1;->h(Lj1/o;Lj1/o;Lj1/p;)V

    .line 911
    .line 912
    .line 913
    :cond_28
    add-int/lit8 v4, v4, 0x1

    .line 914
    .line 915
    add-int/lit8 v5, v5, 0x1

    .line 916
    .line 917
    move v10, v7

    .line 918
    goto :goto_21

    .line 919
    :cond_29
    iget-object v0, v1, Li2/d1;->e:Li2/a2;

    .line 920
    .line 921
    iget-object v0, v0, Lj1/p;->e:Lj1/p;

    .line 922
    .line 923
    const/4 v10, 0x0

    .line 924
    :goto_22
    if-eqz v0, :cond_2a

    .line 925
    .line 926
    iget-object v2, v1, Li2/d1;->b:Li2/c1;

    .line 927
    .line 928
    if-eq v0, v2, :cond_2a

    .line 929
    .line 930
    iget v2, v0, Lj1/p;->c:I

    .line 931
    .line 932
    or-int/2addr v10, v2

    .line 933
    iput v10, v0, Lj1/p;->d:I

    .line 934
    .line 935
    iget-object v0, v0, Lj1/p;->e:Lj1/p;

    .line 936
    .line 937
    goto :goto_22

    .line 938
    :cond_2a
    return-void
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
.end method

.method public final g()V
    .locals 5

    .line 1
    iget-object v0, p0, Li2/d1;->e:Li2/a2;

    .line 2
    .line 3
    iget-object v0, v0, Lj1/p;->e:Lj1/p;

    .line 4
    .line 5
    iget-object v1, p0, Li2/d1;->c:Li2/u;

    .line 6
    .line 7
    :goto_0
    iget-object v2, p0, Li2/d1;->a:Li2/j0;

    .line 8
    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    invoke-static {v0}, Li2/f;->g(Lj1/p;)Li2/z;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    if-eqz v3, :cond_2

    .line 16
    .line 17
    iget-object v4, v0, Lj1/p;->h:Li2/g1;

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    check-cast v4, Li2/c0;

    .line 22
    .line 23
    iget-object v2, v4, Li2/c0;->R:Li2/z;

    .line 24
    .line 25
    invoke-virtual {v4, v3}, Li2/c0;->p1(Li2/z;)V

    .line 26
    .line 27
    .line 28
    if-eq v2, v0, :cond_1

    .line 29
    .line 30
    iget-object v2, v4, Li2/g1;->K:Li2/o1;

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-interface {v2}, Li2/o1;->invalidate()V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    new-instance v4, Li2/c0;

    .line 39
    .line 40
    invoke-direct {v4, v2, v3}, Li2/c0;-><init>(Li2/j0;Li2/z;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v4}, Lj1/p;->A0(Li2/g1;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    :goto_1
    iput-object v4, v1, Li2/g1;->s:Li2/g1;

    .line 47
    .line 48
    iput-object v1, v4, Li2/g1;->r:Li2/g1;

    .line 49
    .line 50
    move-object v1, v4

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    invoke-virtual {v0, v1}, Lj1/p;->A0(Li2/g1;)V

    .line 53
    .line 54
    .line 55
    :goto_2
    iget-object v0, v0, Lj1/p;->e:Lj1/p;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    invoke-virtual {v2}, Li2/j0;->v()Li2/j0;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    iget-object v0, v0, Li2/j0;->F:Li2/d1;

    .line 65
    .line 66
    iget-object v0, v0, Li2/d1;->c:Li2/u;

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    const/4 v0, 0x0

    .line 70
    :goto_3
    iput-object v0, v1, Li2/g1;->s:Li2/g1;

    .line 71
    .line 72
    iput-object v1, p0, Li2/d1;->d:Li2/g1;

    .line 73
    .line 74
    return-void
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

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Li2/d1;->f:Lj1/p;

    .line 9
    .line 10
    const-string v2, "]"

    .line 11
    .line 12
    iget-object v3, p0, Li2/d1;->e:Li2/a2;

    .line 13
    .line 14
    if-ne v1, v3, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    if-eqz v1, :cond_2

    .line 21
    .line 22
    if-eq v1, v3, :cond_2

    .line 23
    .line 24
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v4, v1, Lj1/p;->f:Lj1/p;

    .line 32
    .line 33
    if-ne v4, v3, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string v4, ","

    .line 40
    .line 41
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget-object v1, v1, Lj1/p;->f:Lj1/p;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "toString(...)"

    .line 52
    .line 53
    invoke-static {v0, v1}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v0
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

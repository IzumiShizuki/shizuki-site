.class public final Lr/m1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lx0/n2;


# instance fields
.field public final a:Lr/v1;

.field public final b:Lx0/e1;

.field public final c:Lx0/e1;

.field public final d:Lx0/e1;

.field public e:Lr/p0;

.field public f:Lr/h1;

.field public final g:Lx0/e1;

.field public final h:Lx0/a1;

.field public i:Z

.field public final j:Lx0/e1;

.field public k:Lr/p;

.field public final l:Lx0/c1;

.field public m:Z

.field public final n:Lr/z0;

.field public final synthetic o:Lr/q1;


# direct methods
.method public constructor <init>(Lr/q1;Ljava/lang/Object;Lr/p;Lr/v1;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr/m1;->o:Lr/q1;

    .line 5
    .line 6
    iput-object p4, p0, Lr/m1;->a:Lr/v1;

    .line 7
    .line 8
    invoke-static {p2}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lr/m1;->b:Lx0/e1;

    .line 13
    .line 14
    const/4 v0, 0x7

    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {v0, v1}, Lr/d;->q(ILjava/lang/Object;)Lr/z0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lr/m1;->c:Lx0/e1;

    .line 25
    .line 26
    new-instance v2, Lr/h1;

    .line 27
    .line 28
    invoke-virtual {p0}, Lr/m1;->c()Lr/x;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {p1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    move-object v5, p2

    .line 37
    move-object v7, p3

    .line 38
    move-object v4, p4

    .line 39
    invoke-direct/range {v2 .. v7}, Lr/h1;-><init>(Lr/j;Lr/v1;Ljava/lang/Object;Ljava/lang/Object;Lr/p;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v2}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Lr/m1;->d:Lx0/e1;

    .line 47
    .line 48
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-static {p1}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iput-object p1, p0, Lr/m1;->g:Lx0/e1;

    .line 55
    .line 56
    new-instance p1, Lx0/a1;

    .line 57
    .line 58
    const/high16 p2, -0x40800000    # -1.0f

    .line 59
    .line 60
    invoke-direct {p1, p2}, Lx0/a1;-><init>(F)V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lr/m1;->h:Lx0/a1;

    .line 64
    .line 65
    invoke-static {v5}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, p0, Lr/m1;->j:Lx0/e1;

    .line 70
    .line 71
    iput-object v7, p0, Lr/m1;->k:Lr/p;

    .line 72
    .line 73
    invoke-virtual {p0}, Lr/m1;->a()Lr/h1;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p1}, Lr/h1;->b()J

    .line 78
    .line 79
    .line 80
    move-result-wide p1

    .line 81
    new-instance p3, Lx0/c1;

    .line 82
    .line 83
    invoke-direct {p3, p1, p2}, Lx0/c1;-><init>(J)V

    .line 84
    .line 85
    .line 86
    iput-object p3, p0, Lr/m1;->l:Lx0/c1;

    .line 87
    .line 88
    sget-object p1, Lr/f2;->b:Ljava/lang/Object;

    .line 89
    .line 90
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    check-cast p1, Ljava/lang/Float;

    .line 95
    .line 96
    if-eqz p1, :cond_1

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    iget-object p2, v4, Lr/v1;->a:Lic/k;

    .line 103
    .line 104
    invoke-interface {p2, v5}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    check-cast p2, Lr/p;

    .line 109
    .line 110
    invoke-virtual {p2}, Lr/p;->b()I

    .line 111
    .line 112
    .line 113
    move-result p3

    .line 114
    const/4 p4, 0x0

    .line 115
    :goto_0
    if-ge p4, p3, :cond_0

    .line 116
    .line 117
    invoke-virtual {p2, p1, p4}, Lr/p;->e(FI)V

    .line 118
    .line 119
    .line 120
    add-int/lit8 p4, p4, 0x1

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_0
    iget-object p1, p0, Lr/m1;->a:Lr/v1;

    .line 124
    .line 125
    iget-object p1, p1, Lr/v1;->b:Lic/k;

    .line 126
    .line 127
    invoke-interface {p1, p2}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    :cond_1
    const/4 p1, 0x3

    .line 132
    invoke-static {p1, v1}, Lr/d;->q(ILjava/lang/Object;)Lr/z0;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    iput-object p1, p0, Lr/m1;->n:Lr/z0;

    .line 137
    .line 138
    return-void
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
.end method


# virtual methods
.method public final a()Lr/h1;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/m1;->d:Lx0/e1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lr/h1;

    .line 8
    .line 9
    return-object v0
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

.method public final c()Lr/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/m1;->c:Lx0/e1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lr/x;

    .line 8
    .line 9
    return-object v0
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

.method public final d(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/m1;->h:Lx0/a1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/a1;->e()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/high16 v1, -0x40800000    # -1.0f

    .line 8
    .line 9
    cmpg-float v0, v0, v1

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lr/m1;->m:Z

    .line 15
    .line 16
    invoke-virtual {p0}, Lr/m1;->a()Lr/h1;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v0, v0, Lr/h1;->c:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-virtual {p0}, Lr/m1;->a()Lr/h1;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v1, v1, Lr/h1;->d:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {v0, v1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, Lr/m1;->a()Lr/h1;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object p1, p1, Lr/h1;->c:Ljava/lang/Object;

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lr/m1;->e(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    invoke-virtual {p0}, Lr/m1;->a()Lr/h1;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0, p1, p2}, Lr/h1;->f(J)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p0, v0}, Lr/m1;->e(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lr/m1;->a()Lr/h1;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0, p1, p2}, Lr/h1;->d(J)Lr/p;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, Lr/m1;->k:Lr/p;

    .line 64
    .line 65
    :cond_1
    return-void
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

.method public final e(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/m1;->j:Lx0/e1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final f(Ljava/lang/Object;Z)V
    .locals 12

    .line 1
    iget-object v0, p0, Lr/m1;->f:Lr/h1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lr/h1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iget-object v1, p0, Lr/m1;->b:Lx0/e1;

    .line 10
    .line 11
    invoke-virtual {v1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v0, v2}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v2, p0, Lr/m1;->l:Lx0/c1;

    .line 20
    .line 21
    iget-object v3, p0, Lr/m1;->d:Lx0/e1;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    new-instance v4, Lr/h1;

    .line 26
    .line 27
    iget-object p2, p0, Lr/m1;->k:Lr/p;

    .line 28
    .line 29
    invoke-virtual {p2}, Lr/p;->c()Lr/p;

    .line 30
    .line 31
    .line 32
    move-result-object v9

    .line 33
    iget-object v5, p0, Lr/m1;->n:Lr/z0;

    .line 34
    .line 35
    iget-object v6, p0, Lr/m1;->a:Lr/v1;

    .line 36
    .line 37
    move-object v8, p1

    .line 38
    move-object v7, p1

    .line 39
    invoke-direct/range {v4 .. v9}, Lr/h1;-><init>(Lr/j;Lr/v1;Ljava/lang/Object;Ljava/lang/Object;Lr/p;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v4}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    iput-boolean p1, p0, Lr/m1;->i:Z

    .line 47
    .line 48
    invoke-virtual {p0}, Lr/m1;->a()Lr/h1;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1}, Lr/h1;->b()J

    .line 53
    .line 54
    .line 55
    move-result-wide p1

    .line 56
    invoke-virtual {v2, p1, p2}, Lx0/c1;->e(J)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    move-object v7, p1

    .line 61
    if-eqz p2, :cond_3

    .line 62
    .line 63
    iget-boolean p1, p0, Lr/m1;->m:Z

    .line 64
    .line 65
    if-nez p1, :cond_3

    .line 66
    .line 67
    invoke-virtual {p0}, Lr/m1;->c()Lr/x;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    instance-of p1, p1, Lr/z0;

    .line 72
    .line 73
    if-eqz p1, :cond_2

    .line 74
    .line 75
    invoke-virtual {p0}, Lr/m1;->c()Lr/x;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    goto :goto_1

    .line 80
    :cond_2
    iget-object p1, p0, Lr/m1;->n:Lr/z0;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    invoke-virtual {p0}, Lr/m1;->c()Lr/x;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    :goto_1
    iget-object p2, p0, Lr/m1;->o:Lr/q1;

    .line 88
    .line 89
    invoke-virtual {p2}, Lr/q1;->e()J

    .line 90
    .line 91
    .line 92
    move-result-wide v4

    .line 93
    iget-object v0, p2, Lr/q1;->h:Lx0/e1;

    .line 94
    .line 95
    const-wide/16 v10, 0x0

    .line 96
    .line 97
    cmp-long v6, v4, v10

    .line 98
    .line 99
    if-gtz v6, :cond_4

    .line 100
    .line 101
    move-object v5, p1

    .line 102
    goto :goto_2

    .line 103
    :cond_4
    invoke-virtual {p2}, Lr/q1;->e()J

    .line 104
    .line 105
    .line 106
    move-result-wide v4

    .line 107
    new-instance v6, Lr/a1;

    .line 108
    .line 109
    invoke-direct {v6, p1, v4, v5}, Lr/a1;-><init>(Lr/x;J)V

    .line 110
    .line 111
    .line 112
    move-object v5, v6

    .line 113
    :goto_2
    new-instance v4, Lr/h1;

    .line 114
    .line 115
    invoke-virtual {v1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    iget-object v9, p0, Lr/m1;->k:Lr/p;

    .line 120
    .line 121
    iget-object v6, p0, Lr/m1;->a:Lr/v1;

    .line 122
    .line 123
    invoke-direct/range {v4 .. v9}, Lr/h1;-><init>(Lr/j;Lr/v1;Ljava/lang/Object;Ljava/lang/Object;Lr/p;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3, v4}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Lr/m1;->a()Lr/h1;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p1}, Lr/h1;->b()J

    .line 134
    .line 135
    .line 136
    move-result-wide v3

    .line 137
    invoke-virtual {v2, v3, v4}, Lx0/c1;->e(J)V

    .line 138
    .line 139
    .line 140
    const/4 p1, 0x0

    .line 141
    iput-boolean p1, p0, Lr/m1;->i:Z

    .line 142
    .line 143
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p2}, Lr/q1;->g()Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-eqz v1, :cond_6

    .line 153
    .line 154
    iget-object p2, p2, Lr/q1;->i:Lh1/s;

    .line 155
    .line 156
    invoke-virtual {p2}, Lh1/s;->size()I

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    move-wide v2, v10

    .line 161
    :goto_3
    if-ge p1, v1, :cond_5

    .line 162
    .line 163
    invoke-virtual {p2, p1}, Lh1/s;->get(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    check-cast v4, Lr/m1;

    .line 168
    .line 169
    iget-object v5, v4, Lr/m1;->l:Lx0/c1;

    .line 170
    .line 171
    iget-object v6, v5, Lx0/c1;->b:Lx0/g2;

    .line 172
    .line 173
    invoke-static {v6, v5}, Lh1/n;->u(Lh1/g0;Lh1/e0;)Lh1/g0;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    check-cast v5, Lx0/g2;

    .line 178
    .line 179
    iget-wide v5, v5, Lx0/g2;->c:J

    .line 180
    .line 181
    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 182
    .line 183
    .line 184
    move-result-wide v2

    .line 185
    invoke-virtual {v4, v10, v11}, Lr/m1;->d(J)V

    .line 186
    .line 187
    .line 188
    add-int/lit8 p1, p1, 0x1

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_5
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 192
    .line 193
    invoke-virtual {v0, p1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    :cond_6
    return-void
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

.method public final g(Ljava/lang/Object;Ljava/lang/Object;Lr/x;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/m1;->b:Lx0/e1;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr/m1;->c:Lx0/e1;

    .line 7
    .line 8
    invoke-virtual {v0, p3}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lr/m1;->a()Lr/h1;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    iget-object p3, p3, Lr/h1;->d:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-static {p3, p1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    if-eqz p3, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lr/m1;->a()Lr/h1;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    iget-object p3, p3, Lr/h1;->c:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {p3, p2}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_0

    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    const/4 p2, 0x0

    .line 37
    invoke-virtual {p0, p1, p2}, Lr/m1;->f(Ljava/lang/Object;Z)V

    .line 38
    .line 39
    .line 40
    return-void
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

.method public final getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/m1;->j:Lx0/e1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public final h(Ljava/lang/Object;Lr/x;)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lr/m1;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lr/m1;->f:Lr/h1;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lr/h1;->c:Ljava/lang/Object;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-static {p1, v0}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    iget-object v0, p0, Lr/m1;->b:Lx0/e1;

    .line 21
    .line 22
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v1, p1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    iget-object v2, p0, Lr/m1;->h:Lx0/a1;

    .line 31
    .line 32
    const/high16 v3, -0x40800000    # -1.0f

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    invoke-virtual {v2}, Lx0/a1;->e()F

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    cmpg-float v1, v1, v3

    .line 41
    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    :goto_1
    return-void

    .line 45
    :cond_2
    invoke-virtual {v0, p1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lr/m1;->c:Lx0/e1;

    .line 49
    .line 50
    invoke-virtual {v0, p2}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Lx0/a1;->e()F

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 58
    .line 59
    cmpg-float p2, p2, v0

    .line 60
    .line 61
    if-nez p2, :cond_3

    .line 62
    .line 63
    move-object p2, p1

    .line 64
    goto :goto_2

    .line 65
    :cond_3
    iget-object p2, p0, Lr/m1;->j:Lx0/e1;

    .line 66
    .line 67
    invoke-virtual {p2}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    :goto_2
    iget-object v1, p0, Lr/m1;->g:Lx0/e1;

    .line 72
    .line 73
    invoke-virtual {v1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    const/4 v5, 0x1

    .line 84
    xor-int/2addr v4, v5

    .line 85
    invoke-virtual {p0, p2, v4}, Lr/m1;->f(Ljava/lang/Object;Z)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Lx0/a1;->e()F

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    const/4 v4, 0x0

    .line 93
    cmpg-float p2, p2, v0

    .line 94
    .line 95
    if-nez p2, :cond_4

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_4
    const/4 v5, 0x0

    .line 99
    :goto_3
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-virtual {v1, p2}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Lx0/a1;->e()F

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    const/4 v1, 0x0

    .line 111
    cmpl-float p2, p2, v1

    .line 112
    .line 113
    if-ltz p2, :cond_5

    .line 114
    .line 115
    invoke-virtual {p0}, Lr/m1;->a()Lr/h1;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {p1}, Lr/h1;->b()J

    .line 120
    .line 121
    .line 122
    move-result-wide p1

    .line 123
    invoke-virtual {p0}, Lr/m1;->a()Lr/h1;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    long-to-float p1, p1

    .line 128
    invoke-virtual {v2}, Lx0/a1;->e()F

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    mul-float p2, p2, p1

    .line 133
    .line 134
    float-to-long p1, p2

    .line 135
    invoke-virtual {v0, p1, p2}, Lr/h1;->f(J)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p0, p1}, Lr/m1;->e(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_5
    invoke-virtual {v2}, Lx0/a1;->e()F

    .line 144
    .line 145
    .line 146
    move-result p2

    .line 147
    cmpg-float p2, p2, v0

    .line 148
    .line 149
    if-nez p2, :cond_6

    .line 150
    .line 151
    invoke-virtual {p0, p1}, Lr/m1;->e(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :cond_6
    :goto_4
    iput-boolean v4, p0, Lr/m1;->i:Z

    .line 155
    .line 156
    invoke-virtual {v2, v3}, Lx0/a1;->f(F)V

    .line 157
    .line 158
    .line 159
    return-void
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

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "current value: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lr/m1;->j:Lx0/e1;

    .line 9
    .line 10
    invoke-virtual {v1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, ", target: "

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lr/m1;->b:Lx0/e1;

    .line 23
    .line 24
    invoke-virtual {v1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ", spec: "

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lr/m1;->c()Lr/x;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0
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

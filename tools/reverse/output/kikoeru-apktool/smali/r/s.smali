.class public final Lr/s;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lr/f;


# instance fields
.field public final a:Lb0/w1;

.field public final b:Lr/v1;

.field public final c:Ljava/lang/Object;

.field public final d:Lr/p;

.field public final e:Lr/p;

.field public final f:Lr/p;

.field public final g:Ljava/lang/Object;

.field public final h:J


# direct methods
.method public constructor <init>(Lr/t;Lr/v1;Ljava/lang/Object;Lr/p;)V
    .locals 10

    .line 1
    new-instance v0, Lb0/w1;

    .line 2
    .line 3
    iget-object p1, p1, Lr/t;->a:Li7/p2;

    .line 4
    .line 5
    const/16 v1, 0x10

    .line 6
    .line 7
    invoke-direct {v0, v1, p1}, Lb0/w1;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lr/s;->a:Lb0/w1;

    .line 14
    .line 15
    iput-object p2, p0, Lr/s;->b:Lr/v1;

    .line 16
    .line 17
    iput-object p3, p0, Lr/s;->c:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object p1, p2, Lr/v1;->a:Lic/k;

    .line 20
    .line 21
    invoke-interface {p1, p3}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lr/p;

    .line 26
    .line 27
    iput-object p1, p0, Lr/s;->d:Lr/p;

    .line 28
    .line 29
    invoke-static {p4}, Lr/d;->k(Lr/p;)Lr/p;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    iput-object p3, p0, Lr/s;->e:Lr/p;

    .line 34
    .line 35
    iget-object p2, p2, Lr/v1;->b:Lic/k;

    .line 36
    .line 37
    invoke-virtual {v0, p1, p4}, Lb0/w1;->P(Lr/p;Lr/p;)Lr/p;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    invoke-interface {p2, p3}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    iput-object p2, p0, Lr/s;->g:Ljava/lang/Object;

    .line 46
    .line 47
    iget-object p2, v0, Lb0/w1;->e:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p2, Lr/p;

    .line 50
    .line 51
    if-nez p2, :cond_0

    .line 52
    .line 53
    invoke-virtual {p1}, Lr/p;->c()Lr/p;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    iput-object p2, v0, Lb0/w1;->e:Ljava/lang/Object;

    .line 58
    .line 59
    :cond_0
    iget-object p2, v0, Lb0/w1;->e:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p2, Lr/p;

    .line 62
    .line 63
    if-eqz p2, :cond_3

    .line 64
    .line 65
    invoke-virtual {p2}, Lr/p;->b()I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    const/4 p3, 0x0

    .line 70
    const-wide/16 v1, 0x0

    .line 71
    .line 72
    const/4 v3, 0x0

    .line 73
    :goto_0
    if-ge v3, p2, :cond_1

    .line 74
    .line 75
    iget-object v4, v0, Lb0/w1;->c:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v4, Li7/p2;

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p4, v3}, Lr/p;->a(I)F

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    iget-object v4, v4, Li7/p2;->a:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v4, Lq/v0;

    .line 89
    .line 90
    invoke-virtual {v4, v5}, Lq/v0;->b(F)D

    .line 91
    .line 92
    .line 93
    move-result-wide v4

    .line 94
    sget v6, Lq/w0;->a:F

    .line 95
    .line 96
    float-to-double v6, v6

    .line 97
    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    .line 98
    .line 99
    sub-double/2addr v6, v8

    .line 100
    div-double/2addr v4, v6

    .line 101
    invoke-static {v4, v5}, Ljava/lang/Math;->exp(D)D

    .line 102
    .line 103
    .line 104
    move-result-wide v4

    .line 105
    const-wide v6, 0x408f400000000000L    # 1000.0

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    mul-double v4, v4, v6

    .line 111
    .line 112
    double-to-long v4, v4

    .line 113
    const-wide/32 v6, 0xf4240

    .line 114
    .line 115
    .line 116
    mul-long v4, v4, v6

    .line 117
    .line 118
    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 119
    .line 120
    .line 121
    move-result-wide v1

    .line 122
    add-int/lit8 v3, v3, 0x1

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_1
    iput-wide v1, p0, Lr/s;->h:J

    .line 126
    .line 127
    iget-object p1, p0, Lr/s;->a:Lb0/w1;

    .line 128
    .line 129
    iget-object p2, p0, Lr/s;->d:Lr/p;

    .line 130
    .line 131
    invoke-virtual {p1, v1, v2, p2, p4}, Lb0/w1;->Q(JLr/p;Lr/p;)Lr/p;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-static {p1}, Lr/d;->k(Lr/p;)Lr/p;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    iput-object p1, p0, Lr/s;->f:Lr/p;

    .line 140
    .line 141
    invoke-virtual {p1}, Lr/p;->b()I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    :goto_1
    if-ge p3, p1, :cond_2

    .line 146
    .line 147
    iget-object p2, p0, Lr/s;->f:Lr/p;

    .line 148
    .line 149
    invoke-virtual {p2, p3}, Lr/p;->a(I)F

    .line 150
    .line 151
    .line 152
    move-result p4

    .line 153
    iget-object v0, p0, Lr/s;->a:Lb0/w1;

    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    iget-object v0, p0, Lr/s;->a:Lb0/w1;

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    const/4 v0, 0x0

    .line 164
    const/high16 v1, -0x80000000

    .line 165
    .line 166
    invoke-static {p4, v1, v0}, Lnh/b;->j(FFF)F

    .line 167
    .line 168
    .line 169
    move-result p4

    .line 170
    invoke-virtual {p2, p4, p3}, Lr/p;->e(FI)V

    .line 171
    .line 172
    .line 173
    add-int/lit8 p3, p3, 0x1

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_2
    return-void

    .line 177
    :cond_3
    const-string p1, "velocityVector"

    .line 178
    .line 179
    invoke-static {p1}, Ljc/l;->k(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    const/4 p1, 0x0

    .line 183
    throw p1
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
.method public final a()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
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

.method public final b()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lr/s;->h:J

    .line 2
    .line 3
    return-wide v0
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

.method public final c()Lr/v1;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/s;->b:Lr/v1;

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

.method public final d(J)Lr/p;
    .locals 3

    .line 1
    invoke-static {p0, p1, p2}, Lq/t0;->a(Lr/f;J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lr/s;->d:Lr/p;

    .line 8
    .line 9
    iget-object v1, p0, Lr/s;->e:Lr/p;

    .line 10
    .line 11
    iget-object v2, p0, Lr/s;->a:Lb0/w1;

    .line 12
    .line 13
    invoke-virtual {v2, p1, p2, v0, v1}, Lb0/w1;->Q(JLr/p;Lr/p;)Lr/p;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    iget-object p1, p0, Lr/s;->f:Lr/p;

    .line 19
    .line 20
    return-object p1
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

.method public final synthetic e(J)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lq/t0;->a(Lr/f;J)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final f(J)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static/range {p0 .. p2}, Lq/t0;->a(Lr/f;J)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_6

    .line 8
    .line 9
    iget-object v1, v0, Lr/s;->b:Lr/v1;

    .line 10
    .line 11
    iget-object v1, v1, Lr/v1;->b:Lic/k;

    .line 12
    .line 13
    iget-object v2, v0, Lr/s;->a:Lb0/w1;

    .line 14
    .line 15
    iget-object v3, v2, Lb0/w1;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Lr/p;

    .line 18
    .line 19
    iget-object v4, v0, Lr/s;->d:Lr/p;

    .line 20
    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {v4}, Lr/p;->c()Lr/p;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iput-object v3, v2, Lb0/w1;->d:Ljava/lang/Object;

    .line 28
    .line 29
    :cond_0
    iget-object v3, v2, Lb0/w1;->d:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, Lr/p;

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    const-string v6, "valueVector"

    .line 35
    .line 36
    if-eqz v3, :cond_5

    .line 37
    .line 38
    invoke-virtual {v3}, Lr/p;->b()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    const/4 v7, 0x0

    .line 43
    :goto_0
    if-ge v7, v3, :cond_3

    .line 44
    .line 45
    iget-object v8, v2, Lb0/w1;->d:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v8, Lr/p;

    .line 48
    .line 49
    if-eqz v8, :cond_2

    .line 50
    .line 51
    iget-object v9, v2, Lb0/w1;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v9, Li7/p2;

    .line 54
    .line 55
    invoke-virtual {v4, v7}, Lr/p;->a(I)F

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    iget-object v11, v0, Lr/s;->e:Lr/p;

    .line 60
    .line 61
    invoke-virtual {v11, v7}, Lr/p;->a(I)F

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    const-wide/32 v12, 0xf4240

    .line 66
    .line 67
    .line 68
    div-long v12, p1, v12

    .line 69
    .line 70
    iget-object v9, v9, Li7/p2;->a:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v9, Lq/v0;

    .line 73
    .line 74
    invoke-virtual {v9, v11}, Lq/v0;->a(F)Lq/u0;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    iget-wide v14, v9, Lq/u0;->c:J

    .line 79
    .line 80
    const-wide/16 v16, 0x0

    .line 81
    .line 82
    cmp-long v11, v14, v16

    .line 83
    .line 84
    if-lez v11, :cond_1

    .line 85
    .line 86
    long-to-float v11, v12

    .line 87
    long-to-float v12, v14

    .line 88
    div-float/2addr v11, v12

    .line 89
    goto :goto_1

    .line 90
    :cond_1
    const/high16 v11, 0x3f800000    # 1.0f

    .line 91
    .line 92
    :goto_1
    iget v12, v9, Lq/u0;->b:F

    .line 93
    .line 94
    iget v9, v9, Lq/u0;->a:F

    .line 95
    .line 96
    invoke-static {v9}, Ljava/lang/Math;->signum(F)F

    .line 97
    .line 98
    .line 99
    move-result v9

    .line 100
    mul-float v9, v9, v12

    .line 101
    .line 102
    invoke-static {v11}, Lq/b;->a(F)Lq/a;

    .line 103
    .line 104
    .line 105
    move-result-object v11

    .line 106
    iget v11, v11, Lq/a;->a:F

    .line 107
    .line 108
    mul-float v9, v9, v11

    .line 109
    .line 110
    add-float/2addr v9, v10

    .line 111
    invoke-virtual {v8, v9, v7}, Lr/p;->e(FI)V

    .line 112
    .line 113
    .line 114
    add-int/lit8 v7, v7, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_2
    invoke-static {v6}, Ljc/l;->k(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw v5

    .line 121
    :cond_3
    iget-object v2, v2, Lb0/w1;->d:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v2, Lr/p;

    .line 124
    .line 125
    if-eqz v2, :cond_4

    .line 126
    .line 127
    invoke-interface {v1, v2}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    return-object v1

    .line 132
    :cond_4
    invoke-static {v6}, Ljc/l;->k(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v5

    .line 136
    :cond_5
    invoke-static {v6}, Ljc/l;->k(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw v5

    .line 140
    :cond_6
    iget-object v1, v0, Lr/s;->g:Ljava/lang/Object;

    .line 141
    .line 142
    return-object v1
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
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method public final g()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/s;->g:Ljava/lang/Object;

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

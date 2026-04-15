.class public final Le5/b;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ln5/j;


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:Ln5/o;

.field public final c:Ls4/h;

.field public d:Le5/k;

.field public e:J

.field public f:J

.field public g:J

.field public h:J

.field public i:Z

.field public j:Ljava/io/IOException;

.field public k:Z

.field public final synthetic l:Le5/c;


# direct methods
.method public constructor <init>(Le5/c;Landroid/net/Uri;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le5/b;->l:Le5/c;

    .line 5
    .line 6
    iput-object p2, p0, Le5/b;->a:Landroid/net/Uri;

    .line 7
    .line 8
    new-instance p2, Ln5/o;

    .line 9
    .line 10
    const-string v0, "DefaultHlsPlaylistTracker:MediaPlaylist"

    .line 11
    .line 12
    invoke-direct {p2, v0}, Ln5/o;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Le5/b;->b:Ln5/o;

    .line 16
    .line 17
    iget-object p1, p1, Le5/c;->a:Lb0/c1;

    .line 18
    .line 19
    iget-object p1, p1, Lb0/c1;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Ls4/g;

    .line 22
    .line 23
    invoke-interface {p1}, Ls4/g;->q()Ls4/h;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Le5/b;->c:Ls4/h;

    .line 28
    .line 29
    return-void
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

.method public static a(Le5/b;J)Z
    .locals 8

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    add-long/2addr v0, p1

    .line 6
    iput-wide v0, p0, Le5/b;->h:J

    .line 7
    .line 8
    iget-object p1, p0, Le5/b;->a:Landroid/net/Uri;

    .line 9
    .line 10
    iget-object p0, p0, Le5/b;->l:Le5/c;

    .line 11
    .line 12
    iget-object p2, p0, Le5/c;->k:Landroid/net/Uri;

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const/4 p2, 0x0

    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    iget-object p1, p0, Le5/c;->j:Le5/n;

    .line 22
    .line 23
    iget-object p1, p1, Le5/n;->e:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 30
    .line 31
    .line 32
    move-result-wide v1

    .line 33
    const/4 v3, 0x0

    .line 34
    :goto_0
    if-ge v3, v0, :cond_1

    .line 35
    .line 36
    iget-object v4, p0, Le5/c;->d:Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, Le5/m;

    .line 43
    .line 44
    iget-object v5, v5, Le5/m;->a:Landroid/net/Uri;

    .line 45
    .line 46
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Le5/b;

    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iget-wide v5, v4, Le5/b;->h:J

    .line 56
    .line 57
    cmp-long v7, v1, v5

    .line 58
    .line 59
    if-lez v7, :cond_0

    .line 60
    .line 61
    iget-object p1, v4, Le5/b;->a:Landroid/net/Uri;

    .line 62
    .line 63
    iput-object p1, p0, Le5/c;->k:Landroid/net/Uri;

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Le5/c;->b(Landroid/net/Uri;)Landroid/net/Uri;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {v4, p0}, Le5/b;->e(Landroid/net/Uri;)V

    .line 70
    .line 71
    .line 72
    return p2

    .line 73
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    const/4 p0, 0x1

    .line 77
    return p0

    .line 78
    :cond_2
    return p2
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


# virtual methods
.method public final b()Landroid/net/Uri;
    .locals 8

    .line 1
    iget-object v0, p0, Le5/b;->d:Le5/k;

    .line 2
    .line 3
    iget-object v1, p0, Le5/b;->a:Landroid/net/Uri;

    .line 4
    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    iget-object v0, v0, Le5/k;->v:Le5/j;

    .line 8
    .line 9
    iget-wide v2, v0, Le5/j;->a:J

    .line 10
    .line 11
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long v6, v2, v4

    .line 17
    .line 18
    if-nez v6, :cond_0

    .line 19
    .line 20
    iget-boolean v0, v0, Le5/j;->e:Z

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    invoke-virtual {v1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Le5/b;->d:Le5/k;

    .line 30
    .line 31
    iget-object v2, v1, Le5/k;->v:Le5/j;

    .line 32
    .line 33
    iget-boolean v2, v2, Le5/j;->e:Z

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    iget-wide v2, v1, Le5/k;->k:J

    .line 38
    .line 39
    iget-object v1, v1, Le5/k;->r:Lya/i0;

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    int-to-long v6, v1

    .line 46
    add-long/2addr v2, v6

    .line 47
    const-string v1, "_HLS_msn"

    .line 48
    .line 49
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Le5/b;->d:Le5/k;

    .line 57
    .line 58
    iget-wide v2, v1, Le5/k;->n:J

    .line 59
    .line 60
    cmp-long v6, v2, v4

    .line 61
    .line 62
    if-eqz v6, :cond_2

    .line 63
    .line 64
    iget-object v1, v1, Le5/k;->s:Lya/i0;

    .line 65
    .line 66
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-nez v3, :cond_1

    .line 75
    .line 76
    invoke-static {v1}, Lya/q;->k(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Le5/f;

    .line 81
    .line 82
    iget-boolean v1, v1, Le5/f;->m:Z

    .line 83
    .line 84
    if-eqz v1, :cond_1

    .line 85
    .line 86
    add-int/lit8 v2, v2, -0x1

    .line 87
    .line 88
    :cond_1
    const-string v1, "_HLS_part"

    .line 89
    .line 90
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 95
    .line 96
    .line 97
    :cond_2
    iget-object v1, p0, Le5/b;->d:Le5/k;

    .line 98
    .line 99
    iget-object v1, v1, Le5/k;->v:Le5/j;

    .line 100
    .line 101
    iget-wide v2, v1, Le5/j;->a:J

    .line 102
    .line 103
    cmp-long v6, v2, v4

    .line 104
    .line 105
    if-eqz v6, :cond_4

    .line 106
    .line 107
    iget-boolean v1, v1, Le5/j;->b:Z

    .line 108
    .line 109
    if-eqz v1, :cond_3

    .line 110
    .line 111
    const-string v1, "v2"

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_3
    const-string v1, "YES"

    .line 115
    .line 116
    :goto_0
    const-string v2, "_HLS_skip"

    .line 117
    .line 118
    invoke-virtual {v0, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 119
    .line 120
    .line 121
    :cond_4
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    return-object v0

    .line 126
    :cond_5
    :goto_1
    return-object v1
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
.end method

.method public final c(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Le5/b;->b()Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object p1, p0, Le5/b;->a:Landroid/net/Uri;

    .line 9
    .line 10
    :goto_0
    invoke-virtual {p0, p1}, Le5/b;->e(Landroid/net/Uri;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public final d(Landroid/net/Uri;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Le5/b;->l:Le5/c;

    .line 4
    .line 5
    iget-object v2, v1, Le5/c;->b:Le5/r;

    .line 6
    .line 7
    iget-object v3, v1, Le5/c;->j:Le5/n;

    .line 8
    .line 9
    iget-object v4, v0, Le5/b;->d:Le5/k;

    .line 10
    .line 11
    invoke-interface {v2, v3, v4}, Le5/r;->J(Le5/n;Le5/k;)Ln5/q;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    sget-object v9, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 16
    .line 17
    const-string v3, "The uri must be set."

    .line 18
    .line 19
    move-object/from16 v4, p1

    .line 20
    .line 21
    invoke-static {v4, v3}, Lp4/c;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    new-instance v3, Ls4/m;

    .line 25
    .line 26
    const-wide/16 v5, 0x0

    .line 27
    .line 28
    const/4 v7, 0x1

    .line 29
    const/4 v8, 0x0

    .line 30
    const-wide/16 v10, 0x0

    .line 31
    .line 32
    const-wide/16 v12, -0x1

    .line 33
    .line 34
    const/4 v14, 0x0

    .line 35
    const/4 v15, 0x1

    .line 36
    invoke-direct/range {v3 .. v15}, Ls4/m;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    new-instance v4, Ln5/r;

    .line 40
    .line 41
    iget-object v5, v0, Le5/b;->c:Ls4/h;

    .line 42
    .line 43
    const/4 v6, 0x4

    .line 44
    invoke-direct {v4, v5, v3, v6, v2}, Ln5/r;-><init>(Ls4/h;Ls4/m;ILn5/q;)V

    .line 45
    .line 46
    .line 47
    iget-object v1, v1, Le5/c;->c:Lm3/l;

    .line 48
    .line 49
    iget v2, v4, Ln5/r;->c:I

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Lm3/l;->u(I)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    iget-object v2, v0, Le5/b;->b:Ln5/o;

    .line 56
    .line 57
    invoke-virtual {v2, v4, v0, v1}, Ln5/o;->f(Ln5/l;Ln5/j;I)V

    .line 58
    .line 59
    .line 60
    return-void
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

.method public final e(Landroid/net/Uri;)V
    .locals 7

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Le5/b;->h:J

    .line 4
    .line 5
    iget-boolean v0, p0, Le5/b;->i:Z

    .line 6
    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Le5/b;->b:Ln5/o;

    .line 10
    .line 11
    invoke-virtual {v0}, Ln5/o;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_2

    .line 16
    .line 17
    invoke-virtual {v0}, Ln5/o;->c()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    iget-wide v2, p0, Le5/b;->g:J

    .line 29
    .line 30
    cmp-long v4, v0, v2

    .line 31
    .line 32
    if-gez v4, :cond_1

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    iput-boolean v4, p0, Le5/b;->i:Z

    .line 36
    .line 37
    iget-object v4, p0, Le5/b;->l:Le5/c;

    .line 38
    .line 39
    iget-object v4, v4, Le5/c;->h:Landroid/os/Handler;

    .line 40
    .line 41
    new-instance v5, Lb5/h;

    .line 42
    .line 43
    const/16 v6, 0xd

    .line 44
    .line 45
    invoke-direct {v5, v6, p0, p1}, Lb5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sub-long/2addr v2, v0

    .line 49
    invoke-virtual {v4, v5, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    invoke-virtual {p0, p1}, Le5/b;->d(Landroid/net/Uri;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    :goto_0
    return-void
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

.method public final f(Le5/k;Lj5/u;)V
    .locals 72

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Le5/b;->d:Le5/k;

    .line 6
    .line 7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    iput-wide v3, v0, Le5/b;->e:J

    .line 12
    .line 13
    iget-object v5, v0, Le5/b;->l:Le5/c;

    .line 14
    .line 15
    iget-object v6, v5, Le5/c;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 16
    .line 17
    if-eqz v2, :cond_5

    .line 18
    .line 19
    iget-wide v9, v1, Le5/k;->k:J

    .line 20
    .line 21
    iget-wide v11, v2, Le5/k;->k:J

    .line 22
    .line 23
    cmp-long v13, v9, v11

    .line 24
    .line 25
    if-lez v13, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    if-gez v13, :cond_2

    .line 29
    .line 30
    :cond_1
    const/4 v9, 0x0

    .line 31
    goto :goto_1

    .line 32
    :cond_2
    iget-object v9, v1, Le5/k;->r:Lya/i0;

    .line 33
    .line 34
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v9

    .line 38
    iget-object v10, v2, Le5/k;->r:Lya/i0;

    .line 39
    .line 40
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v10

    .line 44
    sub-int/2addr v9, v10

    .line 45
    if-eqz v9, :cond_4

    .line 46
    .line 47
    if-lez v9, :cond_1

    .line 48
    .line 49
    :cond_3
    :goto_0
    const/4 v9, 0x1

    .line 50
    goto :goto_1

    .line 51
    :cond_4
    iget-object v9, v1, Le5/k;->s:Lya/i0;

    .line 52
    .line 53
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    iget-object v10, v2, Le5/k;->s:Lya/i0;

    .line 58
    .line 59
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    if-gt v9, v10, :cond_3

    .line 64
    .line 65
    if-ne v9, v10, :cond_1

    .line 66
    .line 67
    iget-boolean v9, v1, Le5/k;->o:Z

    .line 68
    .line 69
    if-eqz v9, :cond_1

    .line 70
    .line 71
    iget-boolean v9, v2, Le5/k;->o:Z

    .line 72
    .line 73
    if-nez v9, :cond_1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :goto_1
    iget-object v10, v1, Le5/k;->r:Lya/i0;

    .line 81
    .line 82
    iget-wide v11, v1, Le5/k;->k:J

    .line 83
    .line 84
    const-wide/16 v37, 0x0

    .line 85
    .line 86
    if-nez v9, :cond_8

    .line 87
    .line 88
    iget-boolean v9, v1, Le5/k;->o:Z

    .line 89
    .line 90
    if-eqz v9, :cond_7

    .line 91
    .line 92
    iget-boolean v9, v2, Le5/k;->o:Z

    .line 93
    .line 94
    if-eqz v9, :cond_6

    .line 95
    .line 96
    move-object v10, v2

    .line 97
    move-object/from16 v67, v6

    .line 98
    .line 99
    move-wide v8, v11

    .line 100
    const/4 v6, 0x0

    .line 101
    const/16 v66, 0x1

    .line 102
    .line 103
    goto/16 :goto_c

    .line 104
    .line 105
    :cond_6
    new-instance v39, Le5/k;

    .line 106
    .line 107
    iget v9, v2, Le5/k;->d:I

    .line 108
    .line 109
    iget-object v10, v2, Le5/o;->a:Ljava/lang/String;

    .line 110
    .line 111
    iget-object v14, v2, Le5/o;->b:Ljava/util/List;

    .line 112
    .line 113
    move-object/from16 v42, v14

    .line 114
    .line 115
    iget-wide v13, v2, Le5/k;->e:J

    .line 116
    .line 117
    iget-boolean v15, v2, Le5/k;->g:Z

    .line 118
    .line 119
    const/16 v66, 0x1

    .line 120
    .line 121
    iget-wide v7, v2, Le5/k;->h:J

    .line 122
    .line 123
    move-object/from16 v67, v6

    .line 124
    .line 125
    iget-boolean v6, v2, Le5/k;->i:Z

    .line 126
    .line 127
    move/from16 v48, v6

    .line 128
    .line 129
    iget v6, v2, Le5/k;->j:I

    .line 130
    .line 131
    move/from16 v49, v6

    .line 132
    .line 133
    move-wide/from16 v46, v7

    .line 134
    .line 135
    iget-wide v6, v2, Le5/k;->k:J

    .line 136
    .line 137
    iget v8, v2, Le5/k;->l:I

    .line 138
    .line 139
    move-wide/from16 v50, v6

    .line 140
    .line 141
    iget-wide v6, v2, Le5/k;->m:J

    .line 142
    .line 143
    move-wide/from16 v53, v6

    .line 144
    .line 145
    iget-wide v6, v2, Le5/k;->n:J

    .line 146
    .line 147
    move-wide/from16 v55, v6

    .line 148
    .line 149
    iget-boolean v6, v2, Le5/o;->c:Z

    .line 150
    .line 151
    iget-boolean v7, v2, Le5/k;->p:Z

    .line 152
    .line 153
    move/from16 v57, v6

    .line 154
    .line 155
    iget-object v6, v2, Le5/k;->q:Lm4/n;

    .line 156
    .line 157
    move-object/from16 v60, v6

    .line 158
    .line 159
    iget-object v6, v2, Le5/k;->r:Lya/i0;

    .line 160
    .line 161
    move-object/from16 v61, v6

    .line 162
    .line 163
    iget-object v6, v2, Le5/k;->s:Lya/i0;

    .line 164
    .line 165
    move-object/from16 v62, v6

    .line 166
    .line 167
    iget-object v6, v2, Le5/k;->v:Le5/j;

    .line 168
    .line 169
    move-object/from16 v63, v6

    .line 170
    .line 171
    iget-object v6, v2, Le5/k;->t:Lya/k0;

    .line 172
    .line 173
    move-object/from16 v64, v6

    .line 174
    .line 175
    iget-object v6, v2, Le5/k;->w:Lya/i0;

    .line 176
    .line 177
    const/16 v58, 0x1

    .line 178
    .line 179
    move-object/from16 v65, v6

    .line 180
    .line 181
    move/from16 v59, v7

    .line 182
    .line 183
    move/from16 v52, v8

    .line 184
    .line 185
    move/from16 v40, v9

    .line 186
    .line 187
    move-object/from16 v41, v10

    .line 188
    .line 189
    move-wide/from16 v43, v13

    .line 190
    .line 191
    move/from16 v45, v15

    .line 192
    .line 193
    invoke-direct/range {v39 .. v65}, Le5/k;-><init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLm4/n;Ljava/util/List;Ljava/util/List;Le5/j;Ljava/util/Map;Ljava/util/List;)V

    .line 194
    .line 195
    .line 196
    move-wide v8, v11

    .line 197
    move-object/from16 v10, v39

    .line 198
    .line 199
    :goto_2
    const/4 v6, 0x0

    .line 200
    goto/16 :goto_c

    .line 201
    .line 202
    :cond_7
    move-object/from16 v67, v6

    .line 203
    .line 204
    const/16 v66, 0x1

    .line 205
    .line 206
    move-object v10, v2

    .line 207
    move-wide v8, v11

    .line 208
    goto :goto_2

    .line 209
    :cond_8
    move-object/from16 v67, v6

    .line 210
    .line 211
    const/16 v66, 0x1

    .line 212
    .line 213
    iget-boolean v6, v1, Le5/k;->p:Z

    .line 214
    .line 215
    if-eqz v6, :cond_9

    .line 216
    .line 217
    iget-wide v6, v1, Le5/k;->h:J

    .line 218
    .line 219
    :goto_3
    move-wide/from16 v17, v6

    .line 220
    .line 221
    goto :goto_7

    .line 222
    :cond_9
    iget-object v6, v5, Le5/c;->l:Le5/k;

    .line 223
    .line 224
    if-eqz v6, :cond_a

    .line 225
    .line 226
    iget-wide v6, v6, Le5/k;->h:J

    .line 227
    .line 228
    goto :goto_4

    .line 229
    :cond_a
    move-wide/from16 v6, v37

    .line 230
    .line 231
    :goto_4
    if-nez v2, :cond_b

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_b
    iget-wide v8, v2, Le5/k;->h:J

    .line 235
    .line 236
    iget-wide v13, v2, Le5/k;->k:J

    .line 237
    .line 238
    iget-object v15, v2, Le5/k;->r:Lya/i0;

    .line 239
    .line 240
    move-wide/from16 v17, v6

    .line 241
    .line 242
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 243
    .line 244
    .line 245
    move-result v6

    .line 246
    move-wide/from16 v19, v8

    .line 247
    .line 248
    sub-long v7, v11, v13

    .line 249
    .line 250
    long-to-int v8, v7

    .line 251
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 252
    .line 253
    .line 254
    move-result v7

    .line 255
    if-ge v8, v7, :cond_c

    .line 256
    .line 257
    invoke-interface {v15, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    check-cast v7, Le5/h;

    .line 262
    .line 263
    goto :goto_5

    .line 264
    :cond_c
    const/4 v7, 0x0

    .line 265
    :goto_5
    if-eqz v7, :cond_d

    .line 266
    .line 267
    iget-wide v6, v7, Le5/i;->e:J

    .line 268
    .line 269
    :goto_6
    add-long v6, v19, v6

    .line 270
    .line 271
    goto :goto_3

    .line 272
    :cond_d
    int-to-long v6, v6

    .line 273
    sub-long v8, v11, v13

    .line 274
    .line 275
    cmp-long v13, v6, v8

    .line 276
    .line 277
    if-nez v13, :cond_e

    .line 278
    .line 279
    iget-wide v6, v2, Le5/k;->u:J

    .line 280
    .line 281
    goto :goto_6

    .line 282
    :cond_e
    :goto_7
    iget-boolean v6, v1, Le5/k;->i:Z

    .line 283
    .line 284
    if-eqz v6, :cond_f

    .line 285
    .line 286
    iget v6, v1, Le5/k;->j:I

    .line 287
    .line 288
    move/from16 v20, v6

    .line 289
    .line 290
    move-object/from16 v32, v10

    .line 291
    .line 292
    const/4 v7, 0x0

    .line 293
    goto :goto_b

    .line 294
    :cond_f
    iget-object v6, v5, Le5/c;->l:Le5/k;

    .line 295
    .line 296
    if-eqz v6, :cond_10

    .line 297
    .line 298
    iget v6, v6, Le5/k;->j:I

    .line 299
    .line 300
    goto :goto_8

    .line 301
    :cond_10
    const/4 v6, 0x0

    .line 302
    :goto_8
    if-nez v2, :cond_12

    .line 303
    .line 304
    :cond_11
    const/4 v7, 0x0

    .line 305
    goto :goto_a

    .line 306
    :cond_12
    iget-wide v7, v2, Le5/k;->k:J

    .line 307
    .line 308
    sub-long v7, v11, v7

    .line 309
    .line 310
    long-to-int v8, v7

    .line 311
    iget-object v7, v2, Le5/k;->r:Lya/i0;

    .line 312
    .line 313
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 314
    .line 315
    .line 316
    move-result v9

    .line 317
    if-ge v8, v9, :cond_13

    .line 318
    .line 319
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v7

    .line 323
    check-cast v7, Le5/h;

    .line 324
    .line 325
    goto :goto_9

    .line 326
    :cond_13
    const/4 v7, 0x0

    .line 327
    :goto_9
    if-eqz v7, :cond_11

    .line 328
    .line 329
    iget v6, v2, Le5/k;->j:I

    .line 330
    .line 331
    iget v7, v7, Le5/i;->d:I

    .line 332
    .line 333
    add-int/2addr v6, v7

    .line 334
    const/4 v7, 0x0

    .line 335
    invoke-interface {v10, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v8

    .line 339
    check-cast v8, Le5/h;

    .line 340
    .line 341
    iget v8, v8, Le5/i;->d:I

    .line 342
    .line 343
    sub-int/2addr v6, v8

    .line 344
    :goto_a
    move/from16 v20, v6

    .line 345
    .line 346
    move-object/from16 v32, v10

    .line 347
    .line 348
    :goto_b
    new-instance v10, Le5/k;

    .line 349
    .line 350
    move-wide v8, v11

    .line 351
    iget v11, v1, Le5/k;->d:I

    .line 352
    .line 353
    iget-object v12, v1, Le5/o;->a:Ljava/lang/String;

    .line 354
    .line 355
    iget-object v13, v1, Le5/o;->b:Ljava/util/List;

    .line 356
    .line 357
    iget-wide v14, v1, Le5/k;->e:J

    .line 358
    .line 359
    iget-boolean v6, v1, Le5/k;->g:Z

    .line 360
    .line 361
    move-wide/from16 v21, v8

    .line 362
    .line 363
    iget-wide v7, v1, Le5/k;->k:J

    .line 364
    .line 365
    iget v9, v1, Le5/k;->l:I

    .line 366
    .line 367
    move/from16 v19, v6

    .line 368
    .line 369
    move-wide/from16 v23, v7

    .line 370
    .line 371
    iget-wide v6, v1, Le5/k;->m:J

    .line 372
    .line 373
    move-wide/from16 v25, v6

    .line 374
    .line 375
    iget-wide v6, v1, Le5/k;->n:J

    .line 376
    .line 377
    iget-boolean v8, v1, Le5/o;->c:Z

    .line 378
    .line 379
    move-wide/from16 v27, v6

    .line 380
    .line 381
    iget-boolean v6, v1, Le5/k;->o:Z

    .line 382
    .line 383
    iget-boolean v7, v1, Le5/k;->p:Z

    .line 384
    .line 385
    move/from16 v29, v6

    .line 386
    .line 387
    iget-object v6, v1, Le5/k;->q:Lm4/n;

    .line 388
    .line 389
    move-object/from16 v31, v6

    .line 390
    .line 391
    iget-object v6, v1, Le5/k;->s:Lya/i0;

    .line 392
    .line 393
    move-object/from16 v33, v6

    .line 394
    .line 395
    iget-object v6, v1, Le5/k;->v:Le5/j;

    .line 396
    .line 397
    move-object/from16 v34, v6

    .line 398
    .line 399
    iget-object v6, v1, Le5/k;->t:Lya/k0;

    .line 400
    .line 401
    move-object/from16 v35, v6

    .line 402
    .line 403
    iget-object v6, v1, Le5/k;->w:Lya/i0;

    .line 404
    .line 405
    move/from16 v16, v19

    .line 406
    .line 407
    const/16 v30, 0x0

    .line 408
    .line 409
    const/16 v19, 0x1

    .line 410
    .line 411
    move-object/from16 v36, v6

    .line 412
    .line 413
    move-object/from16 v6, v30

    .line 414
    .line 415
    move/from16 v30, v7

    .line 416
    .line 417
    move-wide/from16 v68, v27

    .line 418
    .line 419
    move/from16 v28, v8

    .line 420
    .line 421
    move-wide/from16 v70, v23

    .line 422
    .line 423
    move/from16 v23, v9

    .line 424
    .line 425
    move-wide/from16 v8, v21

    .line 426
    .line 427
    move-wide/from16 v21, v70

    .line 428
    .line 429
    move-wide/from16 v24, v25

    .line 430
    .line 431
    move-wide/from16 v26, v68

    .line 432
    .line 433
    invoke-direct/range {v10 .. v36}, Le5/k;-><init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLm4/n;Ljava/util/List;Ljava/util/List;Le5/j;Ljava/util/Map;Ljava/util/List;)V

    .line 434
    .line 435
    .line 436
    :goto_c
    iput-object v10, v0, Le5/b;->d:Le5/k;

    .line 437
    .line 438
    iget-object v7, v0, Le5/b;->a:Landroid/net/Uri;

    .line 439
    .line 440
    if-eq v10, v2, :cond_16

    .line 441
    .line 442
    iput-object v6, v0, Le5/b;->j:Ljava/io/IOException;

    .line 443
    .line 444
    iput-wide v3, v0, Le5/b;->f:J

    .line 445
    .line 446
    iget-object v1, v5, Le5/c;->k:Landroid/net/Uri;

    .line 447
    .line 448
    invoke-virtual {v7, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    move-result v1

    .line 452
    if-eqz v1, :cond_15

    .line 453
    .line 454
    iget-object v1, v5, Le5/c;->l:Le5/k;

    .line 455
    .line 456
    if-nez v1, :cond_14

    .line 457
    .line 458
    iget-boolean v1, v10, Le5/k;->o:Z

    .line 459
    .line 460
    xor-int/lit8 v1, v1, 0x1

    .line 461
    .line 462
    iput-boolean v1, v5, Le5/c;->m:Z

    .line 463
    .line 464
    iget-wide v8, v10, Le5/k;->h:J

    .line 465
    .line 466
    iput-wide v8, v5, Le5/c;->n:J

    .line 467
    .line 468
    :cond_14
    iput-object v10, v5, Le5/c;->l:Le5/k;

    .line 469
    .line 470
    iget-object v1, v5, Le5/c;->i:Lc5/l;

    .line 471
    .line 472
    invoke-virtual {v1, v10}, Lc5/l;->v(Le5/k;)V

    .line 473
    .line 474
    .line 475
    :cond_15
    invoke-virtual/range {v67 .. v67}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 480
    .line 481
    .line 482
    move-result v6

    .line 483
    if-eqz v6, :cond_19

    .line 484
    .line 485
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v6

    .line 489
    check-cast v6, Le5/s;

    .line 490
    .line 491
    invoke-interface {v6}, Le5/s;->a()V

    .line 492
    .line 493
    .line 494
    goto :goto_d

    .line 495
    :cond_16
    iget-boolean v10, v10, Le5/k;->o:Z

    .line 496
    .line 497
    if-nez v10, :cond_19

    .line 498
    .line 499
    iget-object v1, v1, Le5/k;->r:Lya/i0;

    .line 500
    .line 501
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 502
    .line 503
    .line 504
    move-result v1

    .line 505
    int-to-long v10, v1

    .line 506
    add-long/2addr v8, v10

    .line 507
    iget-object v1, v0, Le5/b;->d:Le5/k;

    .line 508
    .line 509
    iget-wide v10, v1, Le5/k;->k:J

    .line 510
    .line 511
    cmp-long v12, v8, v10

    .line 512
    .line 513
    if-gez v12, :cond_17

    .line 514
    .line 515
    new-instance v13, Landroidx/media3/exoplayer/offline/e;

    .line 516
    .line 517
    invoke-direct {v13}, Ljava/io/IOException;-><init>()V

    .line 518
    .line 519
    .line 520
    const/4 v8, 0x1

    .line 521
    goto :goto_f

    .line 522
    :cond_17
    iget-wide v8, v0, Le5/b;->f:J

    .line 523
    .line 524
    sub-long v8, v3, v8

    .line 525
    .line 526
    long-to-double v8, v8

    .line 527
    iget-wide v10, v1, Le5/k;->m:J

    .line 528
    .line 529
    invoke-static {v10, v11}, Lp4/c0;->c0(J)J

    .line 530
    .line 531
    .line 532
    move-result-wide v10

    .line 533
    long-to-double v10, v10

    .line 534
    const-wide/high16 v12, 0x400c000000000000L    # 3.5

    .line 535
    .line 536
    mul-double v10, v10, v12

    .line 537
    .line 538
    cmpl-double v1, v8, v10

    .line 539
    .line 540
    if-lez v1, :cond_18

    .line 541
    .line 542
    new-instance v13, Landroidx/media3/exoplayer/offline/e;

    .line 543
    .line 544
    invoke-direct {v13}, Ljava/io/IOException;-><init>()V

    .line 545
    .line 546
    .line 547
    :goto_e
    const/4 v8, 0x0

    .line 548
    goto :goto_f

    .line 549
    :cond_18
    move-object v13, v6

    .line 550
    goto :goto_e

    .line 551
    :goto_f
    if-eqz v13, :cond_19

    .line 552
    .line 553
    iput-object v13, v0, Le5/b;->j:Ljava/io/IOException;

    .line 554
    .line 555
    new-instance v1, Lb7/m;

    .line 556
    .line 557
    const/4 v6, 0x6

    .line 558
    const/4 v9, 0x1

    .line 559
    invoke-direct {v1, v9, v6, v13}, Lb7/m;-><init>(IILjava/lang/Object;)V

    .line 560
    .line 561
    .line 562
    invoke-virtual/range {v67 .. v67}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 563
    .line 564
    .line 565
    move-result-object v6

    .line 566
    :goto_10
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 567
    .line 568
    .line 569
    move-result v9

    .line 570
    if-eqz v9, :cond_19

    .line 571
    .line 572
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v9

    .line 576
    check-cast v9, Le5/s;

    .line 577
    .line 578
    invoke-interface {v9, v7, v1, v8}, Le5/s;->b(Landroid/net/Uri;Lb7/m;Z)Z

    .line 579
    .line 580
    .line 581
    goto :goto_10

    .line 582
    :cond_19
    iget-object v1, v0, Le5/b;->d:Le5/k;

    .line 583
    .line 584
    iget-object v6, v1, Le5/k;->v:Le5/j;

    .line 585
    .line 586
    iget-wide v8, v1, Le5/k;->m:J

    .line 587
    .line 588
    iget-boolean v6, v6, Le5/j;->e:Z

    .line 589
    .line 590
    if-nez v6, :cond_1b

    .line 591
    .line 592
    if-eq v1, v2, :cond_1a

    .line 593
    .line 594
    :goto_11
    move-wide/from16 v37, v8

    .line 595
    .line 596
    goto :goto_12

    .line 597
    :cond_1a
    const-wide/16 v1, 0x2

    .line 598
    .line 599
    div-long/2addr v8, v1

    .line 600
    goto :goto_11

    .line 601
    :cond_1b
    :goto_12
    invoke-static/range {v37 .. v38}, Lp4/c0;->c0(J)J

    .line 602
    .line 603
    .line 604
    move-result-wide v1

    .line 605
    add-long/2addr v1, v3

    .line 606
    move-object/from16 v3, p2

    .line 607
    .line 608
    iget-wide v3, v3, Lj5/u;->a:J

    .line 609
    .line 610
    sub-long/2addr v1, v3

    .line 611
    iput-wide v1, v0, Le5/b;->g:J

    .line 612
    .line 613
    iget-object v1, v0, Le5/b;->d:Le5/k;

    .line 614
    .line 615
    iget-boolean v1, v1, Le5/k;->o:Z

    .line 616
    .line 617
    if-nez v1, :cond_1d

    .line 618
    .line 619
    iget-object v1, v5, Le5/c;->k:Landroid/net/Uri;

    .line 620
    .line 621
    invoke-virtual {v7, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 622
    .line 623
    .line 624
    move-result v1

    .line 625
    if-nez v1, :cond_1c

    .line 626
    .line 627
    iget-boolean v1, v0, Le5/b;->k:Z

    .line 628
    .line 629
    if-eqz v1, :cond_1d

    .line 630
    .line 631
    :cond_1c
    invoke-virtual {v0}, Le5/b;->b()Landroid/net/Uri;

    .line 632
    .line 633
    .line 634
    move-result-object v1

    .line 635
    invoke-virtual {v0, v1}, Le5/b;->e(Landroid/net/Uri;)V

    .line 636
    .line 637
    .line 638
    :cond_1d
    return-void
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
.end method

.method public final k(Ln5/l;JJ)V
    .locals 12

    .line 1
    check-cast p1, Ln5/r;

    .line 2
    .line 3
    iget-object v0, p1, Ln5/r;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Le5/o;

    .line 6
    .line 7
    new-instance v2, Lj5/u;

    .line 8
    .line 9
    iget-object p1, p1, Ln5/r;->d:Ls4/d0;

    .line 10
    .line 11
    iget-object p1, p1, Ls4/d0;->c:Landroid/net/Uri;

    .line 12
    .line 13
    move-wide/from16 v3, p4

    .line 14
    .line 15
    invoke-direct {v2, v3, v4}, Lj5/u;-><init>(J)V

    .line 16
    .line 17
    .line 18
    instance-of p1, v0, Le5/k;

    .line 19
    .line 20
    const/4 v3, 0x4

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    check-cast v0, Le5/k;

    .line 24
    .line 25
    invoke-virtual {p0, v0, v2}, Le5/b;->f(Le5/k;Lj5/u;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Le5/b;->l:Le5/c;

    .line 29
    .line 30
    iget-object v1, p1, Le5/c;->f:Lah/j;

    .line 31
    .line 32
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const/4 v4, -0x1

    .line 43
    const/4 v5, 0x0

    .line 44
    const/4 v6, 0x0

    .line 45
    const/4 v7, 0x0

    .line 46
    invoke-virtual/range {v1 .. v11}, Lah/j;->B(Lj5/u;IILm4/q;ILjava/lang/Object;JJ)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const-string p1, "Loaded playlist has unexpected type."

    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-static {p1, v0}, Lm4/p0;->b(Ljava/lang/String;Ljava/lang/Exception;)Lm4/p0;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput-object p1, p0, Le5/b;->j:Ljava/io/IOException;

    .line 58
    .line 59
    iget-object v0, p0, Le5/b;->l:Le5/c;

    .line 60
    .line 61
    iget-object v0, v0, Le5/c;->f:Lah/j;

    .line 62
    .line 63
    const/4 v1, 0x1

    .line 64
    invoke-virtual {v0, v2, v3, p1, v1}, Lah/j;->D(Lj5/u;ILjava/io/IOException;Z)V

    .line 65
    .line 66
    .line 67
    :goto_0
    iget-object p1, p0, Le5/b;->l:Le5/c;

    .line 68
    .line 69
    iget-object p1, p1, Le5/c;->c:Lm3/l;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
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

.method public final r(Ln5/l;JJI)V
    .locals 13

    .line 1
    check-cast p1, Ln5/r;

    .line 2
    .line 3
    if-nez p6, :cond_0

    .line 4
    .line 5
    new-instance v0, Lj5/u;

    .line 6
    .line 7
    iget-wide v1, p1, Ln5/r;->a:J

    .line 8
    .line 9
    iget-object v1, p1, Ln5/r;->b:Ls4/m;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lj5/u;-><init>(Ls4/m;)V

    .line 12
    .line 13
    .line 14
    :goto_0
    move-object v2, v0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    new-instance v0, Lj5/u;

    .line 17
    .line 18
    iget-wide v1, p1, Ln5/r;->a:J

    .line 19
    .line 20
    iget-object v1, p1, Ln5/r;->d:Ls4/d0;

    .line 21
    .line 22
    iget-object v1, v1, Ls4/d0;->c:Landroid/net/Uri;

    .line 23
    .line 24
    move-wide/from16 v1, p4

    .line 25
    .line 26
    invoke-direct {v0, v1, v2}, Lj5/u;-><init>(J)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :goto_1
    iget-object v0, p0, Le5/b;->l:Le5/c;

    .line 31
    .line 32
    iget-object v1, v0, Le5/c;->f:Lah/j;

    .line 33
    .line 34
    iget v3, p1, Ln5/r;->c:I

    .line 35
    .line 36
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    const/4 v4, -0x1

    .line 47
    const/4 v5, 0x0

    .line 48
    const/4 v6, 0x0

    .line 49
    const/4 v7, 0x0

    .line 50
    move/from16 v12, p6

    .line 51
    .line 52
    invoke-virtual/range {v1 .. v12}, Lah/j;->E(Lj5/u;IILm4/q;ILjava/lang/Object;JJI)V

    .line 53
    .line 54
    .line 55
    return-void
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

.method public final s(Ln5/l;JJZ)V
    .locals 11

    .line 1
    check-cast p1, Ln5/r;

    .line 2
    .line 3
    new-instance v1, Lj5/u;

    .line 4
    .line 5
    iget-wide p2, p1, Ln5/r;->a:J

    .line 6
    .line 7
    iget-object p1, p1, Ln5/r;->d:Ls4/d0;

    .line 8
    .line 9
    iget-object p1, p1, Ls4/d0;->c:Landroid/net/Uri;

    .line 10
    .line 11
    move-wide p1, p4

    .line 12
    invoke-direct {v1, p1, p2}, Lj5/u;-><init>(J)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Le5/b;->l:Le5/c;

    .line 16
    .line 17
    iget-object p2, p1, Le5/c;->c:Lm3/l;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v0, p1, Le5/c;->f:Lah/j;

    .line 23
    .line 24
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    const/4 v2, 0x4

    .line 35
    const/4 v3, -0x1

    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v6, 0x0

    .line 39
    invoke-virtual/range {v0 .. v10}, Lah/j;->A(Lj5/u;IILm4/q;ILjava/lang/Object;JJ)V

    .line 40
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

.method public final v(Ln5/l;JJLjava/io/IOException;I)Lb7/q0;
    .locals 5

    .line 1
    check-cast p1, Ln5/r;

    .line 2
    .line 3
    new-instance p2, Lj5/u;

    .line 4
    .line 5
    iget-wide v0, p1, Ln5/r;->a:J

    .line 6
    .line 7
    iget p3, p1, Ln5/r;->c:I

    .line 8
    .line 9
    iget-object p1, p1, Ln5/r;->d:Ls4/d0;

    .line 10
    .line 11
    iget-object p1, p1, Ls4/d0;->c:Landroid/net/Uri;

    .line 12
    .line 13
    invoke-direct {p2, p4, p5}, Lj5/u;-><init>(J)V

    .line 14
    .line 15
    .line 16
    const-string p4, "_HLS_msn"

    .line 17
    .line 18
    invoke-virtual {p1, p4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const/4 p4, 0x1

    .line 23
    const/4 p5, 0x0

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    instance-of v0, p6, Le5/p;

    .line 30
    .line 31
    sget-object v1, Ln5/o;->e:Lb7/q0;

    .line 32
    .line 33
    iget-object v2, p0, Le5/b;->l:Le5/c;

    .line 34
    .line 35
    if-nez p1, :cond_1

    .line 36
    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    :cond_1
    instance-of p1, p6, Ls4/y;

    .line 40
    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    move-object p1, p6

    .line 44
    check-cast p1, Ls4/y;

    .line 45
    .line 46
    iget p1, p1, Ls4/y;->d:I

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    const p1, 0x7fffffff

    .line 50
    .line 51
    .line 52
    :goto_1
    if-nez v0, :cond_8

    .line 53
    .line 54
    const/16 v0, 0x190

    .line 55
    .line 56
    if-eq p1, v0, :cond_8

    .line 57
    .line 58
    const/16 v0, 0x1f7

    .line 59
    .line 60
    if-ne p1, v0, :cond_3

    .line 61
    .line 62
    goto :goto_5

    .line 63
    :cond_3
    new-instance p1, Lb7/m;

    .line 64
    .line 65
    const/4 v0, 0x6

    .line 66
    invoke-direct {p1, p7, v0, p6}, Lb7/m;-><init>(IILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p7, v2, Le5/c;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 70
    .line 71
    invoke-virtual {p7}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object p7

    .line 75
    const/4 v0, 0x0

    .line 76
    :goto_2
    invoke-interface {p7}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_4

    .line 81
    .line 82
    invoke-interface {p7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    check-cast v3, Le5/s;

    .line 87
    .line 88
    iget-object v4, p0, Le5/b;->a:Landroid/net/Uri;

    .line 89
    .line 90
    invoke-interface {v3, v4, p1, p5}, Le5/s;->b(Landroid/net/Uri;Lb7/m;Z)Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    xor-int/2addr v3, p4

    .line 95
    or-int/2addr v0, v3

    .line 96
    goto :goto_2

    .line 97
    :cond_4
    iget-object p4, v2, Le5/c;->c:Lm3/l;

    .line 98
    .line 99
    if-eqz v0, :cond_6

    .line 100
    .line 101
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-static {p1}, Lm3/l;->v(Lb7/m;)J

    .line 105
    .line 106
    .line 107
    move-result-wide v0

    .line 108
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    cmp-long p1, v0, v3

    .line 114
    .line 115
    if-eqz p1, :cond_5

    .line 116
    .line 117
    new-instance p1, Lb7/q0;

    .line 118
    .line 119
    invoke-direct {p1, p5, p5, v0, v1}, Lb7/q0;-><init>(IZJ)V

    .line 120
    .line 121
    .line 122
    :goto_3
    move-object v1, p1

    .line 123
    goto :goto_4

    .line 124
    :cond_5
    sget-object p1, Ln5/o;->f:Lb7/q0;

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_6
    :goto_4
    invoke-virtual {v1}, Lb7/q0;->a()Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    xor-int/lit8 p5, p1, 0x1

    .line 132
    .line 133
    iget-object p7, v2, Le5/c;->f:Lah/j;

    .line 134
    .line 135
    invoke-virtual {p7, p2, p3, p6, p5}, Lah/j;->D(Lj5/u;ILjava/io/IOException;Z)V

    .line 136
    .line 137
    .line 138
    if-nez p1, :cond_7

    .line 139
    .line 140
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    :cond_7
    return-object v1

    .line 144
    :cond_8
    :goto_5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 145
    .line 146
    .line 147
    move-result-wide v3

    .line 148
    iput-wide v3, p0, Le5/b;->g:J

    .line 149
    .line 150
    invoke-virtual {p0, p5}, Le5/b;->c(Z)V

    .line 151
    .line 152
    .line 153
    iget-object p1, v2, Le5/c;->f:Lah/j;

    .line 154
    .line 155
    sget p5, Lp4/c0;->a:I

    .line 156
    .line 157
    invoke-virtual {p1, p2, p3, p6, p4}, Lah/j;->D(Lj5/u;ILjava/io/IOException;Z)V

    .line 158
    .line 159
    .line 160
    return-object v1
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
.end method

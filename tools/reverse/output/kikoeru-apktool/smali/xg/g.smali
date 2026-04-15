.class public final Lxg/g;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# static fields
.field public static final t:Lef/l;

.field public static final u:Ljava/lang/String;

.field public static final v:Ljava/lang/String;

.field public static final w:Ljava/lang/String;

.field public static final x:Ljava/lang/String;


# instance fields
.field public final a:Llh/y;

.field public final b:Lxg/f;

.field public final c:J

.field public final d:Llh/y;

.field public final e:Llh/y;

.field public final f:Llh/y;

.field public g:J

.field public h:Llh/a0;

.field public final i:Ljava/util/LinkedHashMap;

.field public j:I

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:J

.field public final r:Lyg/b;

.field public final s:Lxg/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lef/l;

    .line 2
    .line 3
    const-string v1, "[a-z0-9_-]{1,120}"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lef/l;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lxg/g;->t:Lef/l;

    .line 9
    .line 10
    const-string v0, "CLEAN"

    .line 11
    .line 12
    sput-object v0, Lxg/g;->u:Ljava/lang/String;

    .line 13
    .line 14
    const-string v0, "DIRTY"

    .line 15
    .line 16
    sput-object v0, Lxg/g;->v:Ljava/lang/String;

    .line 17
    .line 18
    const-string v0, "REMOVE"

    .line 19
    .line 20
    sput-object v0, Lxg/g;->w:Ljava/lang/String;

    .line 21
    .line 22
    const-string v0, "READ"

    .line 23
    .line 24
    sput-object v0, Lxg/g;->x:Ljava/lang/String;

    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
.end method

.method public constructor <init>(Llh/l;Llh/y;Lyg/c;)V
    .locals 3

    .line 1
    const-string v0, "fileSystem"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "taskRunner"

    .line 7
    .line 8
    invoke-static {p3, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Lxg/g;->a:Llh/y;

    .line 15
    .line 16
    new-instance v0, Lxg/f;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Llh/m;-><init>(Llh/l;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lxg/g;->b:Lxg/f;

    .line 22
    .line 23
    const-wide/32 v0, 0x40000000

    .line 24
    .line 25
    .line 26
    iput-wide v0, p0, Lxg/g;->c:J

    .line 27
    .line 28
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 29
    .line 30
    const/high16 v0, 0x3f400000    # 0.75f

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-direct {p1, v2, v0, v1}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lxg/g;->i:Ljava/util/LinkedHashMap;

    .line 38
    .line 39
    invoke-virtual {p3}, Lyg/c;->d()Lyg/b;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, Lxg/g;->r:Lyg/b;

    .line 44
    .line 45
    new-instance p1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    sget-object p3, Lwg/g;->b:Ljava/lang/String;

    .line 51
    .line 52
    const-string v0, " Cache"

    .line 53
    .line 54
    invoke-static {p1, p3, v0}, Lj2/h0;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    new-instance p3, Lxg/e;

    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    invoke-direct {p3, v0, p0, p1}, Lxg/e;-><init>(ILjava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iput-object p3, p0, Lxg/g;->s:Lxg/e;

    .line 65
    .line 66
    const-string p1, "journal"

    .line 67
    .line 68
    invoke-virtual {p2, p1}, Llh/y;->d(Ljava/lang/String;)Llh/y;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iput-object p1, p0, Lxg/g;->d:Llh/y;

    .line 73
    .line 74
    const-string p1, "journal.tmp"

    .line 75
    .line 76
    invoke-virtual {p2, p1}, Llh/y;->d(Ljava/lang/String;)Llh/y;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iput-object p1, p0, Lxg/g;->e:Llh/y;

    .line 81
    .line 82
    const-string p1, "journal.bkp"

    .line 83
    .line 84
    invoke-virtual {p2, p1}, Llh/y;->d(Ljava/lang/String;)Llh/y;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iput-object p1, p0, Lxg/g;->f:Llh/y;

    .line 89
    .line 90
    return-void
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

.method public static L(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Lxg/g;->t:Lef/l;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lef/l;->d(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string v0, "keys must match regex [a-z0-9_-]{1,120}: \""

    .line 11
    .line 12
    const/16 v1, 0x22

    .line 13
    .line 14
    invoke-static {v1, v0, p0}, La0/c;->G(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0
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


# virtual methods
.method public final declared-synchronized B()V
    .locals 10

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lxg/g;->h:Llh/a0;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Llh/a0;->close()V

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    goto/16 :goto_7

    .line 12
    .line 13
    :cond_0
    :goto_0
    iget-object v0, p0, Lxg/g;->b:Lxg/f;

    .line 14
    .line 15
    iget-object v1, p0, Lxg/g;->e:Llh/y;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lxg/f;->G(Llh/y;)Llh/f0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lg8/a;->k(Llh/f0;)Llh/a0;

    .line 22
    .line 23
    .line 24
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    const/4 v1, 0x0

    .line 26
    :try_start_1
    const-string v2, "libcore.io.DiskLruCache"

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 29
    .line 30
    .line 31
    const/16 v2, 0xa

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Llh/a0;->writeByte(I)Llh/g;

    .line 34
    .line 35
    .line 36
    const-string v3, "1"

    .line 37
    .line 38
    invoke-virtual {v0, v3}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, Llh/a0;->writeByte(I)Llh/g;

    .line 42
    .line 43
    .line 44
    const v3, 0x31191

    .line 45
    .line 46
    .line 47
    int-to-long v3, v3

    .line 48
    invoke-virtual {v0, v3, v4}, Llh/a0;->b0(J)Llh/g;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v2}, Llh/a0;->writeByte(I)Llh/g;

    .line 52
    .line 53
    .line 54
    const/4 v3, 0x2

    .line 55
    int-to-long v3, v3

    .line 56
    invoke-virtual {v0, v3, v4}, Llh/a0;->b0(J)Llh/g;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v2}, Llh/a0;->writeByte(I)Llh/g;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v2}, Llh/a0;->writeByte(I)Llh/g;

    .line 63
    .line 64
    .line 65
    iget-object v3, p0, Lxg/g;->i:Ljava/util/LinkedHashMap;

    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eqz v4, :cond_3

    .line 80
    .line 81
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    const-string v5, "next(...)"

    .line 86
    .line 87
    invoke-static {v4, v5}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    check-cast v4, Lxg/c;

    .line 91
    .line 92
    iget-object v5, v4, Lxg/c;->g:Lb5/d0;

    .line 93
    .line 94
    const/16 v6, 0x20

    .line 95
    .line 96
    if-eqz v5, :cond_1

    .line 97
    .line 98
    sget-object v5, Lxg/g;->v:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v0, v5}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v6}, Llh/a0;->writeByte(I)Llh/g;

    .line 104
    .line 105
    .line 106
    iget-object v4, v4, Lxg/c;->a:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v0, v4}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v2}, Llh/a0;->writeByte(I)Llh/g;

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :catchall_1
    move-exception v2

    .line 116
    goto :goto_3

    .line 117
    :cond_1
    sget-object v5, Lxg/g;->u:Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {v0, v5}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v6}, Llh/a0;->writeByte(I)Llh/g;

    .line 123
    .line 124
    .line 125
    iget-object v5, v4, Lxg/c;->a:Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {v0, v5}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 128
    .line 129
    .line 130
    iget-object v4, v4, Lxg/c;->b:[J

    .line 131
    .line 132
    array-length v5, v4

    .line 133
    const/4 v7, 0x0

    .line 134
    :goto_2
    if-ge v7, v5, :cond_2

    .line 135
    .line 136
    aget-wide v8, v4, v7

    .line 137
    .line 138
    invoke-virtual {v0, v6}, Llh/a0;->writeByte(I)Llh/g;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v8, v9}, Llh/a0;->b0(J)Llh/g;

    .line 142
    .line 143
    .line 144
    add-int/lit8 v7, v7, 0x1

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_2
    invoke-virtual {v0, v2}, Llh/a0;->writeByte(I)Llh/g;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_3
    :try_start_2
    invoke-virtual {v0}, Llh/a0;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 152
    .line 153
    .line 154
    const/4 v0, 0x0

    .line 155
    goto :goto_5

    .line 156
    :catchall_2
    move-exception v0

    .line 157
    goto :goto_5

    .line 158
    :goto_3
    :try_start_3
    invoke-virtual {v0}, Llh/a0;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 159
    .line 160
    .line 161
    goto :goto_4

    .line 162
    :catchall_3
    move-exception v0

    .line 163
    :try_start_4
    invoke-static {v2, v0}, Lub/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    :goto_4
    move-object v0, v2

    .line 167
    :goto_5
    if-nez v0, :cond_6

    .line 168
    .line 169
    iget-object v0, p0, Lxg/g;->b:Lxg/f;

    .line 170
    .line 171
    iget-object v2, p0, Lxg/g;->d:Llh/y;

    .line 172
    .line 173
    invoke-virtual {v0, v2}, Llh/l;->q(Llh/y;)Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-eqz v0, :cond_4

    .line 178
    .line 179
    iget-object v0, p0, Lxg/g;->b:Lxg/f;

    .line 180
    .line 181
    iget-object v2, p0, Lxg/g;->d:Llh/y;

    .line 182
    .line 183
    iget-object v3, p0, Lxg/g;->f:Llh/y;

    .line 184
    .line 185
    invoke-virtual {v0, v2, v3}, Llh/m;->g(Llh/y;Llh/y;)V

    .line 186
    .line 187
    .line 188
    iget-object v0, p0, Lxg/g;->b:Lxg/f;

    .line 189
    .line 190
    iget-object v2, p0, Lxg/g;->e:Llh/y;

    .line 191
    .line 192
    iget-object v3, p0, Lxg/g;->d:Llh/y;

    .line 193
    .line 194
    invoke-virtual {v0, v2, v3}, Llh/m;->g(Llh/y;Llh/y;)V

    .line 195
    .line 196
    .line 197
    iget-object v0, p0, Lxg/g;->b:Lxg/f;

    .line 198
    .line 199
    iget-object v2, p0, Lxg/g;->f:Llh/y;

    .line 200
    .line 201
    invoke-static {v0, v2}, Lwg/e;->d(Lxg/f;Llh/y;)V

    .line 202
    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_4
    iget-object v0, p0, Lxg/g;->b:Lxg/f;

    .line 206
    .line 207
    iget-object v2, p0, Lxg/g;->e:Llh/y;

    .line 208
    .line 209
    iget-object v3, p0, Lxg/g;->d:Llh/y;

    .line 210
    .line 211
    invoke-virtual {v0, v2, v3}, Llh/m;->g(Llh/y;Llh/y;)V

    .line 212
    .line 213
    .line 214
    :goto_6
    iget-object v0, p0, Lxg/g;->h:Llh/a0;

    .line 215
    .line 216
    if-eqz v0, :cond_5

    .line 217
    .line 218
    invoke-static {v0}, Lwg/e;->b(Ljava/io/Closeable;)V

    .line 219
    .line 220
    .line 221
    :cond_5
    iget-object v0, p0, Lxg/g;->b:Lxg/f;

    .line 222
    .line 223
    iget-object v2, p0, Lxg/g;->d:Llh/y;

    .line 224
    .line 225
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    const-string v3, "file"

    .line 229
    .line 230
    invoke-static {v2, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, v2}, Llh/m;->b(Llh/y;)Llh/f0;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    new-instance v2, Lk8/e;

    .line 238
    .line 239
    new-instance v3, Le7/y;

    .line 240
    .line 241
    const/16 v4, 0x1a

    .line 242
    .line 243
    invoke-direct {v3, v4, p0}, Le7/y;-><init>(ILjava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    invoke-direct {v2, v0, v3}, Lk8/e;-><init>(Llh/f0;Lic/k;)V

    .line 247
    .line 248
    .line 249
    invoke-static {v2}, Lg8/a;->k(Llh/f0;)Llh/a0;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    iput-object v0, p0, Lxg/g;->h:Llh/a0;

    .line 254
    .line 255
    iput-boolean v1, p0, Lxg/g;->k:Z

    .line 256
    .line 257
    iput-boolean v1, p0, Lxg/g;->p:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 258
    .line 259
    monitor-exit p0

    .line 260
    return-void

    .line 261
    :cond_6
    :try_start_5
    throw v0

    .line 262
    :goto_7
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 263
    throw v0
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

.method public final D(Lxg/c;)V
    .locals 10

    .line 1
    iget-object v0, p1, Lxg/c;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-boolean v1, p0, Lxg/g;->l:Z

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/16 v3, 0x20

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    iget v1, p1, Lxg/c;->h:I

    .line 13
    .line 14
    if-lez v1, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lxg/g;->h:Llh/a0;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    sget-object v5, Lxg/g;->v:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v1, v5}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v3}, Llh/a0;->writeByte(I)Llh/g;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, Llh/a0;->writeByte(I)Llh/g;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Llh/a0;->flush()V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget v1, p1, Lxg/c;->h:I

    .line 38
    .line 39
    if-gtz v1, :cond_1

    .line 40
    .line 41
    iget-object v1, p1, Lxg/c;->g:Lb5/d0;

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    :cond_1
    iput-boolean v4, p1, Lxg/c;->f:Z

    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    iget-object v1, p1, Lxg/c;->g:Lb5/d0;

    .line 49
    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    invoke-virtual {v1}, Lb5/d0;->h()V

    .line 53
    .line 54
    .line 55
    :cond_3
    const/4 v1, 0x0

    .line 56
    :goto_0
    const/4 v5, 0x2

    .line 57
    if-ge v1, v5, :cond_4

    .line 58
    .line 59
    iget-object v5, p1, Lxg/c;->c:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    check-cast v5, Llh/y;

    .line 66
    .line 67
    iget-object v6, p0, Lxg/g;->b:Lxg/f;

    .line 68
    .line 69
    invoke-static {v6, v5}, Lwg/e;->d(Lxg/f;Llh/y;)V

    .line 70
    .line 71
    .line 72
    iget-wide v5, p0, Lxg/g;->g:J

    .line 73
    .line 74
    iget-object v7, p1, Lxg/c;->b:[J

    .line 75
    .line 76
    aget-wide v8, v7, v1

    .line 77
    .line 78
    sub-long/2addr v5, v8

    .line 79
    iput-wide v5, p0, Lxg/g;->g:J

    .line 80
    .line 81
    const-wide/16 v5, 0x0

    .line 82
    .line 83
    aput-wide v5, v7, v1

    .line 84
    .line 85
    add-int/lit8 v1, v1, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    iget p1, p0, Lxg/g;->j:I

    .line 89
    .line 90
    add-int/2addr p1, v4

    .line 91
    iput p1, p0, Lxg/g;->j:I

    .line 92
    .line 93
    iget-object p1, p0, Lxg/g;->h:Llh/a0;

    .line 94
    .line 95
    if-eqz p1, :cond_5

    .line 96
    .line 97
    sget-object v1, Lxg/g;->w:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {p1, v1}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, v3}, Llh/a0;->writeByte(I)Llh/g;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v0}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v2}, Llh/a0;->writeByte(I)Llh/g;

    .line 109
    .line 110
    .line 111
    :cond_5
    iget-object p1, p0, Lxg/g;->i:Ljava/util/LinkedHashMap;

    .line 112
    .line 113
    invoke-virtual {p1, v0}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Lxg/g;->o()Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-eqz p1, :cond_6

    .line 121
    .line 122
    iget-object p1, p0, Lxg/g;->r:Lyg/b;

    .line 123
    .line 124
    iget-object v0, p0, Lxg/g;->s:Lxg/e;

    .line 125
    .line 126
    invoke-static {p1, v0}, Lyg/b;->e(Lyg/b;Lyg/a;)V

    .line 127
    .line 128
    .line 129
    :cond_6
    return-void
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
.end method

.method public final G()V
    .locals 5

    .line 1
    :goto_0
    iget-wide v0, p0, Lxg/g;->g:J

    .line 2
    .line 3
    iget-wide v2, p0, Lxg/g;->c:J

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-lez v4, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lxg/g;->i:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v2, "next(...)"

    .line 30
    .line 31
    invoke-static {v1, v2}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    check-cast v1, Lxg/c;

    .line 35
    .line 36
    iget-boolean v2, v1, Lxg/c;->f:Z

    .line 37
    .line 38
    if-nez v2, :cond_0

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Lxg/g;->D(Lxg/c;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    return-void

    .line 45
    :cond_2
    const/4 v0, 0x0

    .line 46
    iput-boolean v0, p0, Lxg/g;->o:Z

    .line 47
    .line 48
    return-void
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

.method public final declared-synchronized b()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lxg/g;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    const-string v0, "cache is closed"

    .line 9
    .line 10
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw v1

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw v0
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

.method public final declared-synchronized close()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lxg/g;->m:Z

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    iget-boolean v0, p0, Lxg/g;->n:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    iget-object v0, p0, Lxg/g;->i:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v2, "<get-values>(...)"

    .line 19
    .line 20
    invoke-static {v0, v2}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    new-array v3, v2, [Lxg/c;

    .line 25
    .line 26
    invoke-interface {v0, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, [Lxg/c;

    .line 31
    .line 32
    array-length v3, v0

    .line 33
    :goto_0
    if-ge v2, v3, :cond_2

    .line 34
    .line 35
    aget-object v4, v0, v2

    .line 36
    .line 37
    invoke-static {v4}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object v4, v4, Lxg/c;->g:Lb5/d0;

    .line 41
    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    invoke-virtual {v4}, Lb5/d0;->h()V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    goto :goto_3

    .line 50
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-virtual {p0}, Lxg/g;->G()V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lxg/g;->h:Llh/a0;

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    invoke-static {v0}, Lwg/e;->b(Ljava/io/Closeable;)V

    .line 61
    .line 62
    .line 63
    :cond_3
    const/4 v0, 0x0

    .line 64
    iput-object v0, p0, Lxg/g;->h:Llh/a0;

    .line 65
    .line 66
    iput-boolean v1, p0, Lxg/g;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    monitor-exit p0

    .line 69
    return-void

    .line 70
    :cond_4
    :goto_2
    :try_start_1
    iput-boolean v1, p0, Lxg/g;->n:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    .line 72
    monitor-exit p0

    .line 73
    return-void

    .line 74
    :goto_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 75
    throw v0
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

.method public final declared-synchronized flush()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lxg/g;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lxg/g;->b()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lxg/g;->G()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lxg/g;->h:Llh/a0;

    .line 15
    .line 16
    invoke-static {v0}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Llh/a0;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 26
    throw v0
    .line 27
    .line 28
    .line 29
.end method

.method public final declared-synchronized g(Lb5/d0;Z)V
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p1, Lb5/d0;->b:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lxg/c;

    .line 5
    .line 6
    iget-object v1, v0, Lxg/c;->g:Lb5/d0;

    .line 7
    .line 8
    invoke-static {v1, p1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_e

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz p2, :cond_2

    .line 17
    .line 18
    iget-boolean v3, v0, Lxg/c;->e:Z

    .line 19
    .line 20
    if-nez v3, :cond_2

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    :goto_0
    if-ge v3, v1, :cond_2

    .line 24
    .line 25
    iget-object v4, p1, Lb5/d0;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, [Z

    .line 28
    .line 29
    invoke-static {v4}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    aget-boolean v4, v4, v3

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    iget-object v4, p0, Lxg/g;->b:Lxg/f;

    .line 37
    .line 38
    iget-object v5, v0, Lxg/c;->d:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    check-cast v5, Llh/y;

    .line 45
    .line 46
    invoke-virtual {v4, v5}, Llh/l;->q(Llh/y;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-nez v4, :cond_0

    .line 51
    .line 52
    invoke-virtual {p1}, Lb5/d0;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    monitor-exit p0

    .line 56
    return-void

    .line 57
    :catchall_0
    move-exception p1

    .line 58
    goto/16 :goto_7

    .line 59
    .line 60
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Lb5/d0;->b()V

    .line 64
    .line 65
    .line 66
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    new-instance p2, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v0, "Newly created entry didn\'t create value for index "

    .line 74
    .line 75
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p1

    .line 89
    :cond_2
    const/4 p1, 0x0

    .line 90
    :goto_1
    if-ge p1, v1, :cond_6

    .line 91
    .line 92
    iget-object v3, v0, Lxg/c;->d:Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    check-cast v3, Llh/y;

    .line 99
    .line 100
    if-eqz p2, :cond_4

    .line 101
    .line 102
    iget-boolean v4, v0, Lxg/c;->f:Z

    .line 103
    .line 104
    if-nez v4, :cond_4

    .line 105
    .line 106
    iget-object v4, p0, Lxg/g;->b:Lxg/f;

    .line 107
    .line 108
    invoke-virtual {v4, v3}, Llh/l;->q(Llh/y;)Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-eqz v4, :cond_5

    .line 113
    .line 114
    iget-object v4, v0, Lxg/c;->c:Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    check-cast v4, Llh/y;

    .line 121
    .line 122
    iget-object v5, p0, Lxg/g;->b:Lxg/f;

    .line 123
    .line 124
    invoke-virtual {v5, v3, v4}, Llh/m;->g(Llh/y;Llh/y;)V

    .line 125
    .line 126
    .line 127
    iget-object v3, v0, Lxg/c;->b:[J

    .line 128
    .line 129
    aget-wide v5, v3, p1

    .line 130
    .line 131
    iget-object v3, p0, Lxg/g;->b:Lxg/f;

    .line 132
    .line 133
    invoke-virtual {v3, v4}, Llh/l;->y(Llh/y;)Llh/k;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    iget-object v3, v3, Llh/k;->d:Ljava/lang/Long;

    .line 138
    .line 139
    if-eqz v3, :cond_3

    .line 140
    .line 141
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 142
    .line 143
    .line 144
    move-result-wide v3

    .line 145
    goto :goto_2

    .line 146
    :cond_3
    const-wide/16 v3, 0x0

    .line 147
    .line 148
    :goto_2
    iget-object v7, v0, Lxg/c;->b:[J

    .line 149
    .line 150
    aput-wide v3, v7, p1

    .line 151
    .line 152
    iget-wide v7, p0, Lxg/g;->g:J

    .line 153
    .line 154
    sub-long/2addr v7, v5

    .line 155
    add-long/2addr v7, v3

    .line 156
    iput-wide v7, p0, Lxg/g;->g:J

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_4
    iget-object v4, p0, Lxg/g;->b:Lxg/f;

    .line 160
    .line 161
    invoke-static {v4, v3}, Lwg/e;->d(Lxg/f;Llh/y;)V

    .line 162
    .line 163
    .line 164
    :cond_5
    :goto_3
    add-int/lit8 p1, p1, 0x1

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_6
    const/4 p1, 0x0

    .line 168
    iput-object p1, v0, Lxg/c;->g:Lb5/d0;

    .line 169
    .line 170
    iget-boolean p1, v0, Lxg/c;->f:Z

    .line 171
    .line 172
    if-eqz p1, :cond_7

    .line 173
    .line 174
    invoke-virtual {p0, v0}, Lxg/g;->D(Lxg/c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 175
    .line 176
    .line 177
    monitor-exit p0

    .line 178
    return-void

    .line 179
    :cond_7
    :try_start_2
    iget p1, p0, Lxg/g;->j:I

    .line 180
    .line 181
    const/4 v1, 0x1

    .line 182
    add-int/2addr p1, v1

    .line 183
    iput p1, p0, Lxg/g;->j:I

    .line 184
    .line 185
    iget-object p1, p0, Lxg/g;->h:Llh/a0;

    .line 186
    .line 187
    invoke-static {p1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    iget-boolean v3, v0, Lxg/c;->e:Z

    .line 191
    .line 192
    const/16 v4, 0xa

    .line 193
    .line 194
    const/16 v5, 0x20

    .line 195
    .line 196
    if-nez v3, :cond_9

    .line 197
    .line 198
    if-eqz p2, :cond_8

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_8
    iget-object p2, p0, Lxg/g;->i:Ljava/util/LinkedHashMap;

    .line 202
    .line 203
    iget-object v1, v0, Lxg/c;->a:Ljava/lang/String;

    .line 204
    .line 205
    invoke-virtual {p2, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    sget-object p2, Lxg/g;->w:Ljava/lang/String;

    .line 209
    .line 210
    invoke-virtual {p1, p2}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1, v5}, Llh/a0;->writeByte(I)Llh/g;

    .line 214
    .line 215
    .line 216
    iget-object p2, v0, Lxg/c;->a:Ljava/lang/String;

    .line 217
    .line 218
    invoke-virtual {p1, p2}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 219
    .line 220
    .line 221
    invoke-virtual {p1, v4}, Llh/a0;->writeByte(I)Llh/g;

    .line 222
    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_9
    :goto_4
    iput-boolean v1, v0, Lxg/c;->e:Z

    .line 226
    .line 227
    sget-object v1, Lxg/g;->u:Ljava/lang/String;

    .line 228
    .line 229
    invoke-virtual {p1, v1}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1, v5}, Llh/a0;->writeByte(I)Llh/g;

    .line 233
    .line 234
    .line 235
    iget-object v1, v0, Lxg/c;->a:Ljava/lang/String;

    .line 236
    .line 237
    invoke-virtual {p1, v1}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 238
    .line 239
    .line 240
    iget-object v1, v0, Lxg/c;->b:[J

    .line 241
    .line 242
    array-length v3, v1

    .line 243
    :goto_5
    if-ge v2, v3, :cond_a

    .line 244
    .line 245
    aget-wide v6, v1, v2

    .line 246
    .line 247
    invoke-virtual {p1, v5}, Llh/a0;->writeByte(I)Llh/g;

    .line 248
    .line 249
    .line 250
    invoke-virtual {p1, v6, v7}, Llh/a0;->b0(J)Llh/g;

    .line 251
    .line 252
    .line 253
    add-int/lit8 v2, v2, 0x1

    .line 254
    .line 255
    goto :goto_5

    .line 256
    :cond_a
    invoke-virtual {p1, v4}, Llh/a0;->writeByte(I)Llh/g;

    .line 257
    .line 258
    .line 259
    if-eqz p2, :cond_b

    .line 260
    .line 261
    iget-wide v1, p0, Lxg/g;->q:J

    .line 262
    .line 263
    const-wide/16 v3, 0x1

    .line 264
    .line 265
    add-long/2addr v3, v1

    .line 266
    iput-wide v3, p0, Lxg/g;->q:J

    .line 267
    .line 268
    iput-wide v1, v0, Lxg/c;->i:J

    .line 269
    .line 270
    :cond_b
    :goto_6
    invoke-virtual {p1}, Llh/a0;->flush()V

    .line 271
    .line 272
    .line 273
    iget-wide p1, p0, Lxg/g;->g:J

    .line 274
    .line 275
    iget-wide v0, p0, Lxg/g;->c:J

    .line 276
    .line 277
    cmp-long v2, p1, v0

    .line 278
    .line 279
    if-gtz v2, :cond_c

    .line 280
    .line 281
    invoke-virtual {p0}, Lxg/g;->o()Z

    .line 282
    .line 283
    .line 284
    move-result p1

    .line 285
    if-eqz p1, :cond_d

    .line 286
    .line 287
    :cond_c
    iget-object p1, p0, Lxg/g;->r:Lyg/b;

    .line 288
    .line 289
    iget-object p2, p0, Lxg/g;->s:Lxg/e;

    .line 290
    .line 291
    invoke-static {p1, p2}, Lyg/b;->e(Lyg/b;Lyg/a;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 292
    .line 293
    .line 294
    :cond_d
    monitor-exit p0

    .line 295
    return-void

    .line 296
    :cond_e
    :try_start_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 297
    .line 298
    const-string p2, "Check failed."

    .line 299
    .line 300
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    throw p1

    .line 304
    :goto_7
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 305
    throw p1
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
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
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

.method public final declared-synchronized i(JLjava/lang/String;)Lb5/d0;
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "key"

    .line 3
    .line 4
    invoke-static {p3, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lxg/g;->n()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lxg/g;->b()V

    .line 11
    .line 12
    .line 13
    invoke-static {p3}, Lxg/g;->L(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lxg/g;->i:Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-virtual {v0, p3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lxg/c;

    .line 23
    .line 24
    const-wide/16 v1, -0x1

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    cmp-long v4, p1, v1

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iget-wide v1, v0, Lxg/c;->i:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    cmp-long v4, v1, p1

    .line 36
    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_3

    .line 42
    :cond_0
    :goto_0
    monitor-exit p0

    .line 43
    return-object v3

    .line 44
    :cond_1
    if-eqz v0, :cond_2

    .line 45
    .line 46
    :try_start_1
    iget-object p1, v0, Lxg/c;->g:Lb5/d0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move-object p1, v3

    .line 50
    :goto_1
    if-eqz p1, :cond_3

    .line 51
    .line 52
    monitor-exit p0

    .line 53
    return-object v3

    .line 54
    :cond_3
    if-eqz v0, :cond_4

    .line 55
    .line 56
    :try_start_2
    iget p1, v0, Lxg/c;->h:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 57
    .line 58
    if-eqz p1, :cond_4

    .line 59
    .line 60
    monitor-exit p0

    .line 61
    return-object v3

    .line 62
    :cond_4
    :try_start_3
    iget-boolean p1, p0, Lxg/g;->o:Z

    .line 63
    .line 64
    if-nez p1, :cond_8

    .line 65
    .line 66
    iget-boolean p1, p0, Lxg/g;->p:Z

    .line 67
    .line 68
    if-eqz p1, :cond_5

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_5
    iget-object p1, p0, Lxg/g;->h:Llh/a0;

    .line 72
    .line 73
    invoke-static {p1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    sget-object p2, Lxg/g;->v:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {p1, p2}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 79
    .line 80
    .line 81
    const/16 p2, 0x20

    .line 82
    .line 83
    invoke-virtual {p1, p2}, Llh/a0;->writeByte(I)Llh/g;

    .line 84
    .line 85
    .line 86
    invoke-interface {p1, p3}, Llh/g;->E(Ljava/lang/String;)Llh/g;

    .line 87
    .line 88
    .line 89
    const/16 p2, 0xa

    .line 90
    .line 91
    invoke-interface {p1, p2}, Llh/g;->writeByte(I)Llh/g;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Llh/a0;->flush()V

    .line 95
    .line 96
    .line 97
    iget-boolean p1, p0, Lxg/g;->k:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 98
    .line 99
    if-eqz p1, :cond_6

    .line 100
    .line 101
    monitor-exit p0

    .line 102
    return-object v3

    .line 103
    :cond_6
    if-nez v0, :cond_7

    .line 104
    .line 105
    :try_start_4
    new-instance v0, Lxg/c;

    .line 106
    .line 107
    invoke-direct {v0, p0, p3}, Lxg/c;-><init>(Lxg/g;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iget-object p1, p0, Lxg/g;->i:Ljava/util/LinkedHashMap;

    .line 111
    .line 112
    invoke-interface {p1, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    :cond_7
    new-instance p1, Lb5/d0;

    .line 116
    .line 117
    invoke-direct {p1, p0, v0}, Lb5/d0;-><init>(Lxg/g;Lxg/c;)V

    .line 118
    .line 119
    .line 120
    iput-object p1, v0, Lxg/c;->g:Lb5/d0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 121
    .line 122
    monitor-exit p0

    .line 123
    return-object p1

    .line 124
    :cond_8
    :goto_2
    :try_start_5
    iget-object p1, p0, Lxg/g;->r:Lyg/b;

    .line 125
    .line 126
    iget-object p2, p0, Lxg/g;->s:Lxg/e;

    .line 127
    .line 128
    invoke-static {p1, p2}, Lyg/b;->e(Lyg/b;Lyg/a;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 129
    .line 130
    .line 131
    monitor-exit p0

    .line 132
    return-object v3

    .line 133
    :goto_3
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 134
    throw p1
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

.method public final declared-synchronized k(Ljava/lang/String;)Lxg/d;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "key"

    .line 3
    .line 4
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lxg/g;->n()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lxg/g;->b()V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lxg/g;->L(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lxg/g;->i:Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lxg/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    monitor-exit p0

    .line 28
    return-object v1

    .line 29
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Lxg/c;->a()Lxg/d;

    .line 30
    .line 31
    .line 32
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    monitor-exit p0

    .line 36
    return-object v1

    .line 37
    :cond_1
    :try_start_2
    iget v1, p0, Lxg/g;->j:I

    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    iput v1, p0, Lxg/g;->j:I

    .line 42
    .line 43
    iget-object v1, p0, Lxg/g;->h:Llh/a0;

    .line 44
    .line 45
    invoke-static {v1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object v2, Lxg/g;->x:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 51
    .line 52
    .line 53
    const/16 v2, 0x20

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Llh/a0;->writeByte(I)Llh/g;

    .line 56
    .line 57
    .line 58
    invoke-interface {v1, p1}, Llh/g;->E(Ljava/lang/String;)Llh/g;

    .line 59
    .line 60
    .line 61
    const/16 p1, 0xa

    .line 62
    .line 63
    invoke-interface {v1, p1}, Llh/g;->writeByte(I)Llh/g;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Lxg/g;->o()Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    iget-object p1, p0, Lxg/g;->r:Lyg/b;

    .line 73
    .line 74
    iget-object v1, p0, Lxg/g;->s:Lxg/e;

    .line 75
    .line 76
    invoke-static {p1, v1}, Lyg/b;->e(Lyg/b;Lyg/a;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    goto :goto_1

    .line 82
    :cond_2
    :goto_0
    monitor-exit p0

    .line 83
    return-object v0

    .line 84
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 85
    throw p1
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

.method public final declared-synchronized n()V
    .locals 7

    .line 1
    const-string v0, "DiskLruCache "

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    sget-object v1, Lwg/g;->a:Ljava/util/TimeZone;

    .line 5
    .line 6
    iget-boolean v1, p0, Lxg/g;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :cond_0
    :try_start_1
    iget-object v1, p0, Lxg/g;->b:Lxg/f;

    .line 13
    .line 14
    iget-object v2, p0, Lxg/g;->f:Llh/y;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Llh/l;->q(Llh/y;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    iget-object v1, p0, Lxg/g;->b:Lxg/f;

    .line 23
    .line 24
    iget-object v2, p0, Lxg/g;->d:Llh/y;

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Llh/l;->q(Llh/y;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    iget-object v1, p0, Lxg/g;->b:Lxg/f;

    .line 33
    .line 34
    iget-object v2, p0, Lxg/g;->f:Llh/y;

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Llh/l;->o(Llh/y;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    goto/16 :goto_6

    .line 42
    .line 43
    :cond_1
    iget-object v1, p0, Lxg/g;->b:Lxg/f;

    .line 44
    .line 45
    iget-object v2, p0, Lxg/g;->f:Llh/y;

    .line 46
    .line 47
    iget-object v3, p0, Lxg/g;->d:Llh/y;

    .line 48
    .line 49
    invoke-virtual {v1, v2, v3}, Llh/m;->g(Llh/y;Llh/y;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    :goto_0
    iget-object v1, p0, Lxg/g;->b:Lxg/f;

    .line 53
    .line 54
    iget-object v2, p0, Lxg/g;->f:Llh/y;

    .line 55
    .line 56
    sget-object v3, Lwg/e;->a:[B

    .line 57
    .line 58
    const-string v3, "<this>"

    .line 59
    .line 60
    invoke-static {v1, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string v3, "file"

    .line 64
    .line 65
    invoke-static {v2, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v2}, Lxg/f;->G(Llh/y;)Llh/f0;

    .line 69
    .line 70
    .line 71
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    const/4 v4, 0x1

    .line 73
    const/4 v5, 0x0

    .line 74
    :try_start_2
    invoke-virtual {v1, v2}, Llh/m;->n(Llh/y;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 75
    .line 76
    .line 77
    if-eqz v3, :cond_3

    .line 78
    .line 79
    :try_start_3
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 80
    .line 81
    .line 82
    :catchall_1
    :cond_3
    const/4 v1, 0x1

    .line 83
    goto :goto_4

    .line 84
    :catchall_2
    move-exception v6

    .line 85
    if-eqz v3, :cond_5

    .line 86
    .line 87
    :try_start_4
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 88
    .line 89
    .line 90
    goto :goto_3

    .line 91
    :catchall_3
    move-exception v3

    .line 92
    :try_start_5
    invoke-static {v6, v3}, Lub/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :catch_0
    if-eqz v3, :cond_4

    .line 97
    .line 98
    :try_start_6
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :catchall_4
    move-exception v3

    .line 103
    :goto_1
    move-object v6, v3

    .line 104
    goto :goto_3

    .line 105
    :cond_4
    :goto_2
    const/4 v3, 0x0

    .line 106
    goto :goto_1

    .line 107
    :cond_5
    :goto_3
    if-nez v6, :cond_7

    .line 108
    .line 109
    :try_start_7
    invoke-virtual {v1, v2}, Llh/m;->n(Llh/y;)V

    .line 110
    .line 111
    .line 112
    const/4 v1, 0x0

    .line 113
    :goto_4
    iput-boolean v1, p0, Lxg/g;->l:Z

    .line 114
    .line 115
    iget-object v1, p0, Lxg/g;->b:Lxg/f;

    .line 116
    .line 117
    iget-object v2, p0, Lxg/g;->d:Llh/y;

    .line 118
    .line 119
    invoke-virtual {v1, v2}, Llh/l;->q(Llh/y;)Z

    .line 120
    .line 121
    .line 122
    move-result v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 123
    if-eqz v1, :cond_6

    .line 124
    .line 125
    :try_start_8
    invoke-virtual {p0}, Lxg/g;->u()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Lxg/g;->q()V

    .line 129
    .line 130
    .line 131
    iput-boolean v4, p0, Lxg/g;->m:Z
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 132
    .line 133
    monitor-exit p0

    .line 134
    return-void

    .line 135
    :catch_1
    move-exception v1

    .line 136
    :try_start_9
    sget-object v2, Lfh/e;->a:Lfh/e;

    .line 137
    .line 138
    sget-object v2, Lfh/e;->a:Lfh/e;

    .line 139
    .line 140
    new-instance v3, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    iget-object v0, p0, Lxg/g;->a:Llh/y;

    .line 146
    .line 147
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string v0, " is corrupt: "

    .line 151
    .line 152
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string v0, ", removing"

    .line 163
    .line 164
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    const/4 v3, 0x5

    .line 172
    invoke-virtual {v2, v0, v3, v1}, Lfh/e;->j(Ljava/lang/String;ILjava/lang/Throwable;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 173
    .line 174
    .line 175
    :try_start_a
    invoke-virtual {p0}, Lxg/g;->close()V

    .line 176
    .line 177
    .line 178
    iget-object v0, p0, Lxg/g;->b:Lxg/f;

    .line 179
    .line 180
    iget-object v1, p0, Lxg/g;->a:Llh/y;

    .line 181
    .line 182
    invoke-static {v0, v1}, Lwg/e;->c(Llh/l;Llh/y;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 183
    .line 184
    .line 185
    :try_start_b
    iput-boolean v5, p0, Lxg/g;->n:Z

    .line 186
    .line 187
    goto :goto_5

    .line 188
    :catchall_5
    move-exception v0

    .line 189
    iput-boolean v5, p0, Lxg/g;->n:Z

    .line 190
    .line 191
    throw v0

    .line 192
    :cond_6
    :goto_5
    invoke-virtual {p0}, Lxg/g;->B()V

    .line 193
    .line 194
    .line 195
    iput-boolean v4, p0, Lxg/g;->m:Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 196
    .line 197
    monitor-exit p0

    .line 198
    return-void

    .line 199
    :cond_7
    :try_start_c
    throw v6

    .line 200
    :goto_6
    monitor-exit p0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 201
    throw v0
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

.method public final o()Z
    .locals 2

    .line 1
    iget v0, p0, Lxg/g;->j:I

    .line 2
    .line 3
    const/16 v1, 0x7d0

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lxg/g;->i:Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-lt v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
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

.method public final q()V
    .locals 10

    .line 1
    iget-object v0, p0, Lxg/g;->e:Llh/y;

    .line 2
    .line 3
    iget-object v1, p0, Lxg/g;->b:Lxg/f;

    .line 4
    .line 5
    invoke-static {v1, v0}, Lwg/e;->d(Lxg/f;Llh/y;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lxg/g;->i:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_3

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const-string v3, "next(...)"

    .line 29
    .line 30
    invoke-static {v2, v3}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    check-cast v2, Lxg/c;

    .line 34
    .line 35
    iget-object v3, v2, Lxg/c;->g:Lb5/d0;

    .line 36
    .line 37
    const/4 v4, 0x2

    .line 38
    const/4 v5, 0x0

    .line 39
    if-nez v3, :cond_1

    .line 40
    .line 41
    :goto_1
    if-ge v5, v4, :cond_0

    .line 42
    .line 43
    iget-wide v6, p0, Lxg/g;->g:J

    .line 44
    .line 45
    iget-object v3, v2, Lxg/c;->b:[J

    .line 46
    .line 47
    aget-wide v8, v3, v5

    .line 48
    .line 49
    add-long/2addr v6, v8

    .line 50
    iput-wide v6, p0, Lxg/g;->g:J

    .line 51
    .line 52
    add-int/lit8 v5, v5, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    const/4 v3, 0x0

    .line 56
    iput-object v3, v2, Lxg/c;->g:Lb5/d0;

    .line 57
    .line 58
    :goto_2
    if-ge v5, v4, :cond_2

    .line 59
    .line 60
    iget-object v3, v2, Lxg/c;->c:Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Llh/y;

    .line 67
    .line 68
    invoke-static {v1, v3}, Lwg/e;->d(Lxg/f;Llh/y;)V

    .line 69
    .line 70
    .line 71
    iget-object v3, v2, Lxg/c;->d:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    check-cast v3, Llh/y;

    .line 78
    .line 79
    invoke-static {v1, v3}, Lwg/e;->d(Lxg/f;Llh/y;)V

    .line 80
    .line 81
    .line 82
    add-int/lit8 v5, v5, 0x1

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    return-void
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

.method public final u()V
    .locals 13

    .line 1
    const-string v0, ", "

    .line 2
    .line 3
    const-string v1, "unexpected journal header: ["

    .line 4
    .line 5
    iget-object v2, p0, Lxg/g;->b:Lxg/f;

    .line 6
    .line 7
    iget-object v3, p0, Lxg/g;->d:Llh/y;

    .line 8
    .line 9
    invoke-virtual {v2, v3}, Llh/m;->L(Llh/y;)Llh/h0;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-static {v4}, Lg8/a;->l(Llh/h0;)Llh/b0;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    const-wide v5, 0x7fffffffffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    :try_start_0
    invoke-virtual {v4, v5, v6}, Llh/b0;->x(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    invoke-virtual {v4, v5, v6}, Llh/b0;->x(J)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v8

    .line 30
    invoke-virtual {v4, v5, v6}, Llh/b0;->x(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v9

    .line 34
    invoke-virtual {v4, v5, v6}, Llh/b0;->x(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v10

    .line 38
    invoke-virtual {v4, v5, v6}, Llh/b0;->x(J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v11

    .line 42
    const-string v12, "libcore.io.DiskLruCache"

    .line 43
    .line 44
    invoke-virtual {v12, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v12

    .line 48
    if-eqz v12, :cond_2

    .line 49
    .line 50
    const-string v12, "1"

    .line 51
    .line 52
    invoke-virtual {v12, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v12

    .line 56
    if-eqz v12, :cond_2

    .line 57
    .line 58
    const v12, 0x31191

    .line 59
    .line 60
    .line 61
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v12

    .line 65
    invoke-static {v12, v9}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v9

    .line 69
    if-eqz v9, :cond_2

    .line 70
    .line 71
    const/4 v9, 0x2

    .line 72
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    invoke-static {v9, v10}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    if-eqz v9, :cond_2

    .line 81
    .line 82
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 83
    .line 84
    .line 85
    move-result v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    if-gtz v9, :cond_2

    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    :goto_0
    :try_start_1
    invoke-virtual {v4, v5, v6}, Llh/b0;->x(J)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {p0, v1}, Lxg/g;->y(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    .line 95
    .line 96
    add-int/lit8 v0, v0, 0x1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :catchall_0
    move-exception v0

    .line 100
    goto :goto_2

    .line 101
    :catch_0
    :try_start_2
    iget-object v1, p0, Lxg/g;->i:Ljava/util/LinkedHashMap;

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    sub-int/2addr v0, v1

    .line 108
    iput v0, p0, Lxg/g;->j:I

    .line 109
    .line 110
    invoke-virtual {v4}, Llh/b0;->b()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-nez v0, :cond_0

    .line 115
    .line 116
    invoke-virtual {p0}, Lxg/g;->B()V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_0
    iget-object v0, p0, Lxg/g;->h:Llh/a0;

    .line 121
    .line 122
    if-eqz v0, :cond_1

    .line 123
    .line 124
    invoke-static {v0}, Lwg/e;->b(Ljava/io/Closeable;)V

    .line 125
    .line 126
    .line 127
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    const-string v0, "file"

    .line 131
    .line 132
    invoke-static {v3, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, v3}, Llh/m;->b(Llh/y;)Llh/f0;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    new-instance v1, Lk8/e;

    .line 140
    .line 141
    new-instance v2, Le7/y;

    .line 142
    .line 143
    const/16 v3, 0x1a

    .line 144
    .line 145
    invoke-direct {v2, v3, p0}, Le7/y;-><init>(ILjava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-direct {v1, v0, v2}, Lk8/e;-><init>(Llh/f0;Lic/k;)V

    .line 149
    .line 150
    .line 151
    invoke-static {v1}, Lg8/a;->k(Llh/f0;)Llh/a0;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iput-object v0, p0, Lxg/g;->h:Llh/a0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 156
    .line 157
    :goto_1
    :try_start_3
    invoke-virtual {v4}, Llh/b0;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 158
    .line 159
    .line 160
    const/4 v0, 0x0

    .line 161
    goto :goto_3

    .line 162
    :catchall_1
    move-exception v0

    .line 163
    goto :goto_3

    .line 164
    :cond_2
    :try_start_4
    new-instance v2, Ljava/io/IOException;

    .line 165
    .line 166
    new-instance v3, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    const/16 v0, 0x5d

    .line 193
    .line 194
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 205
    :goto_2
    :try_start_5
    invoke-virtual {v4}, Llh/b0;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 206
    .line 207
    .line 208
    goto :goto_3

    .line 209
    :catchall_2
    move-exception v1

    .line 210
    invoke-static {v0, v1}, Lub/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 211
    .line 212
    .line 213
    :goto_3
    if-nez v0, :cond_3

    .line 214
    .line 215
    return-void

    .line 216
    :cond_3
    throw v0
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

.method public final y(Ljava/lang/String;)V
    .locals 11

    .line 1
    const/4 v0, 0x6

    .line 2
    const/16 v1, 0x20

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {p1, v1, v2, v0}, Lef/n;->v0(Ljava/lang/CharSequence;CII)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-string v3, "unexpected journal line: "

    .line 10
    .line 11
    const/4 v4, -0x1

    .line 12
    if-eq v0, v4, :cond_8

    .line 13
    .line 14
    add-int/lit8 v5, v0, 0x1

    .line 15
    .line 16
    const/4 v6, 0x4

    .line 17
    invoke-static {p1, v1, v5, v6}, Lef/n;->v0(Ljava/lang/CharSequence;CII)I

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    iget-object v7, p0, Lxg/g;->i:Ljava/util/LinkedHashMap;

    .line 22
    .line 23
    const-string v8, "substring(...)"

    .line 24
    .line 25
    if-ne v6, v4, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-static {v5, v8}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sget-object v9, Lxg/g;->w:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v10

    .line 40
    if-ne v0, v10, :cond_1

    .line 41
    .line 42
    invoke-static {p1, v9, v2}, Lef/u;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    if-eqz v9, :cond_1

    .line 47
    .line 48
    invoke-virtual {v7, v5}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_0
    invoke-virtual {p1, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-static {v5, v8}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-virtual {v7, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    check-cast v9, Lxg/c;

    .line 64
    .line 65
    if-nez v9, :cond_2

    .line 66
    .line 67
    new-instance v9, Lxg/c;

    .line 68
    .line 69
    invoke-direct {v9, p0, v5}, Lxg/c;-><init>(Lxg/g;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {v7, v5, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    :cond_2
    if-eq v6, v4, :cond_4

    .line 76
    .line 77
    sget-object v5, Lxg/g;->u:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    if-ne v0, v7, :cond_4

    .line 84
    .line 85
    invoke-static {p1, v5, v2}, Lef/u;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_4

    .line 90
    .line 91
    const/4 v0, 0x1

    .line 92
    add-int/2addr v6, v0

    .line 93
    invoke-virtual {p1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-static {p1, v8}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    new-array v4, v0, [C

    .line 101
    .line 102
    aput-char v1, v4, v2

    .line 103
    .line 104
    invoke-static {p1, v4}, Lef/n;->L0(Ljava/lang/String;[C)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iput-boolean v0, v9, Lxg/c;->e:Z

    .line 109
    .line 110
    const/4 v0, 0x0

    .line 111
    iput-object v0, v9, Lxg/c;->g:Lb5/d0;

    .line 112
    .line 113
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    iget-object v1, v9, Lxg/c;->j:Lxg/g;

    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    const/4 v1, 0x2

    .line 123
    if-ne v0, v1, :cond_3

    .line 124
    .line 125
    :try_start_0
    move-object v0, p1

    .line 126
    check-cast v0, Ljava/util/Collection;

    .line 127
    .line 128
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    :goto_0
    if-ge v2, v0, :cond_6

    .line 133
    .line 134
    iget-object v1, v9, Lxg/c;->b:[J

    .line 135
    .line 136
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    check-cast v4, Ljava/lang/String;

    .line 141
    .line 142
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 143
    .line 144
    .line 145
    move-result-wide v4

    .line 146
    aput-wide v4, v1, v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 147
    .line 148
    add-int/lit8 v2, v2, 0x1

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :catch_0
    new-instance v0, Ljava/io/IOException;

    .line 152
    .line 153
    new-instance v1, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw v0

    .line 169
    :cond_3
    new-instance v0, Ljava/io/IOException;

    .line 170
    .line 171
    new-instance v1, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw v0

    .line 187
    :cond_4
    if-ne v6, v4, :cond_5

    .line 188
    .line 189
    sget-object v1, Lxg/g;->v:Ljava/lang/String;

    .line 190
    .line 191
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    if-ne v0, v5, :cond_5

    .line 196
    .line 197
    invoke-static {p1, v1, v2}, Lef/u;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-eqz v1, :cond_5

    .line 202
    .line 203
    new-instance p1, Lb5/d0;

    .line 204
    .line 205
    invoke-direct {p1, p0, v9}, Lb5/d0;-><init>(Lxg/g;Lxg/c;)V

    .line 206
    .line 207
    .line 208
    iput-object p1, v9, Lxg/c;->g:Lb5/d0;

    .line 209
    .line 210
    return-void

    .line 211
    :cond_5
    if-ne v6, v4, :cond_7

    .line 212
    .line 213
    sget-object v1, Lxg/g;->x:Ljava/lang/String;

    .line 214
    .line 215
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    if-ne v0, v4, :cond_7

    .line 220
    .line 221
    invoke-static {p1, v1, v2}, Lef/u;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-eqz v0, :cond_7

    .line 226
    .line 227
    :cond_6
    return-void

    .line 228
    :cond_7
    new-instance v0, Ljava/io/IOException;

    .line 229
    .line 230
    invoke-virtual {v3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    throw v0

    .line 238
    :cond_8
    new-instance v0, Ljava/io/IOException;

    .line 239
    .line 240
    invoke-virtual {v3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    throw v0
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

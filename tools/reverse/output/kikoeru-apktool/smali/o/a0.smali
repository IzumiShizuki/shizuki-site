.class public final Lo/a0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public a:[J

.field public b:[J

.field public c:[I

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lo/s0;->a:[J

    .line 5
    .line 6
    iput-object v0, p0, Lo/a0;->a:[J

    .line 7
    .line 8
    sget-object v0, Lo/r;->a:[J

    .line 9
    .line 10
    iput-object v0, p0, Lo/a0;->b:[J

    .line 11
    .line 12
    sget-object v0, Lo/o;->a:[I

    .line 13
    .line 14
    iput-object v0, p0, Lo/a0;->c:[I

    .line 15
    .line 16
    if-ltz p1, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, Lo/s0;->d(I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-virtual {p0, p1}, Lo/a0;->d(I)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const-string p1, "Capacity must be a positive value."

    .line 27
    .line 28
    invoke-static {p1}, Lp/a;->c(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    throw p1
    .line 33
    .line 34
    .line 35
    .line 36
.end method


# virtual methods
.method public final a(I)I
    .locals 9

    .line 1
    iget v0, p0, Lo/a0;->d:I

    .line 2
    .line 3
    and-int/2addr p1, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    iget-object v2, p0, Lo/a0;->a:[J

    .line 6
    .line 7
    shr-int/lit8 v3, p1, 0x3

    .line 8
    .line 9
    and-int/lit8 v4, p1, 0x7

    .line 10
    .line 11
    shl-int/lit8 v4, v4, 0x3

    .line 12
    .line 13
    aget-wide v5, v2, v3

    .line 14
    .line 15
    ushr-long/2addr v5, v4

    .line 16
    add-int/lit8 v3, v3, 0x1

    .line 17
    .line 18
    aget-wide v7, v2, v3

    .line 19
    .line 20
    rsub-int/lit8 v2, v4, 0x40

    .line 21
    .line 22
    shl-long v2, v7, v2

    .line 23
    .line 24
    int-to-long v7, v4

    .line 25
    neg-long v7, v7

    .line 26
    const/16 v4, 0x3f

    .line 27
    .line 28
    shr-long/2addr v7, v4

    .line 29
    and-long/2addr v2, v7

    .line 30
    or-long/2addr v2, v5

    .line 31
    not-long v4, v2

    .line 32
    const/4 v6, 0x7

    .line 33
    shl-long/2addr v4, v6

    .line 34
    and-long/2addr v2, v4

    .line 35
    const-wide v4, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long/2addr v2, v4

    .line 41
    const-wide/16 v4, 0x0

    .line 42
    .line 43
    cmp-long v6, v2, v4

    .line 44
    .line 45
    if-eqz v6, :cond_0

    .line 46
    .line 47
    invoke-static {v2, v3}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    shr-int/lit8 v1, v1, 0x3

    .line 52
    .line 53
    add-int/2addr p1, v1

    .line 54
    and-int/2addr p1, v0

    .line 55
    return p1

    .line 56
    :cond_0
    add-int/lit8 v1, v1, 0x8

    .line 57
    .line 58
    add-int/2addr p1, v1

    .line 59
    and-int/2addr p1, v0

    .line 60
    goto :goto_0
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

.method public final b(J)I
    .locals 14

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    ushr-long v0, p1, v0

    .line 4
    .line 5
    xor-long/2addr v0, p1

    .line 6
    long-to-int v1, v0

    .line 7
    const v0, -0x3361d2af    # -8.293031E7f

    .line 8
    .line 9
    .line 10
    mul-int v1, v1, v0

    .line 11
    .line 12
    shl-int/lit8 v0, v1, 0x10

    .line 13
    .line 14
    xor-int/2addr v0, v1

    .line 15
    and-int/lit8 v1, v0, 0x7f

    .line 16
    .line 17
    iget v2, p0, Lo/a0;->d:I

    .line 18
    .line 19
    ushr-int/lit8 v0, v0, 0x7

    .line 20
    .line 21
    and-int/2addr v0, v2

    .line 22
    const/4 v3, 0x0

    .line 23
    :goto_0
    iget-object v4, p0, Lo/a0;->a:[J

    .line 24
    .line 25
    shr-int/lit8 v5, v0, 0x3

    .line 26
    .line 27
    and-int/lit8 v6, v0, 0x7

    .line 28
    .line 29
    shl-int/lit8 v6, v6, 0x3

    .line 30
    .line 31
    aget-wide v7, v4, v5

    .line 32
    .line 33
    ushr-long/2addr v7, v6

    .line 34
    add-int/lit8 v5, v5, 0x1

    .line 35
    .line 36
    aget-wide v9, v4, v5

    .line 37
    .line 38
    rsub-int/lit8 v4, v6, 0x40

    .line 39
    .line 40
    shl-long v4, v9, v4

    .line 41
    .line 42
    int-to-long v9, v6

    .line 43
    neg-long v9, v9

    .line 44
    const/16 v6, 0x3f

    .line 45
    .line 46
    shr-long/2addr v9, v6

    .line 47
    and-long/2addr v4, v9

    .line 48
    or-long/2addr v4, v7

    .line 49
    int-to-long v6, v1

    .line 50
    const-wide v8, 0x101010101010101L

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    mul-long v6, v6, v8

    .line 56
    .line 57
    xor-long/2addr v6, v4

    .line 58
    sub-long v8, v6, v8

    .line 59
    .line 60
    not-long v6, v6

    .line 61
    and-long/2addr v6, v8

    .line 62
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    and-long/2addr v6, v8

    .line 68
    :goto_1
    const-wide/16 v10, 0x0

    .line 69
    .line 70
    cmp-long v12, v6, v10

    .line 71
    .line 72
    if-eqz v12, :cond_1

    .line 73
    .line 74
    invoke-static {v6, v7}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    shr-int/lit8 v10, v10, 0x3

    .line 79
    .line 80
    add-int/2addr v10, v0

    .line 81
    and-int/2addr v10, v2

    .line 82
    iget-object v11, p0, Lo/a0;->b:[J

    .line 83
    .line 84
    aget-wide v12, v11, v10

    .line 85
    .line 86
    cmp-long v11, v12, p1

    .line 87
    .line 88
    if-nez v11, :cond_0

    .line 89
    .line 90
    return v10

    .line 91
    :cond_0
    const-wide/16 v10, 0x1

    .line 92
    .line 93
    sub-long v10, v6, v10

    .line 94
    .line 95
    and-long/2addr v6, v10

    .line 96
    goto :goto_1

    .line 97
    :cond_1
    not-long v6, v4

    .line 98
    const/4 v12, 0x6

    .line 99
    shl-long/2addr v6, v12

    .line 100
    and-long/2addr v4, v6

    .line 101
    and-long/2addr v4, v8

    .line 102
    cmp-long v6, v4, v10

    .line 103
    .line 104
    if-eqz v6, :cond_2

    .line 105
    .line 106
    const/4 v0, -0x1

    .line 107
    return v0

    .line 108
    :cond_2
    add-int/lit8 v3, v3, 0x8

    .line 109
    .line 110
    add-int/2addr v0, v3

    .line 111
    and-int/2addr v0, v2

    .line 112
    goto :goto_0
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

.method public final c(J)I
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lo/a0;->b(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lo/a0;->c:[I

    .line 8
    .line 9
    aget p1, p1, v0

    .line 10
    .line 11
    return p1

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, "Cannot find value for key "

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, Lp/a;->e(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    throw p1
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final d(I)V
    .locals 9

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, Lo/s0;->c(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x7

    .line 8
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    iput p1, p0, Lo/a0;->d:I

    .line 15
    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    sget-object v0, Lo/s0;->a:[J

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    add-int/lit8 v0, p1, 0xf

    .line 22
    .line 23
    and-int/lit8 v0, v0, -0x8

    .line 24
    .line 25
    shr-int/lit8 v0, v0, 0x3

    .line 26
    .line 27
    new-array v0, v0, [J

    .line 28
    .line 29
    const-wide v1, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1, v2}, Lvb/l;->r0([JJ)V

    .line 35
    .line 36
    .line 37
    :goto_1
    iput-object v0, p0, Lo/a0;->a:[J

    .line 38
    .line 39
    shr-int/lit8 v1, p1, 0x3

    .line 40
    .line 41
    and-int/lit8 v2, p1, 0x7

    .line 42
    .line 43
    shl-int/lit8 v2, v2, 0x3

    .line 44
    .line 45
    aget-wide v3, v0, v1

    .line 46
    .line 47
    const-wide/16 v5, 0xff

    .line 48
    .line 49
    shl-long/2addr v5, v2

    .line 50
    not-long v7, v5

    .line 51
    and-long/2addr v3, v7

    .line 52
    or-long/2addr v3, v5

    .line 53
    aput-wide v3, v0, v1

    .line 54
    .line 55
    iget v0, p0, Lo/a0;->d:I

    .line 56
    .line 57
    invoke-static {v0}, Lo/s0;->a(I)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget v1, p0, Lo/a0;->e:I

    .line 62
    .line 63
    sub-int/2addr v0, v1

    .line 64
    iput v0, p0, Lo/a0;->f:I

    .line 65
    .line 66
    new-array v0, p1, [J

    .line 67
    .line 68
    iput-object v0, p0, Lo/a0;->b:[J

    .line 69
    .line 70
    new-array p1, p1, [I

    .line 71
    .line 72
    iput-object p1, p0, Lo/a0;->c:[I

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
.end method

.method public final e(IJ)V
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    ushr-long v2, p2, v1

    .line 6
    .line 7
    xor-long v2, p2, v2

    .line 8
    .line 9
    long-to-int v3, v2

    .line 10
    const v2, -0x3361d2af    # -8.293031E7f

    .line 11
    .line 12
    .line 13
    mul-int v3, v3, v2

    .line 14
    .line 15
    shl-int/lit8 v4, v3, 0x10

    .line 16
    .line 17
    xor-int/2addr v3, v4

    .line 18
    ushr-int/lit8 v4, v3, 0x7

    .line 19
    .line 20
    and-int/lit8 v3, v3, 0x7f

    .line 21
    .line 22
    iget v5, v0, Lo/a0;->d:I

    .line 23
    .line 24
    and-int v6, v4, v5

    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    :goto_0
    iget-object v9, v0, Lo/a0;->a:[J

    .line 28
    .line 29
    shr-int/lit8 v10, v6, 0x3

    .line 30
    .line 31
    and-int/lit8 v11, v6, 0x7

    .line 32
    .line 33
    shl-int/lit8 v11, v11, 0x3

    .line 34
    .line 35
    aget-wide v12, v9, v10

    .line 36
    .line 37
    ushr-long/2addr v12, v11

    .line 38
    const/4 v14, 0x1

    .line 39
    add-int/2addr v10, v14

    .line 40
    aget-wide v15, v9, v10

    .line 41
    .line 42
    rsub-int/lit8 v9, v11, 0x40

    .line 43
    .line 44
    shl-long v9, v15, v9

    .line 45
    .line 46
    const/16 v15, 0x20

    .line 47
    .line 48
    const v16, -0x3361d2af    # -8.293031E7f

    .line 49
    .line 50
    .line 51
    int-to-long v1, v11

    .line 52
    neg-long v1, v1

    .line 53
    const/16 v11, 0x3f

    .line 54
    .line 55
    shr-long/2addr v1, v11

    .line 56
    and-long/2addr v1, v9

    .line 57
    or-long/2addr v1, v12

    .line 58
    int-to-long v9, v3

    .line 59
    const-wide v11, 0x101010101010101L

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    mul-long v17, v9, v11

    .line 65
    .line 66
    move/from16 v19, v8

    .line 67
    .line 68
    const/4 v13, 0x0

    .line 69
    xor-long v7, v1, v17

    .line 70
    .line 71
    sub-long v11, v7, v11

    .line 72
    .line 73
    not-long v7, v7

    .line 74
    and-long/2addr v7, v11

    .line 75
    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    and-long/2addr v7, v11

    .line 81
    :goto_1
    const-wide/16 v17, 0x0

    .line 82
    .line 83
    cmp-long v20, v7, v17

    .line 84
    .line 85
    if-eqz v20, :cond_1

    .line 86
    .line 87
    invoke-static {v7, v8}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 88
    .line 89
    .line 90
    move-result v17

    .line 91
    shr-int/lit8 v17, v17, 0x3

    .line 92
    .line 93
    add-int v17, v6, v17

    .line 94
    .line 95
    and-int v17, v17, v5

    .line 96
    .line 97
    move-wide/from16 v20, v11

    .line 98
    .line 99
    iget-object v11, v0, Lo/a0;->b:[J

    .line 100
    .line 101
    aget-wide v22, v11, v17

    .line 102
    .line 103
    cmp-long v11, v22, p2

    .line 104
    .line 105
    if-nez v11, :cond_0

    .line 106
    .line 107
    move/from16 v1, v17

    .line 108
    .line 109
    goto/16 :goto_d

    .line 110
    .line 111
    :cond_0
    const-wide/16 v11, 0x1

    .line 112
    .line 113
    sub-long v11, v7, v11

    .line 114
    .line 115
    and-long/2addr v7, v11

    .line 116
    move-wide/from16 v11, v20

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_1
    move-wide/from16 v20, v11

    .line 120
    .line 121
    not-long v7, v1

    .line 122
    const/4 v11, 0x6

    .line 123
    shl-long/2addr v7, v11

    .line 124
    and-long/2addr v1, v7

    .line 125
    and-long v1, v1, v20

    .line 126
    .line 127
    const/16 v7, 0x8

    .line 128
    .line 129
    cmp-long v8, v1, v17

    .line 130
    .line 131
    if-eqz v8, :cond_10

    .line 132
    .line 133
    invoke-virtual {v0, v4}, Lo/a0;->a(I)I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    iget v2, v0, Lo/a0;->f:I

    .line 138
    .line 139
    const-wide/16 v11, 0xff

    .line 140
    .line 141
    if-nez v2, :cond_2

    .line 142
    .line 143
    iget-object v2, v0, Lo/a0;->a:[J

    .line 144
    .line 145
    shr-int/lit8 v8, v1, 0x3

    .line 146
    .line 147
    aget-wide v22, v2, v8

    .line 148
    .line 149
    and-int/lit8 v2, v1, 0x7

    .line 150
    .line 151
    shl-int/lit8 v2, v2, 0x3

    .line 152
    .line 153
    shr-long v22, v22, v2

    .line 154
    .line 155
    and-long v22, v22, v11

    .line 156
    .line 157
    const-wide/16 v24, 0xfe

    .line 158
    .line 159
    cmp-long v2, v22, v24

    .line 160
    .line 161
    if-nez v2, :cond_3

    .line 162
    .line 163
    :cond_2
    move-wide/from16 v28, v11

    .line 164
    .line 165
    const/16 v19, 0x7

    .line 166
    .line 167
    const-wide/16 v22, 0x80

    .line 168
    .line 169
    const/16 v33, 0x0

    .line 170
    .line 171
    const/16 v35, 0x1

    .line 172
    .line 173
    goto/16 :goto_c

    .line 174
    .line 175
    :cond_3
    iget v1, v0, Lo/a0;->d:I

    .line 176
    .line 177
    if-le v1, v7, :cond_b

    .line 178
    .line 179
    iget v2, v0, Lo/a0;->e:I

    .line 180
    .line 181
    const-wide/16 v22, 0x80

    .line 182
    .line 183
    int-to-long v5, v2

    .line 184
    const-wide/16 v26, 0x20

    .line 185
    .line 186
    mul-long v5, v5, v26

    .line 187
    .line 188
    int-to-long v1, v1

    .line 189
    const-wide/16 v26, 0x19

    .line 190
    .line 191
    mul-long v1, v1, v26

    .line 192
    .line 193
    const-wide/high16 v26, -0x8000000000000000L

    .line 194
    .line 195
    xor-long v5, v5, v26

    .line 196
    .line 197
    xor-long v1, v1, v26

    .line 198
    .line 199
    invoke-static {v5, v6, v1, v2}, Ljava/lang/Long;->compare(JJ)I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    if-gtz v1, :cond_a

    .line 204
    .line 205
    iget-object v1, v0, Lo/a0;->a:[J

    .line 206
    .line 207
    iget v2, v0, Lo/a0;->d:I

    .line 208
    .line 209
    iget-object v5, v0, Lo/a0;->b:[J

    .line 210
    .line 211
    iget-object v6, v0, Lo/a0;->c:[I

    .line 212
    .line 213
    add-int/lit8 v8, v2, 0x7

    .line 214
    .line 215
    shr-int/lit8 v8, v8, 0x3

    .line 216
    .line 217
    const/4 v3, 0x0

    .line 218
    const/16 v19, 0x7

    .line 219
    .line 220
    :goto_2
    if-ge v3, v8, :cond_4

    .line 221
    .line 222
    aget-wide v28, v1, v3

    .line 223
    .line 224
    move/from16 v31, v8

    .line 225
    .line 226
    const/16 v30, 0x8

    .line 227
    .line 228
    and-long v7, v28, v20

    .line 229
    .line 230
    move-wide/from16 v28, v11

    .line 231
    .line 232
    not-long v11, v7

    .line 233
    ushr-long v7, v7, v19

    .line 234
    .line 235
    add-long/2addr v11, v7

    .line 236
    const-wide v7, -0x101010101010102L

    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    and-long/2addr v7, v11

    .line 242
    aput-wide v7, v1, v3

    .line 243
    .line 244
    add-int/lit8 v3, v3, 0x1

    .line 245
    .line 246
    move-wide/from16 v11, v28

    .line 247
    .line 248
    move/from16 v8, v31

    .line 249
    .line 250
    const/16 v7, 0x8

    .line 251
    .line 252
    goto :goto_2

    .line 253
    :cond_4
    move-wide/from16 v28, v11

    .line 254
    .line 255
    const/16 v30, 0x8

    .line 256
    .line 257
    invoke-static {v1}, Lvb/l;->x0([J)I

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    add-int/lit8 v7, v3, -0x1

    .line 262
    .line 263
    aget-wide v11, v1, v7

    .line 264
    .line 265
    const-wide v20, 0xffffffffffffffL

    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    and-long v11, v11, v20

    .line 271
    .line 272
    const-wide/high16 v31, -0x100000000000000L

    .line 273
    .line 274
    or-long v11, v11, v31

    .line 275
    .line 276
    aput-wide v11, v1, v7

    .line 277
    .line 278
    aget-wide v7, v1, v13

    .line 279
    .line 280
    aput-wide v7, v1, v3

    .line 281
    .line 282
    const/4 v3, 0x0

    .line 283
    :goto_3
    if-eq v3, v2, :cond_9

    .line 284
    .line 285
    shr-int/lit8 v7, v3, 0x3

    .line 286
    .line 287
    aget-wide v11, v1, v7

    .line 288
    .line 289
    and-int/lit8 v8, v3, 0x7

    .line 290
    .line 291
    shl-int/lit8 v8, v8, 0x3

    .line 292
    .line 293
    shr-long/2addr v11, v8

    .line 294
    and-long v11, v11, v28

    .line 295
    .line 296
    cmp-long v31, v11, v22

    .line 297
    .line 298
    if-nez v31, :cond_5

    .line 299
    .line 300
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 301
    .line 302
    goto :goto_3

    .line 303
    :cond_5
    cmp-long v31, v11, v24

    .line 304
    .line 305
    if-eqz v31, :cond_6

    .line 306
    .line 307
    goto :goto_4

    .line 308
    :cond_6
    aget-wide v11, v5, v3

    .line 309
    .line 310
    ushr-long v31, v11, v15

    .line 311
    .line 312
    xor-long v11, v11, v31

    .line 313
    .line 314
    long-to-int v12, v11

    .line 315
    mul-int v12, v12, v16

    .line 316
    .line 317
    shl-int/lit8 v11, v12, 0x10

    .line 318
    .line 319
    xor-int/2addr v11, v12

    .line 320
    ushr-int/lit8 v12, v11, 0x7

    .line 321
    .line 322
    invoke-virtual {v0, v12}, Lo/a0;->a(I)I

    .line 323
    .line 324
    .line 325
    move-result v31

    .line 326
    and-int/2addr v12, v2

    .line 327
    sub-int v32, v31, v12

    .line 328
    .line 329
    and-int v32, v32, v2

    .line 330
    .line 331
    const/16 v33, 0x0

    .line 332
    .line 333
    div-int/lit8 v13, v32, 0x8

    .line 334
    .line 335
    sub-int v12, v3, v12

    .line 336
    .line 337
    and-int/2addr v12, v2

    .line 338
    div-int/lit8 v12, v12, 0x8

    .line 339
    .line 340
    if-ne v13, v12, :cond_7

    .line 341
    .line 342
    and-int/lit8 v11, v11, 0x7f

    .line 343
    .line 344
    int-to-long v11, v11

    .line 345
    aget-wide v31, v1, v7

    .line 346
    .line 347
    const/4 v13, 0x1

    .line 348
    const/16 v34, 0x20

    .line 349
    .line 350
    shl-long v14, v28, v8

    .line 351
    .line 352
    not-long v14, v14

    .line 353
    and-long v14, v31, v14

    .line 354
    .line 355
    shl-long/2addr v11, v8

    .line 356
    or-long/2addr v11, v14

    .line 357
    aput-wide v11, v1, v7

    .line 358
    .line 359
    array-length v7, v1

    .line 360
    sub-int/2addr v7, v13

    .line 361
    aget-wide v11, v1, v33

    .line 362
    .line 363
    and-long v11, v11, v20

    .line 364
    .line 365
    or-long v11, v11, v26

    .line 366
    .line 367
    aput-wide v11, v1, v7

    .line 368
    .line 369
    add-int/lit8 v3, v3, 0x1

    .line 370
    .line 371
    :goto_5
    const/4 v13, 0x0

    .line 372
    const/4 v14, 0x1

    .line 373
    const/16 v15, 0x20

    .line 374
    .line 375
    goto :goto_3

    .line 376
    :cond_7
    const/4 v13, 0x1

    .line 377
    const/16 v34, 0x20

    .line 378
    .line 379
    shr-int/lit8 v12, v31, 0x3

    .line 380
    .line 381
    aget-wide v14, v1, v12

    .line 382
    .line 383
    and-int/lit8 v32, v31, 0x7

    .line 384
    .line 385
    shl-int/lit8 v32, v32, 0x3

    .line 386
    .line 387
    shr-long v35, v14, v32

    .line 388
    .line 389
    and-long v35, v35, v28

    .line 390
    .line 391
    cmp-long v37, v35, v22

    .line 392
    .line 393
    if-nez v37, :cond_8

    .line 394
    .line 395
    and-int/lit8 v11, v11, 0x7f

    .line 396
    .line 397
    move-wide/from16 v36, v14

    .line 398
    .line 399
    const/16 v35, 0x1

    .line 400
    .line 401
    int-to-long v13, v11

    .line 402
    move v15, v2

    .line 403
    move/from16 v38, v3

    .line 404
    .line 405
    shl-long v2, v28, v32

    .line 406
    .line 407
    not-long v2, v2

    .line 408
    and-long v2, v36, v2

    .line 409
    .line 410
    shl-long v13, v13, v32

    .line 411
    .line 412
    or-long/2addr v2, v13

    .line 413
    aput-wide v2, v1, v12

    .line 414
    .line 415
    aget-wide v2, v1, v7

    .line 416
    .line 417
    shl-long v11, v28, v8

    .line 418
    .line 419
    not-long v11, v11

    .line 420
    and-long/2addr v2, v11

    .line 421
    shl-long v11, v22, v8

    .line 422
    .line 423
    or-long/2addr v2, v11

    .line 424
    aput-wide v2, v1, v7

    .line 425
    .line 426
    aget-wide v2, v5, v38

    .line 427
    .line 428
    aput-wide v2, v5, v31

    .line 429
    .line 430
    aput-wide v17, v5, v38

    .line 431
    .line 432
    aget v2, v6, v38

    .line 433
    .line 434
    aput v2, v6, v31

    .line 435
    .line 436
    aput v33, v6, v38

    .line 437
    .line 438
    move/from16 v3, v38

    .line 439
    .line 440
    goto :goto_6

    .line 441
    :cond_8
    move/from16 v38, v3

    .line 442
    .line 443
    move-wide/from16 v36, v14

    .line 444
    .line 445
    const/16 v35, 0x1

    .line 446
    .line 447
    move v15, v2

    .line 448
    and-int/lit8 v2, v11, 0x7f

    .line 449
    .line 450
    int-to-long v2, v2

    .line 451
    shl-long v7, v28, v32

    .line 452
    .line 453
    not-long v7, v7

    .line 454
    and-long v7, v36, v7

    .line 455
    .line 456
    shl-long v2, v2, v32

    .line 457
    .line 458
    or-long/2addr v2, v7

    .line 459
    aput-wide v2, v1, v12

    .line 460
    .line 461
    aget-wide v2, v5, v31

    .line 462
    .line 463
    aget-wide v7, v5, v38

    .line 464
    .line 465
    aput-wide v7, v5, v31

    .line 466
    .line 467
    aput-wide v2, v5, v38

    .line 468
    .line 469
    aget v2, v6, v31

    .line 470
    .line 471
    aget v3, v6, v38

    .line 472
    .line 473
    aput v3, v6, v31

    .line 474
    .line 475
    aput v2, v6, v38

    .line 476
    .line 477
    add-int/lit8 v3, v38, -0x1

    .line 478
    .line 479
    :goto_6
    array-length v2, v1

    .line 480
    add-int/lit8 v2, v2, -0x1

    .line 481
    .line 482
    aget-wide v7, v1, v33

    .line 483
    .line 484
    and-long v7, v7, v20

    .line 485
    .line 486
    or-long v7, v7, v26

    .line 487
    .line 488
    aput-wide v7, v1, v2

    .line 489
    .line 490
    add-int/lit8 v3, v3, 0x1

    .line 491
    .line 492
    move v2, v15

    .line 493
    goto :goto_5

    .line 494
    :cond_9
    const/16 v33, 0x0

    .line 495
    .line 496
    const/16 v35, 0x1

    .line 497
    .line 498
    iget v1, v0, Lo/a0;->d:I

    .line 499
    .line 500
    invoke-static {v1}, Lo/s0;->a(I)I

    .line 501
    .line 502
    .line 503
    move-result v1

    .line 504
    iget v2, v0, Lo/a0;->e:I

    .line 505
    .line 506
    sub-int/2addr v1, v2

    .line 507
    iput v1, v0, Lo/a0;->f:I

    .line 508
    .line 509
    goto/16 :goto_b

    .line 510
    .line 511
    :cond_a
    :goto_7
    move-wide/from16 v28, v11

    .line 512
    .line 513
    const/16 v19, 0x7

    .line 514
    .line 515
    const/16 v33, 0x0

    .line 516
    .line 517
    const/16 v34, 0x20

    .line 518
    .line 519
    const/16 v35, 0x1

    .line 520
    .line 521
    goto :goto_8

    .line 522
    :cond_b
    const-wide/16 v22, 0x80

    .line 523
    .line 524
    goto :goto_7

    .line 525
    :goto_8
    iget v1, v0, Lo/a0;->d:I

    .line 526
    .line 527
    invoke-static {v1}, Lo/s0;->b(I)I

    .line 528
    .line 529
    .line 530
    move-result v1

    .line 531
    iget-object v2, v0, Lo/a0;->a:[J

    .line 532
    .line 533
    iget-object v3, v0, Lo/a0;->b:[J

    .line 534
    .line 535
    iget-object v5, v0, Lo/a0;->c:[I

    .line 536
    .line 537
    iget v6, v0, Lo/a0;->d:I

    .line 538
    .line 539
    invoke-virtual {v0, v1}, Lo/a0;->d(I)V

    .line 540
    .line 541
    .line 542
    iget-object v1, v0, Lo/a0;->a:[J

    .line 543
    .line 544
    iget-object v7, v0, Lo/a0;->b:[J

    .line 545
    .line 546
    iget-object v8, v0, Lo/a0;->c:[I

    .line 547
    .line 548
    iget v11, v0, Lo/a0;->d:I

    .line 549
    .line 550
    const/4 v12, 0x0

    .line 551
    :goto_9
    if-ge v12, v6, :cond_d

    .line 552
    .line 553
    shr-int/lit8 v13, v12, 0x3

    .line 554
    .line 555
    aget-wide v13, v2, v13

    .line 556
    .line 557
    and-int/lit8 v15, v12, 0x7

    .line 558
    .line 559
    shl-int/lit8 v15, v15, 0x3

    .line 560
    .line 561
    shr-long/2addr v13, v15

    .line 562
    and-long v13, v13, v28

    .line 563
    .line 564
    cmp-long v15, v13, v22

    .line 565
    .line 566
    if-gez v15, :cond_c

    .line 567
    .line 568
    aget-wide v13, v3, v12

    .line 569
    .line 570
    ushr-long v17, v13, v34

    .line 571
    .line 572
    move-object/from16 v20, v1

    .line 573
    .line 574
    move-object v15, v2

    .line 575
    xor-long v1, v13, v17

    .line 576
    .line 577
    long-to-int v2, v1

    .line 578
    mul-int v2, v2, v16

    .line 579
    .line 580
    shl-int/lit8 v1, v2, 0x10

    .line 581
    .line 582
    xor-int/2addr v1, v2

    .line 583
    ushr-int/lit8 v2, v1, 0x7

    .line 584
    .line 585
    invoke-virtual {v0, v2}, Lo/a0;->a(I)I

    .line 586
    .line 587
    .line 588
    move-result v2

    .line 589
    and-int/lit8 v1, v1, 0x7f

    .line 590
    .line 591
    move/from16 v17, v2

    .line 592
    .line 593
    int-to-long v1, v1

    .line 594
    shr-int/lit8 v18, v17, 0x3

    .line 595
    .line 596
    and-int/lit8 v21, v17, 0x7

    .line 597
    .line 598
    shl-int/lit8 v21, v21, 0x3

    .line 599
    .line 600
    aget-wide v24, v20, v18

    .line 601
    .line 602
    move-wide/from16 v26, v1

    .line 603
    .line 604
    shl-long v1, v28, v21

    .line 605
    .line 606
    not-long v1, v1

    .line 607
    and-long v1, v24, v1

    .line 608
    .line 609
    shl-long v24, v26, v21

    .line 610
    .line 611
    or-long v1, v1, v24

    .line 612
    .line 613
    aput-wide v1, v20, v18

    .line 614
    .line 615
    add-int/lit8 v18, v17, -0x7

    .line 616
    .line 617
    and-int v18, v18, v11

    .line 618
    .line 619
    and-int/lit8 v21, v11, 0x7

    .line 620
    .line 621
    add-int v18, v18, v21

    .line 622
    .line 623
    shr-int/lit8 v18, v18, 0x3

    .line 624
    .line 625
    aput-wide v1, v20, v18

    .line 626
    .line 627
    aput-wide v13, v7, v17

    .line 628
    .line 629
    aget v1, v5, v12

    .line 630
    .line 631
    aput v1, v8, v17

    .line 632
    .line 633
    goto :goto_a

    .line 634
    :cond_c
    move-object/from16 v20, v1

    .line 635
    .line 636
    move-object v15, v2

    .line 637
    :goto_a
    add-int/lit8 v12, v12, 0x1

    .line 638
    .line 639
    move-object v2, v15

    .line 640
    move-object/from16 v1, v20

    .line 641
    .line 642
    goto :goto_9

    .line 643
    :cond_d
    :goto_b
    invoke-virtual {v0, v4}, Lo/a0;->a(I)I

    .line 644
    .line 645
    .line 646
    move-result v1

    .line 647
    :goto_c
    iget v2, v0, Lo/a0;->e:I

    .line 648
    .line 649
    add-int/lit8 v2, v2, 0x1

    .line 650
    .line 651
    iput v2, v0, Lo/a0;->e:I

    .line 652
    .line 653
    iget v2, v0, Lo/a0;->f:I

    .line 654
    .line 655
    iget-object v3, v0, Lo/a0;->a:[J

    .line 656
    .line 657
    shr-int/lit8 v4, v1, 0x3

    .line 658
    .line 659
    aget-wide v5, v3, v4

    .line 660
    .line 661
    and-int/lit8 v7, v1, 0x7

    .line 662
    .line 663
    shl-int/lit8 v7, v7, 0x3

    .line 664
    .line 665
    shr-long v11, v5, v7

    .line 666
    .line 667
    and-long v11, v11, v28

    .line 668
    .line 669
    cmp-long v8, v11, v22

    .line 670
    .line 671
    if-nez v8, :cond_e

    .line 672
    .line 673
    const/16 v33, 0x1

    .line 674
    .line 675
    :cond_e
    sub-int v2, v2, v33

    .line 676
    .line 677
    iput v2, v0, Lo/a0;->f:I

    .line 678
    .line 679
    iget v2, v0, Lo/a0;->d:I

    .line 680
    .line 681
    shl-long v11, v28, v7

    .line 682
    .line 683
    not-long v11, v11

    .line 684
    and-long/2addr v5, v11

    .line 685
    shl-long v7, v9, v7

    .line 686
    .line 687
    or-long/2addr v5, v7

    .line 688
    aput-wide v5, v3, v4

    .line 689
    .line 690
    add-int/lit8 v4, v1, -0x7

    .line 691
    .line 692
    and-int/2addr v4, v2

    .line 693
    and-int/lit8 v2, v2, 0x7

    .line 694
    .line 695
    add-int/2addr v4, v2

    .line 696
    shr-int/lit8 v2, v4, 0x3

    .line 697
    .line 698
    aput-wide v5, v3, v2

    .line 699
    .line 700
    not-int v1, v1

    .line 701
    :goto_d
    if-gez v1, :cond_f

    .line 702
    .line 703
    not-int v1, v1

    .line 704
    :cond_f
    iget-object v2, v0, Lo/a0;->b:[J

    .line 705
    .line 706
    aput-wide p2, v2, v1

    .line 707
    .line 708
    iget-object v2, v0, Lo/a0;->c:[I

    .line 709
    .line 710
    aput p1, v2, v1

    .line 711
    .line 712
    return-void

    .line 713
    :cond_10
    const/16 v30, 0x8

    .line 714
    .line 715
    const/16 v33, 0x0

    .line 716
    .line 717
    const/16 v34, 0x20

    .line 718
    .line 719
    add-int/lit8 v8, v19, 0x8

    .line 720
    .line 721
    add-int/2addr v6, v8

    .line 722
    and-int/2addr v6, v5

    .line 723
    const/16 v1, 0x20

    .line 724
    .line 725
    const v2, -0x3361d2af    # -8.293031E7f

    .line 726
    .line 727
    .line 728
    goto/16 :goto_0
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

.method public final equals(Ljava/lang/Object;)Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v1, v0, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    instance-of v3, v1, Lo/a0;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    if-nez v3, :cond_1

    .line 13
    .line 14
    return v4

    .line 15
    :cond_1
    check-cast v1, Lo/a0;

    .line 16
    .line 17
    iget v3, v1, Lo/a0;->e:I

    .line 18
    .line 19
    iget v5, v0, Lo/a0;->e:I

    .line 20
    .line 21
    if-eq v3, v5, :cond_2

    .line 22
    .line 23
    return v4

    .line 24
    :cond_2
    iget-object v3, v0, Lo/a0;->b:[J

    .line 25
    .line 26
    iget-object v5, v0, Lo/a0;->c:[I

    .line 27
    .line 28
    iget-object v6, v0, Lo/a0;->a:[J

    .line 29
    .line 30
    array-length v7, v6

    .line 31
    add-int/lit8 v7, v7, -0x2

    .line 32
    .line 33
    if-ltz v7, :cond_8

    .line 34
    .line 35
    const/4 v8, 0x0

    .line 36
    :goto_0
    aget-wide v9, v6, v8

    .line 37
    .line 38
    not-long v11, v9

    .line 39
    const/4 v13, 0x7

    .line 40
    shl-long/2addr v11, v13

    .line 41
    and-long/2addr v11, v9

    .line 42
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    and-long/2addr v11, v13

    .line 48
    cmp-long v15, v11, v13

    .line 49
    .line 50
    if-eqz v15, :cond_7

    .line 51
    .line 52
    sub-int v11, v8, v7

    .line 53
    .line 54
    not-int v11, v11

    .line 55
    ushr-int/lit8 v11, v11, 0x1f

    .line 56
    .line 57
    const/16 v12, 0x8

    .line 58
    .line 59
    rsub-int/lit8 v11, v11, 0x8

    .line 60
    .line 61
    const/4 v13, 0x0

    .line 62
    :goto_1
    if-ge v13, v11, :cond_6

    .line 63
    .line 64
    const-wide/16 v14, 0xff

    .line 65
    .line 66
    and-long/2addr v14, v9

    .line 67
    const-wide/16 v16, 0x80

    .line 68
    .line 69
    cmp-long v18, v14, v16

    .line 70
    .line 71
    if-gez v18, :cond_4

    .line 72
    .line 73
    shl-int/lit8 v14, v8, 0x3

    .line 74
    .line 75
    add-int/2addr v14, v13

    .line 76
    move-object/from16 v16, v3

    .line 77
    .line 78
    const/4 v15, 0x1

    .line 79
    aget-wide v2, v16, v14

    .line 80
    .line 81
    aget v14, v5, v14

    .line 82
    .line 83
    invoke-virtual {v1, v2, v3}, Lo/a0;->b(J)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-ltz v2, :cond_3

    .line 88
    .line 89
    iget-object v3, v1, Lo/a0;->c:[I

    .line 90
    .line 91
    aget v2, v3, v2

    .line 92
    .line 93
    if-eq v14, v2, :cond_5

    .line 94
    .line 95
    :cond_3
    return v4

    .line 96
    :cond_4
    move-object/from16 v16, v3

    .line 97
    .line 98
    const/4 v15, 0x1

    .line 99
    :cond_5
    shr-long/2addr v9, v12

    .line 100
    add-int/lit8 v13, v13, 0x1

    .line 101
    .line 102
    move-object/from16 v3, v16

    .line 103
    .line 104
    const/4 v2, 0x1

    .line 105
    goto :goto_1

    .line 106
    :cond_6
    move-object/from16 v16, v3

    .line 107
    .line 108
    const/4 v15, 0x1

    .line 109
    if-ne v11, v12, :cond_9

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_7
    move-object/from16 v16, v3

    .line 113
    .line 114
    const/4 v15, 0x1

    .line 115
    :goto_2
    if-eq v8, v7, :cond_9

    .line 116
    .line 117
    add-int/lit8 v8, v8, 0x1

    .line 118
    .line 119
    move-object/from16 v3, v16

    .line 120
    .line 121
    const/4 v2, 0x1

    .line 122
    goto :goto_0

    .line 123
    :cond_8
    const/4 v15, 0x1

    .line 124
    :cond_9
    return v15
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

.method public final hashCode()I
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lo/a0;->b:[J

    .line 4
    .line 5
    iget-object v2, v0, Lo/a0;->c:[I

    .line 6
    .line 7
    iget-object v3, v0, Lo/a0;->a:[J

    .line 8
    .line 9
    array-length v4, v3

    .line 10
    add-int/lit8 v4, v4, -0x2

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    if-ltz v4, :cond_5

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v7, 0x0

    .line 17
    :goto_0
    aget-wide v8, v3, v6

    .line 18
    .line 19
    not-long v10, v8

    .line 20
    const/4 v12, 0x7

    .line 21
    shl-long/2addr v10, v12

    .line 22
    and-long/2addr v10, v8

    .line 23
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    and-long/2addr v10, v12

    .line 29
    cmp-long v14, v10, v12

    .line 30
    .line 31
    if-eqz v14, :cond_3

    .line 32
    .line 33
    sub-int v10, v6, v4

    .line 34
    .line 35
    not-int v10, v10

    .line 36
    ushr-int/lit8 v10, v10, 0x1f

    .line 37
    .line 38
    const/16 v11, 0x8

    .line 39
    .line 40
    rsub-int/lit8 v10, v10, 0x8

    .line 41
    .line 42
    const/4 v12, 0x0

    .line 43
    :goto_1
    if-ge v12, v10, :cond_1

    .line 44
    .line 45
    const-wide/16 v13, 0xff

    .line 46
    .line 47
    and-long/2addr v13, v8

    .line 48
    const-wide/16 v15, 0x80

    .line 49
    .line 50
    cmp-long v17, v13, v15

    .line 51
    .line 52
    if-gez v17, :cond_0

    .line 53
    .line 54
    shl-int/lit8 v13, v6, 0x3

    .line 55
    .line 56
    add-int/2addr v13, v12

    .line 57
    aget-wide v14, v1, v13

    .line 58
    .line 59
    aget v13, v2, v13

    .line 60
    .line 61
    const/16 v16, 0x20

    .line 62
    .line 63
    ushr-long v16, v14, v16

    .line 64
    .line 65
    xor-long v14, v14, v16

    .line 66
    .line 67
    long-to-int v15, v14

    .line 68
    xor-int/2addr v13, v15

    .line 69
    add-int/2addr v7, v13

    .line 70
    :cond_0
    shr-long/2addr v8, v11

    .line 71
    add-int/lit8 v12, v12, 0x1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    if-ne v10, v11, :cond_2

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    return v7

    .line 78
    :cond_3
    :goto_2
    if-eq v6, v4, :cond_4

    .line 79
    .line 80
    add-int/lit8 v6, v6, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    return v7

    .line 84
    :cond_5
    return v5
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
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lo/a0;->e:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const-string v1, "{}"

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "{"

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, v0, Lo/a0;->b:[J

    .line 18
    .line 19
    iget-object v3, v0, Lo/a0;->c:[I

    .line 20
    .line 21
    iget-object v4, v0, Lo/a0;->a:[J

    .line 22
    .line 23
    array-length v5, v4

    .line 24
    add-int/lit8 v5, v5, -0x2

    .line 25
    .line 26
    if-ltz v5, :cond_5

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v8, 0x0

    .line 30
    :goto_0
    aget-wide v9, v4, v7

    .line 31
    .line 32
    not-long v11, v9

    .line 33
    const/4 v13, 0x7

    .line 34
    shl-long/2addr v11, v13

    .line 35
    and-long/2addr v11, v9

    .line 36
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    and-long/2addr v11, v13

    .line 42
    cmp-long v15, v11, v13

    .line 43
    .line 44
    if-eqz v15, :cond_4

    .line 45
    .line 46
    sub-int v11, v7, v5

    .line 47
    .line 48
    not-int v11, v11

    .line 49
    ushr-int/lit8 v11, v11, 0x1f

    .line 50
    .line 51
    const/16 v12, 0x8

    .line 52
    .line 53
    rsub-int/lit8 v11, v11, 0x8

    .line 54
    .line 55
    const/4 v13, 0x0

    .line 56
    :goto_1
    if-ge v13, v11, :cond_3

    .line 57
    .line 58
    const-wide/16 v14, 0xff

    .line 59
    .line 60
    and-long/2addr v14, v9

    .line 61
    const-wide/16 v16, 0x80

    .line 62
    .line 63
    cmp-long v18, v14, v16

    .line 64
    .line 65
    if-gez v18, :cond_1

    .line 66
    .line 67
    shl-int/lit8 v14, v7, 0x3

    .line 68
    .line 69
    add-int/2addr v14, v13

    .line 70
    move/from16 v16, v7

    .line 71
    .line 72
    aget-wide v6, v2, v14

    .line 73
    .line 74
    aget v14, v3, v14

    .line 75
    .line 76
    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v6, "="

    .line 80
    .line 81
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    add-int/lit8 v8, v8, 0x1

    .line 88
    .line 89
    iget v6, v0, Lo/a0;->e:I

    .line 90
    .line 91
    if-ge v8, v6, :cond_2

    .line 92
    .line 93
    const-string v6, ", "

    .line 94
    .line 95
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_1
    move/from16 v16, v7

    .line 100
    .line 101
    :cond_2
    :goto_2
    shr-long/2addr v9, v12

    .line 102
    add-int/lit8 v13, v13, 0x1

    .line 103
    .line 104
    move/from16 v7, v16

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_3
    move/from16 v16, v7

    .line 108
    .line 109
    if-ne v11, v12, :cond_5

    .line 110
    .line 111
    move/from16 v6, v16

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_4
    move v6, v7

    .line 115
    :goto_3
    if-eq v6, v5, :cond_5

    .line 116
    .line 117
    add-int/lit8 v7, v6, 0x1

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_5
    const/16 v2, 0x7d

    .line 121
    .line 122
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    const-string v2, "toString(...)"

    .line 130
    .line 131
    invoke-static {v1, v2}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    return-object v1
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

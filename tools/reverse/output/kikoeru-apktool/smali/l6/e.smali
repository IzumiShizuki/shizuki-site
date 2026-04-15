.class public abstract Ll6/e;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Lp4/c0;->a:I

    .line 2
    .line 3
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    const-string v1, "OpusHead"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Ll6/e;->a:[B

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
.end method

.method public static a(ILp4/s;)Lj5/x0;
    .locals 10

    .line 1
    add-int/lit8 p0, p0, 0xc

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lp4/s;->G(I)V

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    invoke-virtual {p1, p0}, Lp4/s;->H(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Ll6/e;->b(Lp4/s;)I

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    invoke-virtual {p1, v0}, Lp4/s;->H(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lp4/s;->u()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    and-int/lit16 v2, v1, 0x80

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lp4/s;->H(I)V

    .line 26
    .line 27
    .line 28
    :cond_0
    and-int/lit8 v2, v1, 0x40

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1}, Lp4/s;->u()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {p1, v2}, Lp4/s;->H(I)V

    .line 37
    .line 38
    .line 39
    :cond_1
    and-int/lit8 v1, v1, 0x20

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Lp4/s;->H(I)V

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-virtual {p1, p0}, Lp4/s;->H(I)V

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, Ll6/e;->b(Lp4/s;)I

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Lp4/s;->u()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-static {v0}, Lm4/o0;->f(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const-string v0, "audio/mpeg"

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_6

    .line 67
    .line 68
    const-string v0, "audio/vnd.dts"

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_6

    .line 75
    .line 76
    const-string v0, "audio/vnd.dts.hd"

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    const/4 v0, 0x4

    .line 86
    invoke-virtual {p1, v0}, Lp4/s;->H(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Lp4/s;->w()J

    .line 90
    .line 91
    .line 92
    move-result-wide v0

    .line 93
    invoke-virtual {p1}, Lp4/s;->w()J

    .line 94
    .line 95
    .line 96
    move-result-wide v3

    .line 97
    invoke-virtual {p1, p0}, Lp4/s;->H(I)V

    .line 98
    .line 99
    .line 100
    invoke-static {p1}, Ll6/e;->b(Lp4/s;)I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    move-wide v4, v3

    .line 105
    new-array v3, p0, [B

    .line 106
    .line 107
    const/4 v6, 0x0

    .line 108
    invoke-virtual {p1, v3, v6, p0}, Lp4/s;->e([BII)V

    .line 109
    .line 110
    .line 111
    move-wide p0, v0

    .line 112
    new-instance v1, Lj5/x0;

    .line 113
    .line 114
    const-wide/16 v6, -0x1

    .line 115
    .line 116
    const-wide/16 v8, 0x0

    .line 117
    .line 118
    cmp-long v0, v4, v8

    .line 119
    .line 120
    if-lez v0, :cond_4

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_4
    move-wide v4, v6

    .line 124
    :goto_0
    cmp-long v0, p0, v8

    .line 125
    .line 126
    if-lez v0, :cond_5

    .line 127
    .line 128
    move-wide v6, p0

    .line 129
    :cond_5
    invoke-direct/range {v1 .. v7}, Lj5/x0;-><init>(Ljava/lang/String;[BJJ)V

    .line 130
    .line 131
    .line 132
    return-object v1

    .line 133
    :cond_6
    :goto_1
    new-instance v1, Lj5/x0;

    .line 134
    .line 135
    const-wide/16 v4, -0x1

    .line 136
    .line 137
    const-wide/16 v6, -0x1

    .line 138
    .line 139
    const/4 v3, 0x0

    .line 140
    invoke-direct/range {v1 .. v7}, Lj5/x0;-><init>(Ljava/lang/String;[BJJ)V

    .line 141
    .line 142
    .line 143
    return-object v1
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

.method public static b(Lp4/s;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lp4/s;->u()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit8 v1, v0, 0x7f

    .line 6
    .line 7
    :goto_0
    const/16 v2, 0x80

    .line 8
    .line 9
    and-int/2addr v0, v2

    .line 10
    if-ne v0, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lp4/s;->u()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    shl-int/lit8 v1, v1, 0x7

    .line 17
    .line 18
    and-int/lit8 v2, v0, 0x7f

    .line 19
    .line 20
    or-int/2addr v1, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return v1
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

.method public static c(I)I
    .locals 0

    .line 1
    shr-int/lit8 p0, p0, 0x18

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0xff

    .line 4
    .line 5
    return p0
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

.method public static d(Lp4/s;)Lq4/f;
    .locals 11

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lp4/s;->G(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lp4/s;->g()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, Ll6/e;->c(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lp4/s;->w()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    invoke-virtual {p0}, Lp4/s;->w()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    :goto_0
    move-wide v5, v0

    .line 25
    move-wide v7, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-virtual {p0}, Lp4/s;->o()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-virtual {p0}, Lp4/s;->o()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    goto :goto_0

    .line 36
    :goto_1
    invoke-virtual {p0}, Lp4/s;->w()J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    new-instance v4, Lq4/f;

    .line 41
    .line 42
    invoke-direct/range {v4 .. v10}, Lq4/f;-><init>(JJJ)V

    .line 43
    .line 44
    .line 45
    return-object v4
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

.method public static e(Lp4/s;II)Landroid/util/Pair;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lp4/s;->b:I

    .line 4
    .line 5
    :goto_0
    sub-int v2, v1, p1

    .line 6
    .line 7
    move/from16 v4, p2

    .line 8
    .line 9
    if-ge v2, v4, :cond_10

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lp4/s;->G(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lp4/s;->g()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x1

    .line 20
    if-lez v2, :cond_0

    .line 21
    .line 22
    const/4 v7, 0x1

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    const/4 v7, 0x0

    .line 25
    :goto_1
    const-string v8, "childAtomSize must be positive"

    .line 26
    .line 27
    invoke-static {v8, v7}, Lr5/b;->c(Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lp4/s;->g()I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    const v8, 0x73696e66

    .line 35
    .line 36
    .line 37
    if-ne v7, v8, :cond_f

    .line 38
    .line 39
    add-int/lit8 v7, v1, 0x8

    .line 40
    .line 41
    const/4 v8, -0x1

    .line 42
    const/4 v9, -0x1

    .line 43
    const/4 v10, 0x0

    .line 44
    const/4 v11, 0x0

    .line 45
    const/4 v12, 0x0

    .line 46
    :goto_2
    sub-int v13, v7, v1

    .line 47
    .line 48
    const/4 v14, 0x4

    .line 49
    if-ge v13, v2, :cond_4

    .line 50
    .line 51
    invoke-virtual {v0, v7}, Lp4/s;->G(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lp4/s;->g()I

    .line 55
    .line 56
    .line 57
    move-result v13

    .line 58
    invoke-virtual {v0}, Lp4/s;->g()I

    .line 59
    .line 60
    .line 61
    move-result v15

    .line 62
    const/16 v16, 0x0

    .line 63
    .line 64
    const v3, 0x66726d61

    .line 65
    .line 66
    .line 67
    if-ne v15, v3, :cond_1

    .line 68
    .line 69
    invoke-virtual {v0}, Lp4/s;->g()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    goto :goto_3

    .line 78
    :cond_1
    const v3, 0x7363686d

    .line 79
    .line 80
    .line 81
    if-ne v15, v3, :cond_2

    .line 82
    .line 83
    invoke-virtual {v0, v14}, Lp4/s;->H(I)V

    .line 84
    .line 85
    .line 86
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 87
    .line 88
    invoke-virtual {v0, v14, v3}, Lp4/s;->s(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    goto :goto_3

    .line 93
    :cond_2
    const v3, 0x73636869

    .line 94
    .line 95
    .line 96
    if-ne v15, v3, :cond_3

    .line 97
    .line 98
    move v9, v7

    .line 99
    move v12, v13

    .line 100
    :cond_3
    :goto_3
    add-int/2addr v7, v13

    .line 101
    goto :goto_2

    .line 102
    :cond_4
    const/16 v16, 0x0

    .line 103
    .line 104
    const-string v3, "cenc"

    .line 105
    .line 106
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-nez v3, :cond_6

    .line 111
    .line 112
    const-string v3, "cbc1"

    .line 113
    .line 114
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-nez v3, :cond_6

    .line 119
    .line 120
    const-string v3, "cens"

    .line 121
    .line 122
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-nez v3, :cond_6

    .line 127
    .line 128
    const-string v3, "cbcs"

    .line 129
    .line 130
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    if-eqz v3, :cond_5

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_5
    move-object/from16 v3, v16

    .line 138
    .line 139
    goto/16 :goto_b

    .line 140
    .line 141
    :cond_6
    :goto_4
    if-eqz v10, :cond_7

    .line 142
    .line 143
    const/4 v3, 0x1

    .line 144
    goto :goto_5

    .line 145
    :cond_7
    const/4 v3, 0x0

    .line 146
    :goto_5
    const-string v7, "frma atom is mandatory"

    .line 147
    .line 148
    invoke-static {v7, v3}, Lr5/b;->c(Ljava/lang/String;Z)V

    .line 149
    .line 150
    .line 151
    if-eq v9, v8, :cond_8

    .line 152
    .line 153
    const/4 v3, 0x1

    .line 154
    goto :goto_6

    .line 155
    :cond_8
    const/4 v3, 0x0

    .line 156
    :goto_6
    const-string v7, "schi atom is mandatory"

    .line 157
    .line 158
    invoke-static {v7, v3}, Lr5/b;->c(Ljava/lang/String;Z)V

    .line 159
    .line 160
    .line 161
    add-int/lit8 v3, v9, 0x8

    .line 162
    .line 163
    :goto_7
    sub-int v7, v3, v9

    .line 164
    .line 165
    if-ge v7, v12, :cond_d

    .line 166
    .line 167
    invoke-virtual {v0, v3}, Lp4/s;->G(I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Lp4/s;->g()I

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    invoke-virtual {v0}, Lp4/s;->g()I

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    const v13, 0x74656e63

    .line 179
    .line 180
    .line 181
    if-ne v8, v13, :cond_c

    .line 182
    .line 183
    invoke-virtual {v0}, Lp4/s;->g()I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    invoke-static {v3}, Ll6/e;->c(I)I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    invoke-virtual {v0, v6}, Lp4/s;->H(I)V

    .line 192
    .line 193
    .line 194
    if-nez v3, :cond_9

    .line 195
    .line 196
    invoke-virtual {v0, v6}, Lp4/s;->H(I)V

    .line 197
    .line 198
    .line 199
    const/4 v14, 0x0

    .line 200
    const/4 v15, 0x0

    .line 201
    goto :goto_8

    .line 202
    :cond_9
    invoke-virtual {v0}, Lp4/s;->u()I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    and-int/lit16 v7, v3, 0xf0

    .line 207
    .line 208
    shr-int/2addr v7, v14

    .line 209
    and-int/lit8 v3, v3, 0xf

    .line 210
    .line 211
    move v15, v3

    .line 212
    move v14, v7

    .line 213
    :goto_8
    invoke-virtual {v0}, Lp4/s;->u()I

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    if-ne v3, v6, :cond_a

    .line 218
    .line 219
    move-object v3, v10

    .line 220
    const/4 v10, 0x1

    .line 221
    goto :goto_9

    .line 222
    :cond_a
    move-object v3, v10

    .line 223
    const/4 v10, 0x0

    .line 224
    :goto_9
    invoke-virtual {v0}, Lp4/s;->u()I

    .line 225
    .line 226
    .line 227
    move-result v12

    .line 228
    const/16 v7, 0x10

    .line 229
    .line 230
    new-array v13, v7, [B

    .line 231
    .line 232
    invoke-virtual {v0, v13, v5, v7}, Lp4/s;->e([BII)V

    .line 233
    .line 234
    .line 235
    if-eqz v10, :cond_b

    .line 236
    .line 237
    if-nez v12, :cond_b

    .line 238
    .line 239
    invoke-virtual {v0}, Lp4/s;->u()I

    .line 240
    .line 241
    .line 242
    move-result v7

    .line 243
    new-array v8, v7, [B

    .line 244
    .line 245
    invoke-virtual {v0, v8, v5, v7}, Lp4/s;->e([BII)V

    .line 246
    .line 247
    .line 248
    move-object/from16 v16, v8

    .line 249
    .line 250
    :cond_b
    new-instance v9, Ll6/r;

    .line 251
    .line 252
    move-object v8, v3

    .line 253
    invoke-direct/range {v9 .. v16}, Ll6/r;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 254
    .line 255
    .line 256
    move-object v3, v9

    .line 257
    goto :goto_a

    .line 258
    :cond_c
    move-object v8, v10

    .line 259
    add-int/2addr v3, v7

    .line 260
    goto :goto_7

    .line 261
    :cond_d
    move-object v8, v10

    .line 262
    move-object/from16 v3, v16

    .line 263
    .line 264
    :goto_a
    if-eqz v3, :cond_e

    .line 265
    .line 266
    const/4 v5, 0x1

    .line 267
    :cond_e
    const-string v6, "tenc atom is mandatory"

    .line 268
    .line 269
    invoke-static {v6, v5}, Lr5/b;->c(Ljava/lang/String;Z)V

    .line 270
    .line 271
    .line 272
    sget v5, Lp4/c0;->a:I

    .line 273
    .line 274
    invoke-static {v8, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    :goto_b
    if-eqz v3, :cond_f

    .line 279
    .line 280
    return-object v3

    .line 281
    :cond_f
    add-int/2addr v1, v2

    .line 282
    goto/16 :goto_0

    .line 283
    .line 284
    :cond_10
    const/16 v16, 0x0

    .line 285
    .line 286
    return-object v16
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
.end method

.method public static f(Lp4/s;IILjava/lang/String;Lm4/n;Z)Lce/g;
    .locals 51

    move-object/from16 v0, p0

    move-object/from16 v9, p3

    move-object/from16 v6, p4

    const/16 v10, 0xc

    .line 1
    invoke-virtual {v0, v10}, Lp4/s;->G(I)V

    .line 2
    invoke-virtual {v0}, Lp4/s;->g()I

    move-result v11

    .line 3
    new-instance v7, Lce/g;

    invoke-direct {v7, v11}, Lce/g;-><init>(I)V

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v11, :cond_a0

    .line 4
    iget v2, v0, Lp4/s;->b:I

    .line 5
    invoke-virtual {v0}, Lp4/s;->g()I

    move-result v3

    if-lez v3, :cond_0

    const/4 v4, 0x1

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    .line 6
    :goto_1
    const-string v5, "childAtomSize must be positive"

    invoke-static {v5, v4}, Lr5/b;->c(Ljava/lang/String;Z)V

    .line 7
    invoke-virtual {v0}, Lp4/s;->g()I

    move-result v4

    const v13, 0x61766331

    if-eq v4, v13, :cond_9f

    const v13, 0x61766333

    if-eq v4, v13, :cond_9f

    const v13, 0x656e6376

    if-eq v4, v13, :cond_9f

    const v13, 0x6d317620

    if-eq v4, v13, :cond_9f

    const v13, 0x6d703476

    if-eq v4, v13, :cond_9f

    const v13, 0x68766331

    if-eq v4, v13, :cond_9f

    const v13, 0x68657631

    if-eq v4, v13, :cond_9f

    const v13, 0x73323633

    if-eq v4, v13, :cond_9f

    const v13, 0x48323633

    if-eq v4, v13, :cond_9f

    const v13, 0x68323633

    if-eq v4, v13, :cond_9f

    const v13, 0x76703038

    if-eq v4, v13, :cond_9f

    const v13, 0x76703039

    if-eq v4, v13, :cond_9f

    const v13, 0x61763031

    if-eq v4, v13, :cond_9f

    const v13, 0x64766176

    if-eq v4, v13, :cond_9f

    const v13, 0x64766131

    if-eq v4, v13, :cond_9f

    const v13, 0x64766865

    if-eq v4, v13, :cond_9f

    const v13, 0x64766831

    if-eq v4, v13, :cond_9f

    const v13, 0x61707631

    if-ne v4, v13, :cond_1

    move/from16 v5, p2

    move v1, v4

    move/from16 v22, v11

    const/4 v11, 0x0

    :goto_2
    move/from16 v4, p1

    goto/16 :goto_68

    :cond_1
    const v13, 0x6d703461

    const-wide/16 v16, 0x0

    const v15, 0x61632d34

    const v14, 0x65632d33

    const v10, 0x61632d33

    const v1, 0x656e6361

    const v12, 0x616c6163

    if-eq v4, v13, :cond_c

    if-eq v4, v1, :cond_c

    if-eq v4, v10, :cond_c

    if-eq v4, v14, :cond_c

    if-eq v4, v15, :cond_c

    const v13, 0x6d6c7061

    if-eq v4, v13, :cond_c

    const v13, 0x64747363

    if-eq v4, v13, :cond_c

    const v13, 0x64747365

    if-eq v4, v13, :cond_c

    const v13, 0x64747368

    if-eq v4, v13, :cond_c

    const v13, 0x6474736c

    if-eq v4, v13, :cond_c

    const v13, 0x64747378

    if-eq v4, v13, :cond_c

    const v13, 0x73616d72

    if-eq v4, v13, :cond_c

    const v13, 0x73617762

    if-eq v4, v13, :cond_c

    const v13, 0x6c70636d

    if-eq v4, v13, :cond_c

    const v13, 0x736f7774

    if-eq v4, v13, :cond_c

    const v13, 0x74776f73

    if-eq v4, v13, :cond_c

    const v13, 0x2e6d7032

    if-eq v4, v13, :cond_c

    const v13, 0x2e6d7033

    if-eq v4, v13, :cond_c

    const v13, 0x6d686131

    if-eq v4, v13, :cond_c

    const v13, 0x6d686d31

    if-eq v4, v13, :cond_c

    if-eq v4, v12, :cond_c

    const v13, 0x616c6177

    if-eq v4, v13, :cond_c

    const v13, 0x756c6177

    if-eq v4, v13, :cond_c

    const v13, 0x4f707573

    if-eq v4, v13, :cond_c

    const v13, 0x664c6143

    if-eq v4, v13, :cond_c

    const v13, 0x69616d66

    if-ne v4, v13, :cond_2

    goto/16 :goto_8

    :cond_2
    const v1, 0x63363038

    const v5, 0x73747070

    const v10, 0x77767474

    const v12, 0x74783367

    const v13, 0x54544d4c

    if-eq v4, v13, :cond_6

    if-eq v4, v12, :cond_6

    if-eq v4, v10, :cond_6

    if-eq v4, v5, :cond_6

    if-ne v4, v1, :cond_3

    goto :goto_4

    :cond_3
    const v1, 0x6d657474

    if-ne v4, v1, :cond_5

    add-int/lit8 v5, v2, 0x10

    .line 8
    invoke-virtual {v0, v5}, Lp4/s;->G(I)V

    if-ne v4, v1, :cond_4

    .line 9
    invoke-virtual {v0}, Lp4/s;->p()Ljava/lang/String;

    .line 10
    invoke-virtual {v0}, Lp4/s;->p()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 11
    new-instance v4, Lm4/p;

    invoke-direct {v4}, Lm4/p;-><init>()V

    .line 12
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lm4/p;->a:Ljava/lang/String;

    .line 13
    invoke-static {v1}, Lm4/o0;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v4, Lm4/p;->m:Ljava/lang/String;

    .line 14
    new-instance v1, Lm4/q;

    invoke-direct {v1, v4}, Lm4/q;-><init>(Lm4/p;)V

    .line 15
    iput-object v1, v7, Lce/g;->e:Ljava/lang/Object;

    :cond_4
    :goto_3
    move/from16 v42, v2

    move/from16 v20, v8

    move/from16 v22, v11

    const/4 v11, 0x0

    goto/16 :goto_69

    :cond_5
    const v1, 0x63616d6d

    if-ne v4, v1, :cond_4

    .line 16
    new-instance v1, Lm4/p;

    invoke-direct {v1}, Lm4/p;-><init>()V

    .line 17
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lm4/p;->a:Ljava/lang/String;

    .line 18
    const-string v4, "application/x-camera-motion"

    .line 19
    invoke-static {v4}, Lm4/o0;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lm4/p;->m:Ljava/lang/String;

    .line 20
    new-instance v4, Lm4/q;

    invoke-direct {v4, v1}, Lm4/q;-><init>(Lm4/p;)V

    .line 21
    iput-object v4, v7, Lce/g;->e:Ljava/lang/Object;

    goto :goto_3

    :cond_6
    :goto_4
    add-int/lit8 v14, v2, 0x10

    .line 22
    invoke-virtual {v0, v14}, Lp4/s;->G(I)V

    .line 23
    const-string v14, "application/ttml+xml"

    const-wide v20, 0x7fffffffffffffffL

    if-ne v4, v13, :cond_7

    :goto_5
    move-wide/from16 v4, v20

    :goto_6
    const/4 v1, 0x0

    goto :goto_7

    :cond_7
    if-ne v4, v12, :cond_8

    add-int/lit8 v1, v3, -0x10

    .line 24
    new-array v4, v1, [B

    const/4 v5, 0x0

    .line 25
    invoke-virtual {v0, v4, v5, v1}, Lp4/s;->e([BII)V

    .line 26
    invoke-static {v4}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    move-result-object v14

    .line 27
    const-string v1, "application/x-quicktime-tx3g"

    move-object v4, v14

    move-object v14, v1

    move-object v1, v4

    move-wide/from16 v4, v20

    goto :goto_7

    :cond_8
    if-ne v4, v10, :cond_9

    .line 28
    const-string v14, "application/x-mp4-vtt"

    goto :goto_5

    :cond_9
    if-ne v4, v5, :cond_a

    move-wide/from16 v4, v16

    goto :goto_6

    :cond_a
    if-ne v4, v1, :cond_b

    const/4 v1, 0x1

    .line 29
    iput v1, v7, Lce/g;->c:I

    const-string v14, "application/x-mp4-cea-608"

    goto :goto_5

    .line 30
    :goto_7
    new-instance v10, Lm4/p;

    invoke-direct {v10}, Lm4/p;-><init>()V

    .line 31
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v12

    iput-object v12, v10, Lm4/p;->a:Ljava/lang/String;

    .line 32
    invoke-static {v14}, Lm4/o0;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    iput-object v12, v10, Lm4/p;->m:Ljava/lang/String;

    .line 33
    iput-object v9, v10, Lm4/p;->d:Ljava/lang/String;

    .line 34
    iput-wide v4, v10, Lm4/p;->r:J

    .line 35
    iput-object v1, v10, Lm4/p;->p:Ljava/util/List;

    .line 36
    new-instance v1, Lm4/q;

    invoke-direct {v1, v10}, Lm4/q;-><init>(Lm4/p;)V

    .line 37
    iput-object v1, v7, Lce/g;->e:Ljava/lang/Object;

    goto/16 :goto_3

    .line 38
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_c
    :goto_8
    add-int/lit8 v13, v2, 0x10

    .line 39
    invoke-virtual {v0, v13}, Lp4/s;->G(I)V

    const/4 v13, 0x6

    const/16 v12, 0x8

    if-eqz p5, :cond_d

    .line 40
    invoke-virtual {v0}, Lp4/s;->A()I

    move-result v37

    .line 41
    invoke-virtual {v0, v13}, Lp4/s;->H(I)V

    move/from16 v15, v37

    goto :goto_9

    .line 42
    :cond_d
    invoke-virtual {v0, v12}, Lp4/s;->H(I)V

    const/4 v15, 0x0

    :goto_9
    const/16 v14, 0x10

    const/16 v39, 0x15

    const/high16 v41, 0x10000000

    const/4 v1, 0x4

    const/4 v13, 0x2

    if-eqz v15, :cond_e

    const/4 v10, 0x1

    if-ne v15, v10, :cond_f

    :cond_e
    const/16 v45, 0x4

    goto/16 :goto_f

    :cond_f
    if-ne v15, v13, :cond_1a

    .line 43
    invoke-virtual {v0, v14}, Lp4/s;->H(I)V

    .line 44
    invoke-virtual {v0}, Lp4/s;->o()J

    move-result-wide v44

    invoke-static/range {v44 .. v45}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v44

    .line 45
    invoke-static/range {v44 .. v45}, Ljava/lang/Math;->round(D)J

    move-result-wide v13

    long-to-int v14, v13

    .line 46
    invoke-virtual {v0}, Lp4/s;->y()I

    move-result v13

    .line 47
    invoke-virtual {v0, v1}, Lp4/s;->H(I)V

    .line 48
    invoke-virtual {v0}, Lp4/s;->y()I

    move-result v15

    .line 49
    invoke-virtual {v0}, Lp4/s;->y()I

    move-result v44

    and-int/lit8 v45, v44, 0x1

    if-eqz v45, :cond_10

    const/16 v45, 0x1

    goto :goto_a

    :cond_10
    const/16 v45, 0x0

    :goto_a
    and-int/lit8 v44, v44, 0x2

    if-eqz v44, :cond_11

    const/16 v44, 0x1

    goto :goto_b

    :cond_11
    const/16 v44, 0x0

    :goto_b
    const/16 v10, 0x20

    if-nez v45, :cond_18

    if-ne v15, v12, :cond_12

    const/4 v1, 0x3

    const/16 v45, 0x4

    goto :goto_d

    :cond_12
    const/16 v1, 0x10

    const/16 v45, 0x4

    if-ne v15, v1, :cond_14

    if-eqz v44, :cond_13

    const/high16 v10, 0x10000000

    goto :goto_c

    :cond_13
    const/4 v10, 0x2

    :goto_c
    move v1, v10

    goto :goto_d

    :cond_14
    const/16 v1, 0x18

    if-ne v15, v1, :cond_16

    if-eqz v44, :cond_15

    const/high16 v1, 0x50000000

    goto :goto_d

    :cond_15
    const/16 v1, 0x15

    goto :goto_d

    :cond_16
    if-ne v15, v10, :cond_19

    if-eqz v44, :cond_17

    const/high16 v1, 0x60000000

    goto :goto_d

    :cond_17
    const/16 v1, 0x16

    goto :goto_d

    :cond_18
    const/16 v45, 0x4

    if-ne v15, v10, :cond_19

    const/4 v1, 0x4

    goto :goto_d

    :cond_19
    const/4 v1, -0x1

    .line 50
    :goto_d
    invoke-virtual {v0, v12}, Lp4/s;->H(I)V

    move v15, v14

    const/4 v14, 0x0

    :goto_e
    const v10, 0x69616d66

    goto :goto_10

    :cond_1a
    move/from16 v42, v2

    move/from16 v23, v3

    move/from16 v20, v8

    move/from16 v22, v11

    const/4 v11, 0x0

    goto/16 :goto_67

    .line 51
    :goto_f
    invoke-virtual {v0}, Lp4/s;->A()I

    move-result v1

    const/4 v10, 0x6

    .line 52
    invoke-virtual {v0, v10}, Lp4/s;->H(I)V

    .line 53
    invoke-virtual {v0}, Lp4/s;->v()I

    move-result v13

    .line 54
    iget v10, v0, Lp4/s;->b:I

    add-int/lit8 v10, v10, -0x4

    .line 55
    invoke-virtual {v0, v10}, Lp4/s;->G(I)V

    .line 56
    invoke-virtual {v0}, Lp4/s;->g()I

    move-result v14

    const/4 v10, 0x1

    if-ne v15, v10, :cond_1b

    const/16 v10, 0x10

    .line 57
    invoke-virtual {v0, v10}, Lp4/s;->H(I)V

    :cond_1b
    move v15, v13

    move v13, v1

    const/4 v1, -0x1

    goto :goto_e

    :goto_10
    if-ne v4, v10, :cond_1c

    const/4 v10, -0x1

    const/4 v13, -0x1

    goto :goto_12

    :cond_1c
    const v10, 0x73616d72

    if-ne v4, v10, :cond_1d

    const/16 v10, 0x1f40

    :goto_11
    const/4 v13, 0x1

    goto :goto_12

    :cond_1d
    const v10, 0x73617762

    if-ne v4, v10, :cond_1e

    const/16 v10, 0x3e80

    goto :goto_11

    :cond_1e
    move v10, v15

    .line 58
    :goto_12
    iget v15, v0, Lp4/s;->b:I

    const v12, 0x656e6361

    if-ne v4, v12, :cond_21

    .line 59
    invoke-static {v0, v2, v3}, Ll6/e;->e(Lp4/s;II)Landroid/util/Pair;

    move-result-object v12

    if-eqz v12, :cond_20

    .line 60
    iget-object v4, v12, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-nez v6, :cond_1f

    move/from16 v42, v2

    const/16 v47, 0x0

    goto :goto_13

    :cond_1f
    move/from16 v42, v2

    .line 61
    iget-object v2, v12, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ll6/r;

    iget-object v2, v2, Ll6/r;->b:Ljava/lang/String;

    invoke-virtual {v6, v2}, Lm4/n;->a(Ljava/lang/String;)Lm4/n;

    move-result-object v2

    move-object/from16 v47, v2

    .line 62
    :goto_13
    iget-object v2, v7, Lce/g;->d:Ljava/lang/Object;

    check-cast v2, [Ll6/r;

    iget-object v12, v12, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v12, Ll6/r;

    aput-object v12, v2, v8

    move-object/from16 v2, v47

    goto :goto_14

    :cond_20
    move/from16 v42, v2

    move-object v2, v6

    .line 63
    :goto_14
    invoke-virtual {v0, v15}, Lp4/s;->G(I)V

    goto :goto_15

    :cond_21
    move/from16 v42, v2

    move-object v2, v6

    .line 64
    :goto_15
    const-string v12, "audio/mhm1"

    const-string v47, "audio/ac4"

    const-string v48, "audio/eac3"

    const-string v49, "audio/ac3"

    const v6, 0x61632d33

    if-ne v4, v6, :cond_22

    move-object/from16 v4, v49

    goto/16 :goto_19

    :cond_22
    const v6, 0x65632d33

    if-ne v4, v6, :cond_23

    move-object/from16 v4, v48

    goto/16 :goto_19

    :cond_23
    const v6, 0x61632d34

    if-ne v4, v6, :cond_24

    move-object/from16 v4, v47

    goto/16 :goto_19

    :cond_24
    const v6, 0x64747363

    if-ne v4, v6, :cond_25

    .line 65
    const-string v4, "audio/vnd.dts"

    goto/16 :goto_19

    :cond_25
    const v6, 0x64747368

    if-eq v4, v6, :cond_3a

    const v6, 0x6474736c

    if-ne v4, v6, :cond_26

    goto/16 :goto_18

    :cond_26
    const v6, 0x64747365

    if-ne v4, v6, :cond_27

    .line 66
    const-string v4, "audio/vnd.dts.hd;profile=lbr"

    goto/16 :goto_19

    :cond_27
    const v6, 0x64747378

    if-ne v4, v6, :cond_28

    .line 67
    const-string v4, "audio/vnd.dts.uhd;profile=p2"

    goto/16 :goto_19

    :cond_28
    const v6, 0x73616d72

    if-ne v4, v6, :cond_29

    .line 68
    const-string v4, "audio/3gpp"

    goto/16 :goto_19

    :cond_29
    const v6, 0x73617762

    if-ne v4, v6, :cond_2a

    .line 69
    const-string v4, "audio/amr-wb"

    goto/16 :goto_19

    .line 70
    :cond_2a
    const-string v6, "audio/raw"

    move-object/from16 v32, v6

    const v6, 0x736f7774

    if-ne v4, v6, :cond_2b

    :goto_16
    move-object/from16 v4, v32

    const/4 v1, 0x2

    goto/16 :goto_19

    :cond_2b
    const v6, 0x74776f73

    if-ne v4, v6, :cond_2c

    move-object/from16 v4, v32

    const/high16 v1, 0x10000000

    goto/16 :goto_19

    :cond_2c
    const v6, 0x6c70636d

    if-ne v4, v6, :cond_2e

    const/4 v6, -0x1

    if-ne v1, v6, :cond_2d

    goto :goto_16

    :cond_2d
    move-object/from16 v4, v32

    goto/16 :goto_19

    :cond_2e
    const v6, 0x2e6d7032

    if-eq v4, v6, :cond_39

    const v6, 0x2e6d7033

    if-ne v4, v6, :cond_2f

    goto :goto_17

    :cond_2f
    const v6, 0x6d686131

    if-ne v4, v6, :cond_30

    .line 71
    const-string v4, "audio/mha1"

    goto :goto_19

    :cond_30
    const v6, 0x6d686d31

    if-ne v4, v6, :cond_31

    move-object v4, v12

    goto :goto_19

    :cond_31
    const v6, 0x616c6163

    if-ne v4, v6, :cond_32

    .line 72
    const-string v4, "audio/alac"

    goto :goto_19

    :cond_32
    const v6, 0x616c6177

    if-ne v4, v6, :cond_33

    .line 73
    const-string v4, "audio/g711-alaw"

    goto :goto_19

    :cond_33
    const v6, 0x756c6177

    if-ne v4, v6, :cond_34

    .line 74
    const-string v4, "audio/g711-mlaw"

    goto :goto_19

    :cond_34
    const v6, 0x4f707573

    if-ne v4, v6, :cond_35

    .line 75
    const-string v4, "audio/opus"

    goto :goto_19

    :cond_35
    const v6, 0x664c6143

    if-ne v4, v6, :cond_36

    .line 76
    const-string v4, "audio/flac"

    goto :goto_19

    :cond_36
    const v6, 0x6d6c7061

    if-ne v4, v6, :cond_37

    .line 77
    const-string v4, "audio/true-hd"

    goto :goto_19

    :cond_37
    const v6, 0x69616d66

    if-ne v4, v6, :cond_38

    .line 78
    const-string v4, "audio/iamf"

    goto :goto_19

    :cond_38
    const/4 v4, 0x0

    goto :goto_19

    .line 79
    :cond_39
    :goto_17
    const-string v4, "audio/mpeg"

    goto :goto_19

    .line 80
    :cond_3a
    :goto_18
    const-string v4, "audio/vnd.dts.hd"

    :goto_19
    move/from16 v20, v8

    move v6, v10

    move/from16 v22, v11

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/16 v21, 0x0

    :goto_1a
    sub-int v11, v15, v42

    if-ge v11, v3, :cond_9c

    .line 81
    invoke-virtual {v0, v15}, Lp4/s;->G(I)V

    .line 82
    invoke-virtual {v0}, Lp4/s;->g()I

    move-result v11

    move/from16 v23, v3

    if-lez v11, :cond_3b

    const/4 v3, 0x1

    goto :goto_1b

    :cond_3b
    const/4 v3, 0x0

    .line 83
    :goto_1b
    invoke-static {v5, v3}, Lr5/b;->c(Ljava/lang/String;Z)V

    .line 84
    invoke-virtual {v0}, Lp4/s;->g()I

    move-result v3

    move-object/from16 v24, v10

    const v10, 0x6d686143

    if-ne v3, v10, :cond_3f

    add-int/lit8 v3, v15, 0x8

    .line 85
    invoke-virtual {v0, v3}, Lp4/s;->G(I)V

    const/4 v10, 0x1

    .line 86
    invoke-virtual {v0, v10}, Lp4/s;->H(I)V

    .line 87
    invoke-virtual {v0}, Lp4/s;->u()I

    move-result v3

    .line 88
    invoke-virtual {v0, v10}, Lp4/s;->H(I)V

    .line 89
    invoke-static {v4, v12}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_3c

    .line 90
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 v18, v3

    new-array v3, v10, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object v18, v3, v10

    const/16 v19, 0x0

    const-string v10, "mhm1.%02X"

    invoke-static {v10, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    :goto_1c
    move-object v10, v3

    goto :goto_1d

    :cond_3c
    const/16 v19, 0x0

    .line 91
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 v21, v3

    const/4 v10, 0x1

    new-array v3, v10, [Ljava/lang/Object;

    aput-object v21, v3, v19

    const-string v10, "mha1.%02X"

    invoke-static {v10, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_1c

    .line 92
    :goto_1d
    invoke-virtual {v0}, Lp4/s;->A()I

    move-result v3

    move-object/from16 v25, v4

    .line 93
    new-array v4, v3, [B

    move-object/from16 v21, v10

    const/4 v10, 0x0

    .line 94
    invoke-virtual {v0, v4, v10, v3}, Lp4/s;->e([BII)V

    if-nez v8, :cond_3d

    .line 95
    invoke-static {v4}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    move-result-object v3

    :goto_1e
    move-object v8, v3

    goto :goto_1f

    .line 96
    :cond_3d
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    invoke-static {v4, v3}, Lya/i0;->v(Ljava/lang/Object;Ljava/lang/Object;)Lya/a1;

    move-result-object v3

    goto :goto_1e

    :cond_3e
    :goto_1f
    move/from16 v31, v1

    move-object/from16 v32, v5

    move/from16 v36, v11

    move-object/from16 v28, v12

    move-object/from16 v10, v24

    move-object/from16 v4, v25

    :goto_20
    const/4 v1, 0x1

    const/4 v11, 0x0

    :goto_21
    const/16 v43, 0x3

    const/16 v46, 0x2

    goto/16 :goto_66

    :cond_3f
    move-object/from16 v25, v4

    const v4, 0x6d686150

    if-ne v3, v4, :cond_41

    add-int/lit8 v3, v15, 0x8

    .line 97
    invoke-virtual {v0, v3}, Lp4/s;->G(I)V

    .line 98
    invoke-virtual {v0}, Lp4/s;->u()I

    move-result v3

    if-lez v3, :cond_3e

    .line 99
    new-array v4, v3, [B

    const/4 v10, 0x0

    .line 100
    invoke-virtual {v0, v4, v10, v3}, Lp4/s;->e([BII)V

    if-nez v8, :cond_40

    .line 101
    invoke-static {v4}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    move-result-object v8

    goto :goto_1f

    .line 102
    :cond_40
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    invoke-static {v3, v4}, Lya/i0;->v(Ljava/lang/Object;Ljava/lang/Object;)Lya/a1;

    move-result-object v8

    goto :goto_1f

    :cond_41
    const v10, 0x65736473

    if-eq v3, v10, :cond_8f

    if-eqz p5, :cond_42

    const v10, 0x77617665

    if-ne v3, v10, :cond_42

    move/from16 v31, v1

    move-object/from16 v32, v5

    move v4, v6

    move-object/from16 v29, v8

    move/from16 v36, v11

    move-object/from16 v28, v12

    move/from16 v38, v15

    move-object/from16 v35, v21

    const v1, 0x616c6163

    const v5, 0x65736473

    const/16 v6, 0x8

    const/16 v10, 0xc

    const/16 v43, 0x3

    const/16 v46, 0x2

    goto/16 :goto_56

    :cond_42
    const v10, 0x64616333

    if-ne v3, v10, :cond_44

    add-int/lit8 v3, v15, 0x8

    .line 103
    invoke-virtual {v0, v3}, Lp4/s;->G(I)V

    .line 104
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    .line 105
    new-instance v10, Lp4/r;

    invoke-direct {v10}, Lp4/r;-><init>()V

    .line 106
    invoke-virtual {v10, v0}, Lp4/r;->o(Lp4/s;)V

    const/4 v4, 0x2

    .line 107
    invoke-virtual {v10, v4}, Lp4/r;->i(I)I

    move-result v27

    .line 108
    sget-object v4, Lr5/b;->d:[I

    aget v4, v4, v27

    move-object/from16 v28, v12

    const/16 v12, 0x8

    .line 109
    invoke-virtual {v10, v12}, Lp4/r;->t(I)V

    .line 110
    sget-object v12, Lr5/b;->f:[I

    move-object/from16 v27, v12

    const/4 v12, 0x3

    invoke-virtual {v10, v12}, Lp4/r;->i(I)I

    move-result v29

    aget v12, v27, v29

    move/from16 v27, v12

    const/4 v12, 0x1

    .line 111
    invoke-virtual {v10, v12}, Lp4/r;->i(I)I

    move-result v29

    if-eqz v29, :cond_43

    add-int/lit8 v12, v27, 0x1

    :goto_22
    move-object/from16 v29, v8

    const/4 v8, 0x5

    goto :goto_23

    :cond_43
    move/from16 v12, v27

    goto :goto_22

    .line 112
    :goto_23
    invoke-virtual {v10, v8}, Lp4/r;->i(I)I

    move-result v8

    .line 113
    sget-object v26, Lr5/b;->g:[I

    aget v8, v26, v8

    mul-int/lit16 v8, v8, 0x3e8

    .line 114
    invoke-virtual {v10}, Lp4/r;->c()V

    .line 115
    invoke-virtual {v10}, Lp4/r;->f()I

    move-result v10

    invoke-virtual {v0, v10}, Lp4/s;->G(I)V

    .line 116
    new-instance v10, Lm4/p;

    invoke-direct {v10}, Lm4/p;-><init>()V

    .line 117
    iput-object v3, v10, Lm4/p;->a:Ljava/lang/String;

    .line 118
    invoke-static/range {v49 .. v49}, Lm4/o0;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v10, Lm4/p;->m:Ljava/lang/String;

    .line 119
    iput v12, v10, Lm4/p;->C:I

    .line 120
    iput v4, v10, Lm4/p;->D:I

    .line 121
    iput-object v2, v10, Lm4/p;->q:Lm4/n;

    .line 122
    iput-object v9, v10, Lm4/p;->d:Ljava/lang/String;

    .line 123
    iput v8, v10, Lm4/p;->h:I

    .line 124
    iput v8, v10, Lm4/p;->i:I

    .line 125
    new-instance v3, Lm4/q;

    invoke-direct {v3, v10}, Lm4/q;-><init>(Lm4/p;)V

    .line 126
    iput-object v3, v7, Lce/g;->e:Ljava/lang/Object;

    move/from16 v31, v1

    move-object/from16 v32, v5

    :goto_24
    move v4, v6

    move/from16 v36, v11

    move/from16 v38, v15

    move-object/from16 v35, v21

    const v1, 0x616c6163

    const/16 v6, 0x8

    const/16 v10, 0xc

    :goto_25
    const/16 v43, 0x3

    const/16 v46, 0x2

    goto/16 :goto_55

    :cond_44
    move-object/from16 v29, v8

    move-object/from16 v28, v12

    const v4, 0x64656333

    const/16 v8, 0xa

    const/16 v10, 0xd

    if-ne v3, v4, :cond_49

    add-int/lit8 v3, v15, 0x8

    .line 127
    invoke-virtual {v0, v3}, Lp4/s;->G(I)V

    .line 128
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    .line 129
    new-instance v4, Lp4/r;

    invoke-direct {v4}, Lp4/r;-><init>()V

    .line 130
    invoke-virtual {v4, v0}, Lp4/r;->o(Lp4/s;)V

    .line 131
    invoke-virtual {v4, v10}, Lp4/r;->i(I)I

    move-result v10

    mul-int/lit16 v10, v10, 0x3e8

    const/4 v12, 0x3

    .line 132
    invoke-virtual {v4, v12}, Lp4/r;->t(I)V

    const/4 v12, 0x2

    .line 133
    invoke-virtual {v4, v12}, Lp4/r;->i(I)I

    move-result v26

    .line 134
    sget-object v12, Lr5/b;->d:[I

    aget v12, v12, v26

    .line 135
    invoke-virtual {v4, v8}, Lp4/r;->t(I)V

    .line 136
    sget-object v8, Lr5/b;->f:[I

    move-object/from16 v26, v8

    const/4 v8, 0x3

    invoke-virtual {v4, v8}, Lp4/r;->i(I)I

    move-result v27

    aget v26, v26, v27

    const/4 v8, 0x1

    .line 137
    invoke-virtual {v4, v8}, Lp4/r;->i(I)I

    move-result v18

    if-eqz v18, :cond_45

    add-int/lit8 v26, v26, 0x1

    :cond_45
    const/4 v8, 0x3

    .line 138
    invoke-virtual {v4, v8}, Lp4/r;->t(I)V

    const/4 v8, 0x4

    .line 139
    invoke-virtual {v4, v8}, Lp4/r;->i(I)I

    move-result v27

    const/4 v8, 0x1

    .line 140
    invoke-virtual {v4, v8}, Lp4/r;->t(I)V

    move/from16 v31, v1

    if-lez v27, :cond_47

    const/4 v1, 0x6

    .line 141
    invoke-virtual {v4, v1}, Lp4/r;->t(I)V

    .line 142
    invoke-virtual {v4, v8}, Lp4/r;->i(I)I

    move-result v1

    if-eqz v1, :cond_46

    add-int/lit8 v26, v26, 0x2

    .line 143
    :cond_46
    invoke-virtual {v4, v8}, Lp4/r;->t(I)V

    :cond_47
    move/from16 v1, v26

    .line 144
    invoke-virtual {v4}, Lp4/r;->b()I

    move-result v8

    move-object/from16 v32, v5

    const/4 v5, 0x7

    if-le v8, v5, :cond_48

    .line 145
    invoke-virtual {v4, v5}, Lp4/r;->t(I)V

    const/4 v8, 0x1

    .line 146
    invoke-virtual {v4, v8}, Lp4/r;->i(I)I

    move-result v5

    if-eqz v5, :cond_48

    .line 147
    const-string v5, "audio/eac3-joc"

    goto :goto_26

    :cond_48
    move-object/from16 v5, v48

    .line 148
    :goto_26
    invoke-virtual {v4}, Lp4/r;->c()V

    .line 149
    invoke-virtual {v4}, Lp4/r;->f()I

    move-result v4

    invoke-virtual {v0, v4}, Lp4/s;->G(I)V

    .line 150
    new-instance v4, Lm4/p;

    invoke-direct {v4}, Lm4/p;-><init>()V

    .line 151
    iput-object v3, v4, Lm4/p;->a:Ljava/lang/String;

    .line 152
    invoke-static {v5}, Lm4/o0;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v4, Lm4/p;->m:Ljava/lang/String;

    .line 153
    iput v1, v4, Lm4/p;->C:I

    .line 154
    iput v12, v4, Lm4/p;->D:I

    .line 155
    iput-object v2, v4, Lm4/p;->q:Lm4/n;

    .line 156
    iput-object v9, v4, Lm4/p;->d:Ljava/lang/String;

    .line 157
    iput v10, v4, Lm4/p;->i:I

    .line 158
    new-instance v1, Lm4/q;

    invoke-direct {v1, v4}, Lm4/q;-><init>(Lm4/p;)V

    .line 159
    iput-object v1, v7, Lce/g;->e:Ljava/lang/Object;

    goto/16 :goto_24

    :cond_49
    move/from16 v31, v1

    move-object/from16 v32, v5

    const v1, 0x64616334

    const/16 v4, 0x9

    if-ne v3, v1, :cond_83

    add-int/lit8 v1, v15, 0x8

    .line 160
    invoke-virtual {v0, v1}, Lp4/s;->G(I)V

    .line 161
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    .line 162
    new-instance v3, Lp4/r;

    invoke-direct {v3}, Lp4/r;-><init>()V

    .line 163
    invoke-virtual {v3, v0}, Lp4/r;->o(Lp4/s;)V

    .line 164
    invoke-virtual {v3}, Lp4/r;->b()I

    move-result v5

    const/4 v12, 0x3

    .line 165
    invoke-virtual {v3, v12}, Lp4/r;->i(I)I

    move-result v10

    const/4 v12, 0x1

    if-gt v10, v12, :cond_82

    const/4 v8, 0x7

    .line 166
    invoke-virtual {v3, v8}, Lp4/r;->i(I)I

    move-result v12

    .line 167
    invoke-virtual {v3}, Lp4/r;->h()Z

    move-result v8

    if-eqz v8, :cond_4a

    const v8, 0xbb80

    :goto_27
    move/from16 v34, v5

    const/4 v5, 0x4

    goto :goto_28

    :cond_4a
    const v8, 0xac44

    goto :goto_27

    .line 168
    :goto_28
    invoke-virtual {v3, v5}, Lp4/r;->t(I)V

    .line 169
    invoke-virtual {v3, v4}, Lp4/r;->i(I)I

    move-result v4

    const/4 v5, 0x1

    if-le v12, v5, :cond_4b

    if-eqz v10, :cond_4c

    .line 170
    invoke-virtual {v3}, Lp4/r;->h()Z

    move-result v5

    if-eqz v5, :cond_4b

    const/16 v5, 0x10

    .line 171
    invoke-virtual {v3, v5}, Lp4/r;->t(I)V

    move-object/from16 v5, v21

    .line 172
    invoke-virtual {v3}, Lp4/r;->h()Z

    move-result v12

    if-eqz v12, :cond_4d

    const/16 v12, 0x80

    .line 173
    invoke-virtual {v3, v12}, Lp4/r;->t(I)V

    goto :goto_29

    :cond_4b
    move-object/from16 v5, v21

    goto :goto_29

    .line 174
    :cond_4c
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid AC-4 DSI version: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm4/p0;->c(Ljava/lang/String;)Lm4/p0;

    move-result-object v0

    throw v0

    :cond_4d
    :goto_29
    const/4 v12, 0x1

    if-ne v10, v12, :cond_4f

    .line 175
    invoke-virtual {v3}, Lp4/r;->b()I

    move-result v12

    move-object/from16 v35, v5

    const/16 v5, 0x42

    if-lt v12, v5, :cond_4e

    .line 176
    invoke-virtual {v3, v5}, Lp4/r;->t(I)V

    .line 177
    invoke-virtual {v3}, Lp4/r;->c()V

    goto :goto_2a

    .line 178
    :cond_4e
    const-string v0, "Invalid AC-4 DSI bitrate."

    invoke-static {v0}, Lm4/p0;->c(Ljava/lang/String;)Lm4/p0;

    move-result-object v0

    throw v0

    :cond_4f
    move-object/from16 v35, v5

    .line 179
    :goto_2a
    new-instance v5, Lr5/c;

    .line 180
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    const/4 v12, 0x1

    .line 181
    iput-boolean v12, v5, Lr5/c;->d:Z

    const/4 v12, -0x1

    .line 182
    iput v12, v5, Lr5/c;->a:I

    .line 183
    iput v12, v5, Lr5/c;->b:I

    const/4 v12, 0x1

    .line 184
    iput-boolean v12, v5, Lr5/c;->e:Z

    const/4 v12, 0x2

    .line 185
    iput v12, v5, Lr5/c;->c:I

    const/4 v12, 0x0

    .line 186
    iput v12, v5, Lr5/c;->f:I

    move/from16 v36, v11

    const/4 v12, 0x0

    :goto_2b
    if-ge v12, v4, :cond_76

    if-nez v10, :cond_50

    .line 187
    invoke-virtual {v3}, Lp4/r;->h()Z

    move-result v4

    const/4 v11, 0x5

    .line 188
    invoke-virtual {v3, v11}, Lp4/r;->i(I)I

    move-result v27

    .line 189
    invoke-virtual {v3, v11}, Lp4/r;->i(I)I

    move-result v37

    move/from16 v38, v15

    move/from16 v15, v37

    const/4 v11, 0x0

    const/16 v40, 0x0

    move/from16 v37, v4

    move/from16 v4, v27

    const/16 v27, 0x0

    :goto_2c
    move/from16 v41, v6

    goto :goto_30

    :cond_50
    move/from16 v37, v4

    const/16 v11, 0x8

    .line 190
    invoke-virtual {v3, v11}, Lp4/r;->i(I)I

    move-result v4

    move/from16 v38, v15

    .line 191
    invoke-virtual {v3, v11}, Lp4/r;->i(I)I

    move-result v15

    const/16 v11, 0xff

    if-ne v15, v11, :cond_51

    const/16 v11, 0x10

    .line 192
    invoke-virtual {v3, v11}, Lp4/r;->i(I)I

    move-result v40

    add-int v40, v40, v15

    :goto_2d
    const/4 v11, 0x2

    goto :goto_2e

    :cond_51
    move/from16 v40, v15

    goto :goto_2d

    :goto_2e
    if-le v4, v11, :cond_52

    mul-int/lit8 v4, v40, 0x8

    .line 193
    invoke-virtual {v3, v4}, Lp4/r;->t(I)V

    add-int/lit8 v12, v12, 0x1

    move/from16 v4, v37

    move/from16 v15, v38

    goto :goto_2b

    .line 194
    :cond_52
    invoke-virtual {v3}, Lp4/r;->b()I

    move-result v11

    sub-int v11, v34, v11

    const/16 v44, 0x8

    div-int/lit8 v11, v11, 0x8

    move/from16 v37, v4

    const/4 v15, 0x5

    .line 195
    invoke-virtual {v3, v15}, Lp4/r;->i(I)I

    move-result v4

    const/16 v15, 0x1f

    if-ne v4, v15, :cond_53

    const/4 v15, 0x1

    goto :goto_2f

    :cond_53
    const/4 v15, 0x0

    :goto_2f
    move/from16 v27, v11

    move/from16 v11, v40

    move/from16 v40, v15

    move/from16 v15, v37

    const/16 v37, 0x0

    goto :goto_2c

    :goto_30
    if-nez v37, :cond_54

    if-nez v40, :cond_54

    const/4 v6, 0x6

    if-ne v4, v6, :cond_54

    move/from16 v50, v13

    move/from16 v33, v15

    const/4 v4, 0x1

    goto/16 :goto_44

    :cond_54
    move/from16 v50, v13

    const/4 v6, 0x3

    .line 196
    invoke-virtual {v3, v6}, Lp4/r;->i(I)I

    move-result v13

    iput v13, v5, Lr5/c;->f:I

    .line 197
    invoke-virtual {v3}, Lp4/r;->h()Z

    move-result v6

    if-eqz v6, :cond_55

    const/4 v6, 0x5

    .line 198
    invoke-virtual {v3, v6}, Lp4/r;->t(I)V

    :cond_55
    const/4 v6, 0x2

    .line 199
    invoke-virtual {v3, v6}, Lp4/r;->t(I)V

    const/4 v13, 0x1

    if-ne v10, v13, :cond_56

    if-eq v15, v13, :cond_57

    if-ne v15, v6, :cond_56

    goto :goto_32

    :cond_56
    :goto_31
    const/4 v6, 0x5

    goto :goto_33

    .line 200
    :cond_57
    :goto_32
    invoke-virtual {v3, v6}, Lp4/r;->t(I)V

    goto :goto_31

    .line 201
    :goto_33
    invoke-virtual {v3, v6}, Lp4/r;->t(I)V

    const/16 v6, 0xa

    .line 202
    invoke-virtual {v3, v6}, Lp4/r;->t(I)V

    if-ne v10, v13, :cond_5e

    if-lez v15, :cond_58

    .line 203
    invoke-virtual {v3}, Lp4/r;->h()Z

    move-result v6

    iput-boolean v6, v5, Lr5/c;->d:Z

    .line 204
    :cond_58
    iget-boolean v6, v5, Lr5/c;->d:Z

    if-eqz v6, :cond_5d

    if-eq v15, v13, :cond_59

    const/4 v6, 0x2

    if-ne v15, v6, :cond_5a

    :cond_59
    const/4 v6, 0x5

    goto :goto_35

    :cond_5a
    :goto_34
    const/16 v13, 0x18

    goto :goto_36

    .line 205
    :goto_35
    invoke-virtual {v3, v6}, Lp4/r;->i(I)I

    move-result v13

    if-ltz v13, :cond_5b

    const/16 v6, 0xf

    if-gt v13, v6, :cond_5b

    .line 206
    iput v13, v5, Lr5/c;->a:I

    :cond_5b
    const/16 v6, 0xb

    if-lt v13, v6, :cond_5c

    const/16 v6, 0xe

    if-gt v13, v6, :cond_5c

    .line 207
    invoke-virtual {v3}, Lp4/r;->h()Z

    move-result v6

    iput-boolean v6, v5, Lr5/c;->e:Z

    const/4 v6, 0x2

    .line 208
    invoke-virtual {v3, v6}, Lp4/r;->i(I)I

    move-result v13

    iput v13, v5, Lr5/c;->c:I

    goto :goto_34

    :cond_5c
    const/4 v6, 0x2

    goto :goto_34

    .line 209
    :goto_36
    invoke-virtual {v3, v13}, Lp4/r;->t(I)V

    :goto_37
    const/4 v13, 0x1

    goto :goto_38

    :cond_5d
    const/4 v6, 0x2

    goto :goto_37

    :goto_38
    if-eq v15, v13, :cond_5f

    if-ne v15, v6, :cond_5e

    goto :goto_39

    :cond_5e
    move/from16 v33, v15

    goto :goto_3b

    .line 210
    :cond_5f
    :goto_39
    invoke-virtual {v3}, Lp4/r;->h()Z

    move-result v13

    if-eqz v13, :cond_60

    .line 211
    invoke-virtual {v3}, Lp4/r;->h()Z

    move-result v13

    if-eqz v13, :cond_60

    .line 212
    invoke-virtual {v3, v6}, Lp4/r;->t(I)V

    .line 213
    :cond_60
    invoke-virtual {v3}, Lp4/r;->h()Z

    move-result v6

    if-eqz v6, :cond_5e

    .line 214
    invoke-virtual {v3}, Lp4/r;->s()V

    const/16 v6, 0x8

    .line 215
    invoke-virtual {v3, v6}, Lp4/r;->i(I)I

    move-result v13

    move/from16 v33, v15

    const/4 v15, 0x0

    :goto_3a
    if-ge v15, v13, :cond_61

    .line 216
    invoke-virtual {v3, v6}, Lp4/r;->t(I)V

    add-int/lit8 v15, v15, 0x1

    const/16 v6, 0x8

    goto :goto_3a

    :cond_61
    :goto_3b
    if-nez v37, :cond_69

    if-eqz v40, :cond_62

    goto/16 :goto_42

    .line 217
    :cond_62
    invoke-virtual {v3}, Lp4/r;->s()V

    if-eqz v4, :cond_67

    const/4 v13, 0x1

    if-eq v4, v13, :cond_67

    const/4 v6, 0x2

    if-eq v4, v6, :cond_67

    const/4 v6, 0x3

    if-eq v4, v6, :cond_65

    const/4 v6, 0x4

    if-eq v4, v6, :cond_65

    const/4 v6, 0x5

    if-eq v4, v6, :cond_63

    const/4 v4, 0x7

    .line 218
    invoke-virtual {v3, v4}, Lp4/r;->i(I)I

    move-result v6

    const/4 v4, 0x0

    :goto_3c
    if-ge v4, v6, :cond_6b

    const/16 v13, 0x8

    .line 219
    invoke-virtual {v3, v13}, Lp4/r;->t(I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_3c

    :cond_63
    if-nez v33, :cond_64

    .line 220
    invoke-static {v3, v5}, Lr5/b;->n(Lp4/r;Lr5/c;)V

    goto :goto_43

    :cond_64
    const/4 v6, 0x3

    .line 221
    invoke-virtual {v3, v6}, Lp4/r;->i(I)I

    move-result v4

    const/4 v6, 0x0

    :goto_3d
    const/16 v46, 0x2

    add-int/lit8 v13, v4, 0x2

    if-ge v6, v13, :cond_6b

    .line 222
    invoke-static {v3, v5}, Lr5/b;->o(Lp4/r;Lr5/c;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_3d

    :cond_65
    if-nez v33, :cond_66

    const/4 v4, 0x0

    const/4 v6, 0x3

    :goto_3e
    if-ge v4, v6, :cond_6b

    .line 223
    invoke-static {v3, v5}, Lr5/b;->n(Lp4/r;Lr5/c;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_3e

    :cond_66
    const/4 v4, 0x0

    :goto_3f
    const/4 v6, 0x3

    if-ge v4, v6, :cond_6b

    .line 224
    invoke-static {v3, v5}, Lr5/b;->o(Lp4/r;Lr5/c;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_3f

    :cond_67
    if-nez v33, :cond_68

    const/4 v4, 0x0

    const/4 v6, 0x2

    :goto_40
    if-ge v4, v6, :cond_6b

    .line 225
    invoke-static {v3, v5}, Lr5/b;->n(Lp4/r;Lr5/c;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_40

    :cond_68
    const/4 v4, 0x0

    :goto_41
    const/4 v6, 0x2

    if-ge v4, v6, :cond_6b

    .line 226
    invoke-static {v3, v5}, Lr5/b;->o(Lp4/r;Lr5/c;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_41

    :cond_69
    :goto_42
    if-nez v33, :cond_6a

    .line 227
    invoke-static {v3, v5}, Lr5/b;->n(Lp4/r;Lr5/c;)V

    goto :goto_43

    .line 228
    :cond_6a
    invoke-static {v3, v5}, Lr5/b;->o(Lp4/r;Lr5/c;)V

    .line 229
    :cond_6b
    :goto_43
    invoke-virtual {v3}, Lp4/r;->s()V

    .line 230
    invoke-virtual {v3}, Lp4/r;->h()Z

    move-result v4

    :goto_44
    if-eqz v4, :cond_6c

    const/4 v4, 0x7

    .line 231
    invoke-virtual {v3, v4}, Lp4/r;->i(I)I

    move-result v6

    const/4 v13, 0x0

    :goto_45
    if-ge v13, v6, :cond_6d

    const/16 v15, 0xf

    .line 232
    invoke-virtual {v3, v15}, Lp4/r;->t(I)V

    add-int/lit8 v13, v13, 0x1

    goto :goto_45

    :cond_6c
    const/4 v4, 0x7

    :cond_6d
    if-lez v33, :cond_72

    .line 233
    invoke-virtual {v3}, Lp4/r;->h()Z

    move-result v6

    if-eqz v6, :cond_70

    .line 234
    invoke-virtual {v3}, Lp4/r;->b()I

    move-result v6

    const/16 v13, 0x42

    if-ge v6, v13, :cond_6e

    const/4 v6, 0x0

    goto :goto_46

    .line 235
    :cond_6e
    invoke-virtual {v3, v13}, Lp4/r;->t(I)V

    const/4 v6, 0x1

    :goto_46
    if-eqz v6, :cond_6f

    goto :goto_47

    .line 236
    :cond_6f
    const-string v0, "Can\'t parse bitrate DSI."

    invoke-static {v0}, Lm4/p0;->c(Ljava/lang/String;)Lm4/p0;

    move-result-object v0

    throw v0

    .line 237
    :cond_70
    :goto_47
    invoke-virtual {v3}, Lp4/r;->h()Z

    move-result v6

    if-eqz v6, :cond_72

    .line 238
    invoke-virtual {v3}, Lp4/r;->c()V

    const/16 v6, 0x10

    .line 239
    invoke-virtual {v3, v6}, Lp4/r;->i(I)I

    move-result v13

    .line 240
    invoke-virtual {v3, v13}, Lp4/r;->u(I)V

    const/4 v15, 0x5

    .line 241
    invoke-virtual {v3, v15}, Lp4/r;->i(I)I

    move-result v13

    const/4 v4, 0x0

    :goto_48
    if-ge v4, v13, :cond_71

    const/4 v6, 0x3

    .line 242
    invoke-virtual {v3, v6}, Lp4/r;->t(I)V

    const/16 v6, 0x8

    .line 243
    invoke-virtual {v3, v6}, Lp4/r;->t(I)V

    add-int/lit8 v4, v4, 0x1

    const/16 v6, 0x10

    goto :goto_48

    :cond_71
    const/16 v6, 0x8

    goto :goto_49

    :cond_72
    const/16 v6, 0x8

    const/4 v15, 0x5

    .line 244
    :goto_49
    invoke-virtual {v3}, Lp4/r;->c()V

    const/4 v13, 0x1

    if-ne v10, v13, :cond_74

    .line 245
    invoke-virtual {v3}, Lp4/r;->b()I

    move-result v4

    sub-int v4, v34, v4

    div-int/2addr v4, v6

    sub-int v4, v4, v27

    if-lt v11, v4, :cond_73

    sub-int/2addr v11, v4

    .line 246
    invoke-virtual {v3, v11}, Lp4/r;->u(I)V

    goto :goto_4a

    .line 247
    :cond_73
    const-string v0, "pres_bytes is smaller than presentation bytes read."

    invoke-static {v0}, Lm4/p0;->c(Ljava/lang/String;)Lm4/p0;

    move-result-object v0

    throw v0

    .line 248
    :cond_74
    :goto_4a
    iget-boolean v3, v5, Lr5/c;->d:Z

    if-eqz v3, :cond_77

    iget v3, v5, Lr5/c;->a:I

    const/4 v4, -0x1

    if-eq v3, v4, :cond_75

    goto :goto_4b

    .line 249
    :cond_75
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Can\'t determine channel mode of presentation "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm4/p0;->c(Ljava/lang/String;)Lm4/p0;

    move-result-object v0

    throw v0

    :cond_76
    move/from16 v41, v6

    move/from16 v50, v13

    move/from16 v38, v15

    const/16 v6, 0x8

    const/4 v15, 0x5

    .line 250
    :cond_77
    :goto_4b
    iget-boolean v3, v5, Lr5/c;->d:Z

    if-eqz v3, :cond_7e

    .line 251
    iget v3, v5, Lr5/c;->a:I

    iget-boolean v4, v5, Lr5/c;->e:Z

    iget v5, v5, Lr5/c;->c:I

    packed-switch v3, :pswitch_data_0

    const/16 v10, 0xb

    const/16 v30, -0x1

    goto :goto_4c

    :pswitch_0
    const/16 v10, 0xb

    const/16 v30, 0x18

    goto :goto_4c

    :pswitch_1
    const/16 v10, 0xb

    const/16 v30, 0xe

    goto :goto_4c

    :pswitch_2
    const/16 v10, 0xb

    const/16 v30, 0xd

    goto :goto_4c

    :pswitch_3
    const/16 v10, 0xb

    const/16 v30, 0xc

    goto :goto_4c

    :pswitch_4
    const/16 v10, 0xb

    const/16 v30, 0xb

    goto :goto_4c

    :pswitch_5
    const/16 v10, 0xb

    const/16 v30, 0x8

    goto :goto_4c

    :pswitch_6
    const/16 v10, 0xb

    const/16 v30, 0x7

    goto :goto_4c

    :pswitch_7
    const/16 v10, 0xb

    const/16 v30, 0x6

    goto :goto_4c

    :pswitch_8
    const/16 v10, 0xb

    const/16 v30, 0x5

    goto :goto_4c

    :pswitch_9
    const/16 v10, 0xb

    const/16 v30, 0x3

    goto :goto_4c

    :pswitch_a
    const/16 v10, 0xb

    const/16 v30, 0x2

    goto :goto_4c

    :pswitch_b
    const/16 v10, 0xb

    const/16 v30, 0x1

    :goto_4c
    if-eq v3, v10, :cond_79

    const/16 v10, 0xc

    if-eq v3, v10, :cond_7a

    const/16 v11, 0xd

    if-eq v3, v11, :cond_7a

    const/16 v11, 0xe

    if-ne v3, v11, :cond_78

    goto :goto_4d

    :cond_78
    const/4 v12, 0x1

    goto :goto_4e

    :cond_79
    const/16 v10, 0xc

    :cond_7a
    :goto_4d
    if-nez v4, :cond_7b

    add-int/lit8 v30, v30, -0x2

    :cond_7b
    if-eqz v5, :cond_7d

    const/4 v12, 0x1

    if-eq v5, v12, :cond_7c

    goto :goto_4e

    :cond_7c
    add-int/lit8 v30, v30, -0x2

    goto :goto_4e

    :cond_7d
    const/4 v12, 0x1

    add-int/lit8 v30, v30, -0x4

    :goto_4e
    move/from16 v3, v30

    goto :goto_4f

    :cond_7e
    const/16 v10, 0xc

    const/4 v12, 0x1

    .line 252
    iget v3, v5, Lr5/c;->b:I

    add-int/2addr v3, v12

    .line 253
    iget v4, v5, Lr5/c;->f:I

    const/4 v5, 0x4

    if-ne v4, v5, :cond_80

    const/16 v4, 0x11

    if-ne v3, v4, :cond_7f

    const/16 v30, 0x15

    goto :goto_4e

    :cond_7f
    move/from16 v30, v3

    goto :goto_4e

    :cond_80
    :goto_4f
    if-lez v3, :cond_81

    .line 254
    new-instance v4, Lm4/p;

    invoke-direct {v4}, Lm4/p;-><init>()V

    .line 255
    iput-object v1, v4, Lm4/p;->a:Ljava/lang/String;

    .line 256
    invoke-static/range {v47 .. v47}, Lm4/o0;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v4, Lm4/p;->m:Ljava/lang/String;

    .line 257
    iput v3, v4, Lm4/p;->C:I

    .line 258
    iput v8, v4, Lm4/p;->D:I

    .line 259
    iput-object v2, v4, Lm4/p;->q:Lm4/n;

    .line 260
    iput-object v9, v4, Lm4/p;->d:Ljava/lang/String;

    .line 261
    new-instance v1, Lm4/q;

    invoke-direct {v1, v4}, Lm4/q;-><init>(Lm4/p;)V

    .line 262
    iput-object v1, v7, Lce/g;->e:Ljava/lang/Object;

    move/from16 v4, v41

    move/from16 v13, v50

    const v1, 0x616c6163

    goto/16 :goto_25

    .line 263
    :cond_81
    const-string v0, "Can\'t determine channel count of presentation."

    invoke-static {v0}, Lm4/p0;->c(Ljava/lang/String;)Lm4/p0;

    move-result-object v0

    throw v0

    .line 264
    :cond_82
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported AC-4 DSI version: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm4/p0;->c(Ljava/lang/String;)Lm4/p0;

    move-result-object v0

    throw v0

    :cond_83
    move/from16 v41, v6

    move/from16 v36, v11

    move/from16 v50, v13

    move/from16 v38, v15

    move-object/from16 v35, v21

    const/16 v6, 0x8

    const/16 v10, 0xc

    const v1, 0x646d6c70

    if-ne v3, v1, :cond_85

    if-lez v14, :cond_84

    move v6, v14

    move-object/from16 v10, v24

    move-object/from16 v4, v25

    move-object/from16 v8, v29

    move-object/from16 v21, v35

    move/from16 v15, v38

    const/4 v1, 0x1

    const/4 v11, 0x0

    const/4 v13, 0x2

    goto/16 :goto_21

    .line 265
    :cond_84
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid sample rate for Dolby TrueHD MLP stream: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    move-result-object v0

    throw v0

    :cond_85
    const v1, 0x64647473

    if-eq v3, v1, :cond_86

    const v1, 0x75647473

    if-ne v3, v1, :cond_87

    :cond_86
    const v1, 0x616c6163

    const/16 v43, 0x3

    const/16 v46, 0x2

    goto/16 :goto_54

    :cond_87
    const v1, 0x644f7073

    if-ne v3, v1, :cond_88

    add-int/lit8 v11, v36, -0x8

    .line 266
    sget-object v1, Ll6/e;->a:[B

    array-length v3, v1

    add-int/2addr v3, v11

    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v3

    add-int/lit8 v15, v38, 0x8

    .line 267
    invoke-virtual {v0, v15}, Lp4/s;->G(I)V

    .line 268
    array-length v1, v1

    invoke-virtual {v0, v3, v1, v11}, Lp4/s;->e([BII)V

    .line 269
    invoke-static {v3}, Lr5/b;->a([B)Ljava/util/ArrayList;

    move-result-object v8

    move-object/from16 v10, v24

    move-object/from16 v4, v25

    move-object/from16 v21, v35

    move/from16 v15, v38

    move/from16 v6, v41

    move/from16 v13, v50

    goto/16 :goto_20

    :cond_88
    const v1, 0x64664c61

    if-ne v3, v1, :cond_89

    add-int/lit8 v11, v36, -0xc

    add-int/lit8 v1, v36, -0x8

    .line 270
    new-array v1, v1, [B

    const/16 v3, 0x66

    const/16 v19, 0x0

    .line 271
    aput-byte v3, v1, v19

    const/16 v3, 0x4c

    const/16 v18, 0x1

    .line 272
    aput-byte v3, v1, v18

    const/16 v3, 0x61

    const/16 v46, 0x2

    .line 273
    aput-byte v3, v1, v46

    const/16 v3, 0x43

    const/16 v43, 0x3

    .line 274
    aput-byte v3, v1, v43

    add-int/lit8 v15, v38, 0xc

    .line 275
    invoke-virtual {v0, v15}, Lp4/s;->G(I)V

    const/4 v5, 0x4

    .line 276
    invoke-virtual {v0, v1, v5, v11}, Lp4/s;->e([BII)V

    .line 277
    invoke-static {v1}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    move-result-object v8

    :goto_50
    move-object/from16 v10, v24

    move-object/from16 v4, v25

    move-object/from16 v21, v35

    move/from16 v15, v38

    move/from16 v6, v41

    move/from16 v13, v50

    :goto_51
    const/4 v1, 0x1

    const/4 v11, 0x0

    goto/16 :goto_66

    :cond_89
    const v1, 0x616c6163

    const/4 v5, 0x4

    const/16 v43, 0x3

    const/16 v46, 0x2

    if-ne v3, v1, :cond_8a

    add-int/lit8 v11, v36, -0xc

    .line 278
    new-array v3, v11, [B

    add-int/lit8 v15, v38, 0xc

    .line 279
    invoke-virtual {v0, v15}, Lp4/s;->G(I)V

    const/4 v12, 0x0

    .line 280
    invoke-virtual {v0, v3, v12, v11}, Lp4/s;->e([BII)V

    .line 281
    sget-object v8, Lp4/d;->a:[B

    .line 282
    new-instance v8, Lp4/s;

    invoke-direct {v8, v3}, Lp4/s;-><init>([B)V

    .line 283
    invoke-virtual {v8, v4}, Lp4/s;->G(I)V

    .line 284
    invoke-virtual {v8}, Lp4/s;->u()I

    move-result v4

    const/16 v11, 0x14

    .line 285
    invoke-virtual {v8, v11}, Lp4/s;->G(I)V

    .line 286
    invoke-virtual {v8}, Lp4/s;->y()I

    move-result v8

    .line 287
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v8, v4}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v4

    .line 288
    iget-object v8, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 289
    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 290
    invoke-static {v3}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    move-result-object v3

    move v13, v4

    move v6, v8

    move-object/from16 v10, v24

    move-object/from16 v4, v25

    move-object/from16 v21, v35

    move/from16 v15, v38

    const/4 v1, 0x1

    const/4 v11, 0x0

    move-object v8, v3

    goto/16 :goto_66

    :cond_8a
    const v8, 0x69616362

    if-ne v3, v8, :cond_8e

    add-int/lit8 v15, v38, 0x9

    .line 291
    invoke-virtual {v0, v15}, Lp4/s;->G(I)V

    move-wide/from16 v11, v16

    const/4 v3, 0x0

    :goto_52
    if-ge v3, v4, :cond_8d

    .line 292
    iget v8, v0, Lp4/s;->b:I

    iget v13, v0, Lp4/s;->c:I

    if-eq v8, v13, :cond_8c

    .line 293
    invoke-virtual {v0}, Lp4/s;->u()I

    move-result v8

    int-to-long v4, v8

    const-wide/16 v26, 0x7f

    and-long v26, v4, v26

    mul-int/lit8 v8, v3, 0x7

    shl-long v26, v26, v8

    or-long v11, v11, v26

    const-wide/16 v26, 0x80

    and-long v4, v4, v26

    cmp-long v8, v4, v16

    if-nez v8, :cond_8b

    goto :goto_53

    :cond_8b
    add-int/lit8 v3, v3, 0x1

    const/16 v4, 0x9

    const/4 v5, 0x4

    goto :goto_52

    .line 294
    :cond_8c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Attempting to read a byte over the limit."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 295
    :cond_8d
    :goto_53
    invoke-static {v11, v12}, Lg8/a;->q(J)I

    move-result v3

    .line 296
    new-array v4, v3, [B

    const/4 v12, 0x0

    .line 297
    invoke-virtual {v0, v4, v12, v3}, Lp4/s;->e([BII)V

    .line 298
    invoke-static {v4}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    move-result-object v8

    goto/16 :goto_50

    :cond_8e
    move/from16 v4, v41

    move/from16 v13, v50

    goto :goto_55

    .line 299
    :goto_54
    new-instance v3, Lm4/p;

    invoke-direct {v3}, Lm4/p;-><init>()V

    .line 300
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lm4/p;->a:Ljava/lang/String;

    .line 301
    invoke-static/range {v25 .. v25}, Lm4/o0;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lm4/p;->m:Ljava/lang/String;

    move/from16 v13, v50

    .line 302
    iput v13, v3, Lm4/p;->C:I

    move/from16 v4, v41

    .line 303
    iput v4, v3, Lm4/p;->D:I

    .line 304
    iput-object v2, v3, Lm4/p;->q:Lm4/n;

    .line 305
    iput-object v9, v3, Lm4/p;->d:Ljava/lang/String;

    .line 306
    new-instance v5, Lm4/q;

    invoke-direct {v5, v3}, Lm4/q;-><init>(Lm4/p;)V

    .line 307
    iput-object v5, v7, Lce/g;->e:Ljava/lang/Object;

    :goto_55
    move v6, v4

    move-object/from16 v10, v24

    move-object/from16 v4, v25

    move-object/from16 v8, v29

    move-object/from16 v21, v35

    move/from16 v15, v38

    goto/16 :goto_51

    :cond_8f
    move/from16 v31, v1

    move-object/from16 v32, v5

    move v4, v6

    move-object/from16 v29, v8

    move/from16 v36, v11

    move-object/from16 v28, v12

    move/from16 v38, v15

    move-object/from16 v35, v21

    const v1, 0x616c6163

    const/16 v6, 0x8

    const/16 v10, 0xc

    const/16 v43, 0x3

    const/16 v46, 0x2

    const v5, 0x65736473

    :goto_56
    if-ne v3, v5, :cond_90

    move-object/from16 v1, v32

    move/from16 v11, v36

    move/from16 v6, v38

    move v15, v6

    const/4 v8, 0x0

    :goto_57
    const/4 v12, -0x1

    goto :goto_5d

    .line 308
    :cond_90
    iget v3, v0, Lp4/s;->b:I

    move/from16 v15, v38

    if-lt v3, v15, :cond_91

    const/4 v5, 0x1

    :goto_58
    const/4 v8, 0x0

    goto :goto_59

    :cond_91
    const/4 v5, 0x0

    goto :goto_58

    .line 309
    :goto_59
    invoke-static {v8, v5}, Lr5/b;->c(Ljava/lang/String;Z)V

    :goto_5a
    sub-int v5, v3, v15

    move/from16 v11, v36

    if-ge v5, v11, :cond_94

    .line 310
    invoke-virtual {v0, v3}, Lp4/s;->G(I)V

    .line 311
    invoke-virtual {v0}, Lp4/s;->g()I

    move-result v5

    if-lez v5, :cond_92

    const/4 v12, 0x1

    :goto_5b
    move-object/from16 v1, v32

    goto :goto_5c

    :cond_92
    const/4 v12, 0x0

    goto :goto_5b

    .line 312
    :goto_5c
    invoke-static {v1, v12}, Lr5/b;->c(Ljava/lang/String;Z)V

    .line 313
    invoke-virtual {v0}, Lp4/s;->g()I

    move-result v12

    const v6, 0x65736473

    if-ne v12, v6, :cond_93

    move v6, v3

    goto :goto_57

    :cond_93
    add-int/2addr v3, v5

    move-object/from16 v32, v1

    move/from16 v36, v11

    const v1, 0x616c6163

    const/16 v6, 0x8

    goto :goto_5a

    :cond_94
    move-object/from16 v1, v32

    const/4 v6, -0x1

    goto :goto_57

    :goto_5d
    if-eq v6, v12, :cond_9b

    .line 314
    invoke-static {v6, v0}, Ll6/e;->a(ILp4/s;)Lj5/x0;

    move-result-object v3

    .line 315
    iget-object v5, v3, Lj5/x0;->c:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    .line 316
    iget-object v6, v3, Lj5/x0;->d:Ljava/lang/Object;

    check-cast v6, [B

    if-eqz v6, :cond_9a

    .line 317
    const-string v8, "audio/vorbis"

    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_98

    .line 318
    new-instance v8, Lp4/s;

    invoke-direct {v8, v6}, Lp4/s;-><init>([B)V

    const/4 v10, 0x1

    .line 319
    invoke-virtual {v8, v10}, Lp4/s;->H(I)V

    const/4 v12, 0x0

    .line 320
    :goto_5e
    invoke-virtual {v8}, Lp4/s;->a()I

    move-result v18

    if-lez v18, :cond_95

    .line 321
    iget-object v10, v8, Lp4/s;->a:[B

    iget v0, v8, Lp4/s;->b:I

    aget-byte v0, v10, v0

    const/16 v10, 0xff

    and-int/2addr v0, v10

    if-ne v0, v10, :cond_95

    add-int/lit16 v12, v12, 0xff

    const/4 v10, 0x1

    .line 322
    invoke-virtual {v8, v10}, Lp4/s;->H(I)V

    move-object/from16 v0, p0

    goto :goto_5e

    .line 323
    :cond_95
    invoke-virtual {v8}, Lp4/s;->u()I

    move-result v0

    add-int/2addr v0, v12

    const/4 v10, 0x0

    .line 324
    :goto_5f
    invoke-virtual {v8}, Lp4/s;->a()I

    move-result v12

    if-lez v12, :cond_97

    .line 325
    iget-object v12, v8, Lp4/s;->a:[B

    move-object/from16 v32, v1

    iget v1, v8, Lp4/s;->b:I

    aget-byte v1, v12, v1

    const/16 v12, 0xff

    and-int/2addr v1, v12

    if-ne v1, v12, :cond_96

    add-int/lit16 v10, v10, 0xff

    const/4 v1, 0x1

    .line 326
    invoke-virtual {v8, v1}, Lp4/s;->H(I)V

    move-object/from16 v1, v32

    goto :goto_5f

    :cond_96
    :goto_60
    const/4 v1, 0x1

    goto :goto_61

    :cond_97
    move-object/from16 v32, v1

    goto :goto_60

    .line 327
    :goto_61
    invoke-virtual {v8}, Lp4/s;->u()I

    move-result v12

    add-int/2addr v12, v10

    .line 328
    new-array v10, v0, [B

    .line 329
    iget v8, v8, Lp4/s;->b:I

    move/from16 v36, v11

    const/4 v11, 0x0

    .line 330
    invoke-static {v6, v8, v10, v11, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v8, v0

    add-int/2addr v8, v12

    .line 331
    array-length v0, v6

    sub-int/2addr v0, v8

    .line 332
    new-array v12, v0, [B

    .line 333
    invoke-static {v6, v8, v12, v11, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 334
    invoke-static {v10, v12}, Lya/i0;->v(Ljava/lang/Object;Ljava/lang/Object;)Lya/a1;

    move-result-object v8

    move v6, v4

    move-object v4, v5

    :goto_62
    move-object/from16 v10, v35

    goto :goto_65

    :cond_98
    move-object/from16 v32, v1

    move/from16 v36, v11

    const/4 v1, 0x1

    const/4 v11, 0x0

    .line 335
    const-string v0, "audio/mp4a-latm"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_99

    .line 336
    new-instance v0, Lp4/r;

    .line 337
    array-length v4, v6

    invoke-direct {v0, v6, v4}, Lp4/r;-><init>([BI)V

    .line 338
    invoke-static {v0, v11}, Lr5/b;->m(Lp4/r;Z)Lr5/a;

    move-result-object v0

    .line 339
    iget v4, v0, Lr5/a;->b:I

    .line 340
    iget v13, v0, Lr5/a;->c:I

    .line 341
    iget-object v10, v0, Lr5/a;->a:Ljava/lang/String;

    goto :goto_63

    :cond_99
    move-object/from16 v10, v35

    .line 342
    :goto_63
    invoke-static {v6}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    move-result-object v8

    move v6, v4

    move-object v4, v5

    goto :goto_65

    :cond_9a
    move-object/from16 v32, v1

    move/from16 v36, v11

    const/4 v1, 0x1

    const/4 v11, 0x0

    move v6, v4

    move-object v4, v5

    :goto_64
    move-object/from16 v8, v29

    goto :goto_62

    :cond_9b
    move-object/from16 v32, v1

    move/from16 v36, v11

    const/4 v1, 0x1

    const/4 v11, 0x0

    move v6, v4

    move-object/from16 v3, v24

    move-object/from16 v4, v25

    goto :goto_64

    :goto_65
    move-object/from16 v21, v10

    move-object v10, v3

    :goto_66
    add-int v15, v15, v36

    move-object/from16 v0, p0

    move/from16 v3, v23

    move-object/from16 v12, v28

    move/from16 v1, v31

    move-object/from16 v5, v32

    const/16 v45, 0x4

    goto/16 :goto_1a

    :cond_9c
    move/from16 v31, v1

    move/from16 v23, v3

    move-object/from16 v25, v4

    move v4, v6

    move-object/from16 v29, v8

    move-object/from16 v24, v10

    move-object/from16 v35, v21

    const/4 v11, 0x0

    .line 343
    iget-object v0, v7, Lce/g;->e:Ljava/lang/Object;

    check-cast v0, Lm4/q;

    if-nez v0, :cond_9e

    if-eqz v25, :cond_9e

    .line 344
    new-instance v0, Lm4/p;

    invoke-direct {v0}, Lm4/p;-><init>()V

    .line 345
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lm4/p;->a:Ljava/lang/String;

    .line 346
    invoke-static/range {v25 .. v25}, Lm4/o0;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lm4/p;->m:Ljava/lang/String;

    move-object/from16 v5, v35

    .line 347
    iput-object v5, v0, Lm4/p;->j:Ljava/lang/String;

    .line 348
    iput v13, v0, Lm4/p;->C:I

    .line 349
    iput v4, v0, Lm4/p;->D:I

    move/from16 v1, v31

    .line 350
    iput v1, v0, Lm4/p;->E:I

    move-object/from16 v8, v29

    .line 351
    iput-object v8, v0, Lm4/p;->p:Ljava/util/List;

    .line 352
    iput-object v2, v0, Lm4/p;->q:Lm4/n;

    .line 353
    iput-object v9, v0, Lm4/p;->d:Ljava/lang/String;

    if-eqz v24, :cond_9d

    move-object/from16 v10, v24

    .line 354
    iget-wide v1, v10, Lj5/x0;->a:J

    .line 355
    invoke-static {v1, v2}, Lg8/a;->Y(J)I

    move-result v1

    .line 356
    iput v1, v0, Lm4/p;->h:I

    .line 357
    iget-wide v1, v10, Lj5/x0;->b:J

    .line 358
    invoke-static {v1, v2}, Lg8/a;->Y(J)I

    move-result v1

    .line 359
    iput v1, v0, Lm4/p;->i:I

    .line 360
    :cond_9d
    new-instance v1, Lm4/q;

    invoke-direct {v1, v0}, Lm4/q;-><init>(Lm4/p;)V

    .line 361
    iput-object v1, v7, Lce/g;->e:Ljava/lang/Object;

    :cond_9e
    :goto_67
    move-object/from16 v0, p0

    move/from16 v3, v23

    goto :goto_69

    :cond_9f
    move/from16 v22, v11

    const/4 v11, 0x0

    move-object/from16 v0, p0

    move/from16 v5, p2

    move-object/from16 v6, p4

    move v1, v4

    goto/16 :goto_2

    .line 362
    :goto_68
    invoke-static/range {v0 .. v8}, Ll6/e;->h(Lp4/s;IIIIILm4/n;Lce/g;I)V

    move/from16 v42, v2

    move/from16 v20, v8

    :goto_69
    add-int v2, v42, v3

    .line 363
    invoke-virtual {v0, v2}, Lp4/s;->G(I)V

    add-int/lit8 v8, v20, 0x1

    move-object/from16 v6, p4

    move/from16 v11, v22

    const/16 v10, 0xc

    goto/16 :goto_0

    :cond_a0
    return-object v7

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static g(Lq4/b;Lr5/v;JLm4/n;ZZLxa/d;)Ljava/util/ArrayList;
    .locals 73

    move-object/from16 v0, p0

    .line 1
    iget-object v2, v0, Lq4/b;->e:Ljava/util/ArrayList;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v5, 0x0

    .line 2
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_58

    .line 3
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lq4/b;

    .line 4
    iget v7, v6, Lq4/d;->b:I

    const v8, 0x7472616b

    if-eq v7, v8, :cond_0

    move-object/from16 v43, v2

    move-object v0, v3

    move/from16 v44, v5

    :goto_1
    const/16 v33, 0x0

    goto/16 :goto_4a

    :cond_0
    const v7, 0x6d766864

    .line 5
    invoke-virtual {v0, v7}, Lq4/b;->i(I)Lq4/c;

    move-result-object v7

    .line 6
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v8, 0x6d646961

    .line 7
    invoke-virtual {v6, v8}, Lq4/b;->h(I)Lq4/b;

    move-result-object v9

    .line 8
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v10, 0x68646c72    # 4.3148E24f

    .line 9
    invoke-virtual {v9, v10}, Lq4/b;->i(I)Lq4/c;

    move-result-object v10

    .line 10
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    iget-object v10, v10, Lq4/c;->c:Lp4/s;

    const/16 v11, 0x10

    .line 12
    invoke-virtual {v10, v11}, Lp4/s;->G(I)V

    .line 13
    invoke-virtual {v10}, Lp4/s;->g()I

    move-result v10

    const v12, 0x736f756e

    const/4 v13, -0x1

    if-ne v10, v12, :cond_1

    const/4 v10, 0x1

    goto :goto_3

    :cond_1
    const v12, 0x76696465

    if-ne v10, v12, :cond_2

    const/4 v10, 0x2

    goto :goto_3

    :cond_2
    const v12, 0x74657874

    if-eq v10, v12, :cond_5

    const v12, 0x7362746c

    if-eq v10, v12, :cond_5

    const v12, 0x73756274

    if-eq v10, v12, :cond_5

    const v12, 0x636c6370

    if-ne v10, v12, :cond_3

    goto :goto_2

    :cond_3
    const v12, 0x6d657461

    if-ne v10, v12, :cond_4

    const/4 v10, 0x5

    goto :goto_3

    :cond_4
    const/4 v10, -0x1

    goto :goto_3

    :cond_5
    :goto_2
    const/4 v10, 0x3

    .line 14
    :goto_3
    const-string v12, ""

    const/4 v14, 0x4

    const-wide/16 v37, 0x0

    if-ne v10, v13, :cond_6

    move-object/from16 v43, v2

    move/from16 v44, v5

    const/4 v0, 0x0

    move-object/from16 v2, p7

    goto/16 :goto_19

    :cond_6
    const v15, 0x746b6864

    .line 15
    invoke-virtual {v6, v15}, Lq4/b;->i(I)Lq4/c;

    move-result-object v15

    .line 16
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    iget-object v15, v15, Lq4/c;->c:Lp4/s;

    const/16 v4, 0x8

    .line 18
    invoke-virtual {v15, v4}, Lp4/s;->G(I)V

    .line 19
    invoke-virtual {v15}, Lp4/s;->g()I

    move-result v16

    .line 20
    invoke-static/range {v16 .. v16}, Ll6/e;->c(I)I

    move-result v16

    if-nez v16, :cond_7

    goto :goto_4

    :cond_7
    const/16 v4, 0x10

    .line 21
    :goto_4
    invoke-virtual {v15, v4}, Lp4/s;->H(I)V

    .line 22
    invoke-virtual {v15}, Lp4/s;->g()I

    move-result v19

    .line 23
    invoke-virtual {v15, v14}, Lp4/s;->H(I)V

    .line 24
    iget v4, v15, Lp4/s;->b:I

    if-nez v16, :cond_8

    const/4 v8, 0x4

    goto :goto_5

    :cond_8
    const/16 v8, 0x8

    :goto_5
    const/4 v14, 0x0

    :goto_6
    const-wide v20, -0x7fffffffffffffffL    # -4.9E-324

    if-ge v14, v8, :cond_c

    .line 25
    iget-object v11, v15, Lp4/s;->a:[B

    add-int v22, v4, v14

    .line 26
    aget-byte v11, v11, v22

    if-eq v11, v13, :cond_b

    if-nez v16, :cond_9

    .line 27
    invoke-virtual {v15}, Lp4/s;->w()J

    move-result-wide v22

    goto :goto_7

    :cond_9
    invoke-virtual {v15}, Lp4/s;->z()J

    move-result-wide v22

    :goto_7
    cmp-long v4, v22, v37

    if-nez v4, :cond_a

    :goto_8
    move-wide/from16 v22, v20

    :cond_a
    const/16 v4, 0x10

    goto :goto_9

    :cond_b
    add-int/lit8 v14, v14, 0x1

    const/16 v11, 0x10

    goto :goto_6

    .line 28
    :cond_c
    invoke-virtual {v15, v8}, Lp4/s;->H(I)V

    goto :goto_8

    .line 29
    :goto_9
    invoke-virtual {v15, v4}, Lp4/s;->H(I)V

    .line 30
    invoke-virtual {v15}, Lp4/s;->g()I

    move-result v8

    .line 31
    invoke-virtual {v15}, Lp4/s;->g()I

    move-result v11

    const/4 v14, 0x4

    .line 32
    invoke-virtual {v15, v14}, Lp4/s;->H(I)V

    .line 33
    invoke-virtual {v15}, Lp4/s;->g()I

    move-result v14

    .line 34
    invoke-virtual {v15}, Lp4/s;->g()I

    move-result v15

    const/high16 v4, -0x10000

    const/high16 v13, 0x10000

    if-nez v8, :cond_d

    if-ne v11, v13, :cond_d

    if-ne v14, v4, :cond_d

    if-nez v15, :cond_d

    const/16 v4, 0x5a

    move-wide/from16 v13, v20

    const/16 v20, 0x5a

    goto :goto_a

    :cond_d
    if-nez v8, :cond_e

    if-ne v11, v4, :cond_e

    if-ne v14, v13, :cond_e

    if-nez v15, :cond_e

    const/16 v4, 0x10e

    move-wide/from16 v13, v20

    const/16 v20, 0x10e

    goto :goto_a

    :cond_e
    if-ne v8, v4, :cond_f

    if-nez v11, :cond_f

    if-nez v14, :cond_f

    if-ne v15, v4, :cond_f

    const/16 v4, 0xb4

    move-wide/from16 v13, v20

    const/16 v20, 0xb4

    goto :goto_a

    :cond_f
    move-wide/from16 v13, v20

    const/16 v20, 0x0

    :goto_a
    cmp-long v4, p2, v13

    if-nez v4, :cond_10

    move-wide/from16 v24, v22

    goto :goto_b

    :cond_10
    move-wide/from16 v24, p2

    .line 35
    :goto_b
    iget-object v4, v7, Lq4/c;->c:Lp4/s;

    invoke-static {v4}, Ll6/e;->d(Lp4/s;)Lq4/f;

    move-result-object v4

    iget-wide v7, v4, Lq4/f;->c:J

    cmp-long v4, v24, v13

    if-nez v4, :cond_11

    move-wide/from16 v28, v7

    move-wide v7, v13

    :goto_c
    const v4, 0x6d696e66

    goto :goto_d

    .line 36
    :cond_11
    sget v4, Lp4/c0;->a:I

    .line 37
    sget-object v30, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v26, 0xf4240

    move-wide/from16 v28, v7

    invoke-static/range {v24 .. v30}, Lp4/c0;->V(JJJLjava/math/RoundingMode;)J

    move-result-wide v7

    goto :goto_c

    .line 38
    :goto_d
    invoke-virtual {v9, v4}, Lq4/b;->h(I)Lq4/b;

    move-result-object v11

    .line 39
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v4, 0x7374626c

    .line 40
    invoke-virtual {v11, v4}, Lq4/b;->h(I)Lq4/b;

    move-result-object v11

    .line 41
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v4, 0x6d646864

    .line 42
    invoke-virtual {v9, v4}, Lq4/b;->i(I)Lq4/c;

    move-result-object v4

    .line 43
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    iget-object v4, v4, Lq4/c;->c:Lp4/s;

    const/16 v9, 0x8

    .line 45
    invoke-virtual {v4, v9}, Lp4/s;->G(I)V

    .line 46
    invoke-virtual {v4}, Lp4/s;->g()I

    move-result v9

    .line 47
    invoke-static {v9}, Ll6/e;->c(I)I

    move-result v9

    if-nez v9, :cond_12

    const/16 v15, 0x8

    goto :goto_e

    :cond_12
    const/16 v15, 0x10

    .line 48
    :goto_e
    invoke-virtual {v4, v15}, Lp4/s;->H(I)V

    .line 49
    invoke-virtual {v4}, Lp4/s;->w()J

    move-result-wide v25

    .line 50
    iget v15, v4, Lp4/s;->b:I

    if-nez v9, :cond_13

    const/4 v13, 0x4

    goto :goto_f

    :cond_13
    const/16 v13, 0x8

    :goto_f
    const/4 v14, 0x0

    :goto_10
    if-ge v14, v13, :cond_17

    .line 51
    iget-object v0, v4, Lp4/s;->a:[B

    add-int v16, v15, v14

    .line 52
    aget-byte v0, v0, v16

    move-object/from16 v43, v2

    const/4 v2, -0x1

    if-eq v0, v2, :cond_16

    if-nez v9, :cond_14

    .line 53
    invoke-virtual {v4}, Lp4/s;->w()J

    move-result-wide v13

    goto :goto_11

    :cond_14
    invoke-virtual {v4}, Lp4/s;->z()J

    move-result-wide v13

    :goto_11
    cmp-long v0, v13, v37

    if-nez v0, :cond_15

    :goto_12
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_13

    .line 54
    :cond_15
    sget v0, Lp4/c0;->a:I

    .line 55
    sget-object v27, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v23, 0xf4240

    move-wide/from16 v21, v13

    invoke-static/range {v21 .. v27}, Lp4/c0;->V(JJJLjava/math/RoundingMode;)J

    move-result-wide v13

    goto :goto_13

    :cond_16
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v0, p0

    move-object/from16 v2, v43

    goto :goto_10

    :cond_17
    move-object/from16 v43, v2

    .line 56
    invoke-virtual {v4, v13}, Lp4/s;->H(I)V

    goto :goto_12

    .line 57
    :goto_13
    invoke-virtual {v4}, Lp4/s;->A()I

    move-result v0

    .line 58
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    shr-int/lit8 v4, v0, 0xa

    and-int/lit8 v4, v4, 0x1f

    add-int/lit8 v4, v4, 0x60

    int-to-char v4, v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    shr-int/lit8 v4, v0, 0x5

    and-int/lit8 v4, v4, 0x1f

    add-int/lit8 v4, v4, 0x60

    int-to-char v4, v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v0, v0, 0x1f

    add-int/lit8 v0, v0, 0x60

    int-to-char v0, v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    const v0, 0x73747364

    .line 59
    invoke-virtual {v11, v0}, Lq4/b;->i(I)Lq4/c;

    move-result-object v0

    if-eqz v0, :cond_57

    .line 60
    iget-object v0, v0, Lq4/c;->c:Lp4/s;

    move-object/from16 v22, p4

    move/from16 v23, p6

    move-object/from16 v18, v0

    .line 61
    invoke-static/range {v18 .. v23}, Ll6/e;->f(Lp4/s;IILjava/lang/String;Lm4/n;Z)Lce/g;

    move-result-object v0

    if-nez p5, :cond_1d

    const v2, 0x65647473

    .line 62
    invoke-virtual {v6, v2}, Lq4/b;->h(I)Lq4/b;

    move-result-object v2

    if-eqz v2, :cond_1d

    const v4, 0x656c7374

    .line 63
    invoke-virtual {v2, v4}, Lq4/b;->i(I)Lq4/c;

    move-result-object v2

    if-nez v2, :cond_18

    move/from16 v44, v5

    const/4 v2, 0x0

    goto :goto_17

    .line 64
    :cond_18
    iget-object v2, v2, Lq4/c;->c:Lp4/s;

    const/16 v9, 0x8

    .line 65
    invoke-virtual {v2, v9}, Lp4/s;->G(I)V

    .line 66
    invoke-virtual {v2}, Lp4/s;->g()I

    move-result v4

    .line 67
    invoke-static {v4}, Ll6/e;->c(I)I

    move-result v4

    .line 68
    invoke-virtual {v2}, Lp4/s;->y()I

    move-result v9

    .line 69
    new-array v11, v9, [J

    .line 70
    new-array v15, v9, [J

    move/from16 v44, v5

    const/4 v5, 0x0

    :goto_14
    if-ge v5, v9, :cond_1c

    move/from16 v16, v5

    const/4 v5, 0x1

    if-ne v4, v5, :cond_19

    .line 71
    invoke-virtual {v2}, Lp4/s;->z()J

    move-result-wide v17

    goto :goto_15

    :cond_19
    invoke-virtual {v2}, Lp4/s;->w()J

    move-result-wide v17

    :goto_15
    aput-wide v17, v11, v16

    if-ne v4, v5, :cond_1a

    .line 72
    invoke-virtual {v2}, Lp4/s;->o()J

    move-result-wide v17

    move-wide/from16 v71, v17

    move/from16 v17, v4

    move-wide/from16 v4, v71

    goto :goto_16

    :cond_1a
    invoke-virtual {v2}, Lp4/s;->g()I

    move-result v5

    move/from16 v17, v4

    int-to-long v4, v5

    :goto_16
    aput-wide v4, v15, v16

    .line 73
    invoke-virtual {v2}, Lp4/s;->r()S

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_1b

    const/4 v4, 0x2

    .line 74
    invoke-virtual {v2, v4}, Lp4/s;->H(I)V

    add-int/lit8 v5, v16, 0x1

    move/from16 v4, v17

    goto :goto_14

    .line 75
    :cond_1b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported media rate."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 76
    :cond_1c
    invoke-static {v11, v15}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v2

    :goto_17
    if-eqz v2, :cond_1e

    .line 77
    iget-object v4, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, [J

    .line 78
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, [J

    move-object/from16 v32, v2

    move-object/from16 v31, v4

    goto :goto_18

    :cond_1d
    move/from16 v44, v5

    :cond_1e
    const/16 v31, 0x0

    const/16 v32, 0x0

    .line 79
    :goto_18
    iget-object v2, v0, Lce/g;->e:Ljava/lang/Object;

    move-object/from16 v27, v2

    check-cast v27, Lm4/q;

    if-nez v27, :cond_1f

    move-object/from16 v2, p7

    const/4 v0, 0x0

    goto :goto_19

    .line 80
    :cond_1f
    new-instance v16, Ll6/q;

    .line 81
    iget v2, v0, Lce/g;->c:I

    iget-object v4, v0, Lce/g;->d:Ljava/lang/Object;

    check-cast v4, [Ll6/r;

    iget v0, v0, Lce/g;->b:I

    move/from16 v30, v0

    move-wide/from16 v23, v7

    move/from16 v18, v10

    move/from16 v17, v19

    move-wide/from16 v19, v25

    move-wide/from16 v21, v28

    move/from16 v28, v2

    move-object/from16 v29, v4

    move-wide/from16 v25, v13

    invoke-direct/range {v16 .. v32}, Ll6/q;-><init>(IIJJJJLm4/q;I[Ll6/r;I[J[J)V

    move-object/from16 v2, p7

    move-object/from16 v0, v16

    .line 82
    :goto_19
    invoke-interface {v2, v0}, Lxa/d;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Ll6/q;

    if-nez v14, :cond_20

    move-object v0, v3

    goto/16 :goto_1

    .line 83
    :cond_20
    iget-object v0, v14, Ll6/q;->g:Lm4/q;

    const v4, 0x6d646961

    .line 84
    invoke-virtual {v6, v4}, Lq4/b;->h(I)Lq4/b;

    move-result-object v4

    .line 85
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v5, 0x6d696e66

    .line 86
    invoke-virtual {v4, v5}, Lq4/b;->h(I)Lq4/b;

    move-result-object v4

    .line 87
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v5, 0x7374626c

    .line 88
    invoke-virtual {v4, v5}, Lq4/b;->h(I)Lq4/b;

    move-result-object v4

    .line 89
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v5, 0x7374737a

    .line 90
    invoke-virtual {v4, v5}, Lq4/b;->i(I)Lq4/c;

    move-result-object v5

    if-eqz v5, :cond_21

    .line 91
    new-instance v6, Lch/z;

    invoke-direct {v6, v5, v0}, Lch/z;-><init>(Lq4/c;Lm4/q;)V

    goto :goto_1a

    :cond_21
    const v5, 0x73747a32

    .line 92
    invoke-virtual {v4, v5}, Lq4/b;->i(I)Lq4/c;

    move-result-object v5

    if-eqz v5, :cond_56

    .line 93
    new-instance v6, Ll6/d;

    invoke-direct {v6, v5}, Ll6/d;-><init>(Lq4/c;)V

    .line 94
    :goto_1a
    invoke-interface {v6}, Ll6/b;->m()I

    move-result v5

    if-nez v5, :cond_22

    .line 95
    new-instance v13, Ll6/t;

    const/4 v0, 0x0

    new-array v15, v0, [J

    new-array v4, v0, [I

    new-array v5, v0, [J

    new-array v6, v0, [I

    const-wide/16 v20, 0x0

    const/16 v17, 0x0

    move-object/from16 v16, v4

    move-object/from16 v18, v5

    move-object/from16 v19, v6

    invoke-direct/range {v13 .. v21}, Ll6/t;-><init>(Ll6/q;[J[II[J[IJ)V

    move-object v0, v3

    :goto_1b
    const/16 v33, 0x0

    goto/16 :goto_49

    .line 96
    :cond_22
    iget v7, v14, Ll6/q;->b:I

    const/4 v8, 0x2

    if-ne v7, v8, :cond_23

    iget-wide v7, v14, Ll6/q;->f:J

    cmp-long v9, v7, v37

    if-lez v9, :cond_23

    int-to-float v9, v5

    long-to-float v7, v7

    const v8, 0x49742400    # 1000000.0f

    div-float/2addr v7, v8

    div-float/2addr v9, v7

    .line 97
    invoke-virtual {v0}, Lm4/q;->a()Lm4/p;

    move-result-object v0

    .line 98
    iput v9, v0, Lm4/p;->v:F

    .line 99
    new-instance v7, Lm4/q;

    invoke-direct {v7, v0}, Lm4/q;-><init>(Lm4/p;)V

    .line 100
    new-instance v15, Ll6/q;

    iget v0, v14, Ll6/q;->a:I

    iget v8, v14, Ll6/q;->b:I

    iget-wide v9, v14, Ll6/q;->c:J

    move-object v11, v6

    move-object/from16 v26, v7

    iget-wide v6, v14, Ll6/q;->d:J

    move-wide/from16 v20, v6

    iget-wide v6, v14, Ll6/q;->e:J

    move-wide/from16 v22, v6

    iget-wide v6, v14, Ll6/q;->f:J

    iget v13, v14, Ll6/q;->h:I

    move/from16 v16, v0

    iget-object v0, v14, Ll6/q;->l:[Ll6/r;

    move-object/from16 v28, v0

    iget v0, v14, Ll6/q;->k:I

    move/from16 v29, v0

    iget-object v0, v14, Ll6/q;->i:[J

    iget-object v14, v14, Ll6/q;->j:[J

    move-object/from16 v30, v0

    move-wide/from16 v24, v6

    move/from16 v17, v8

    move-wide/from16 v18, v9

    move/from16 v27, v13

    move-object/from16 v31, v14

    invoke-direct/range {v15 .. v31}, Ll6/q;-><init>(IIJJJJLm4/q;I[Ll6/r;I[J[J)V

    move-object v14, v15

    goto :goto_1c

    :cond_23
    move-object v11, v6

    .line 101
    :goto_1c
    iget-wide v6, v14, Ll6/q;->c:J

    iget v0, v14, Ll6/q;->b:I

    iget-object v8, v14, Ll6/q;->j:[J

    iget-object v9, v14, Ll6/q;->g:Lm4/q;

    iget-object v10, v14, Ll6/q;->i:[J

    const v13, 0x7374636f

    invoke-virtual {v4, v13}, Lq4/b;->i(I)Lq4/c;

    move-result-object v13

    if-nez v13, :cond_24

    const v13, 0x636f3634

    .line 102
    invoke-virtual {v4, v13}, Lq4/b;->i(I)Lq4/c;

    move-result-object v13

    .line 103
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v15, 0x1

    goto :goto_1d

    :cond_24
    const/4 v15, 0x0

    .line 104
    :goto_1d
    iget-object v13, v13, Lq4/c;->c:Lp4/s;

    const v2, 0x73747363

    .line 105
    invoke-virtual {v4, v2}, Lq4/b;->i(I)Lq4/c;

    move-result-object v2

    .line 106
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    iget-object v2, v2, Lq4/c;->c:Lp4/s;

    move-object/from16 v16, v8

    const v8, 0x73747473

    .line 108
    invoke-virtual {v4, v8}, Lq4/b;->i(I)Lq4/c;

    move-result-object v8

    .line 109
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    iget-object v8, v8, Lq4/c;->c:Lp4/s;

    move-object/from16 v17, v11

    const v11, 0x73747373

    .line 111
    invoke-virtual {v4, v11}, Lq4/b;->i(I)Lq4/c;

    move-result-object v11

    if-eqz v11, :cond_25

    .line 112
    iget-object v11, v11, Lq4/c;->c:Lp4/s;

    :goto_1e
    move-object/from16 v18, v12

    goto :goto_1f

    :cond_25
    const/4 v11, 0x0

    goto :goto_1e

    :goto_1f
    const v12, 0x63747473

    .line 113
    invoke-virtual {v4, v12}, Lq4/b;->i(I)Lq4/c;

    move-result-object v4

    if-eqz v4, :cond_26

    .line 114
    iget-object v4, v4, Lq4/c;->c:Lp4/s;

    goto :goto_20

    :cond_26
    const/4 v4, 0x0

    .line 115
    :goto_20
    new-instance v12, Ll6/a;

    invoke-direct {v12, v2, v13, v15}, Ll6/a;-><init>(Lp4/s;Lp4/s;Z)V

    const/16 v2, 0xc

    .line 116
    invoke-virtual {v8, v2}, Lp4/s;->G(I)V

    .line 117
    invoke-virtual {v8}, Lp4/s;->y()I

    move-result v13

    const/16 v39, 0x1

    add-int/lit8 v13, v13, -0x1

    .line 118
    invoke-virtual {v8}, Lp4/s;->y()I

    move-result v15

    move-object/from16 v19, v8

    .line 119
    invoke-virtual/range {v19 .. v19}, Lp4/s;->y()I

    move-result v8

    if-eqz v4, :cond_27

    .line 120
    invoke-virtual {v4, v2}, Lp4/s;->G(I)V

    .line 121
    invoke-virtual {v4}, Lp4/s;->y()I

    move-result v20

    goto :goto_21

    :cond_27
    const/16 v20, 0x0

    :goto_21
    if-eqz v11, :cond_29

    .line 122
    invoke-virtual {v11, v2}, Lp4/s;->G(I)V

    .line 123
    invoke-virtual {v11}, Lp4/s;->y()I

    move-result v2

    if-lez v2, :cond_28

    .line 124
    invoke-virtual {v11}, Lp4/s;->y()I

    move-result v21

    const/16 v39, 0x1

    add-int/lit8 v21, v21, -0x1

    move/from16 v22, v21

    move/from16 v21, v2

    goto :goto_23

    :cond_28
    move/from16 v21, v2

    const/4 v11, 0x0

    :goto_22
    const/16 v22, -0x1

    goto :goto_23

    :cond_29
    const/16 v21, 0x0

    goto :goto_22

    .line 125
    :goto_23
    invoke-interface/range {v17 .. v17}, Ll6/b;->h()I

    move-result v2

    move-object/from16 v23, v4

    .line 126
    iget-object v4, v9, Lm4/q;->n:Ljava/lang/String;

    move-object/from16 v24, v11

    iget v11, v9, Lm4/q;->E:I

    move-object/from16 v25, v9

    const/4 v9, -0x1

    if-eq v2, v9, :cond_2a

    .line 127
    const-string v9, "audio/raw"

    .line 128
    invoke-virtual {v9, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2b

    const-string v9, "audio/g711-mlaw"

    .line 129
    invoke-virtual {v9, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2b

    const-string v9, "audio/g711-alaw"

    .line 130
    invoke-virtual {v9, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2a

    goto :goto_24

    :cond_2a
    move-object/from16 v26, v3

    goto/16 :goto_29

    :cond_2b
    :goto_24
    if-nez v13, :cond_2a

    if-nez v20, :cond_2a

    if-nez v21, :cond_2a

    .line 131
    iget v4, v12, Ll6/a;->a:I

    new-array v9, v4, [J

    .line 132
    new-array v13, v4, [I

    .line 133
    :goto_25
    invoke-virtual {v12}, Ll6/a;->a()Z

    move-result v15

    if-eqz v15, :cond_2c

    .line 134
    iget v15, v12, Ll6/a;->b:I

    move/from16 v27, v2

    move-object/from16 v26, v3

    iget-wide v2, v12, Ll6/a;->d:J

    aput-wide v2, v9, v15

    .line 135
    iget v2, v12, Ll6/a;->c:I

    aput v2, v13, v15

    move-object/from16 v3, v26

    move/from16 v2, v27

    goto :goto_25

    :cond_2c
    move/from16 v27, v2

    move-object/from16 v26, v3

    int-to-long v2, v8

    const/16 v8, 0x2000

    .line 136
    div-int v8, v8, v27

    const/4 v12, 0x0

    const/4 v15, 0x0

    :goto_26
    if-ge v12, v4, :cond_2d

    move-wide/from16 v17, v2

    .line 137
    aget v2, v13, v12

    .line 138
    invoke-static {v2, v8}, Lp4/c0;->f(II)I

    move-result v2

    add-int/2addr v15, v2

    add-int/lit8 v12, v12, 0x1

    move-wide/from16 v2, v17

    goto :goto_26

    :cond_2d
    move-wide/from16 v17, v2

    .line 139
    new-array v2, v15, [J

    .line 140
    new-array v3, v15, [I

    .line 141
    new-array v12, v15, [J

    .line 142
    new-array v15, v15, [I

    move-object/from16 v19, v2

    move-object/from16 v20, v3

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    :goto_27
    if-ge v2, v4, :cond_2f

    .line 143
    aget v23, v13, v2

    .line 144
    aget-wide v28, v9, v2

    move/from16 v71, v22

    move/from16 v22, v2

    move/from16 v2, v21

    move/from16 v21, v71

    move/from16 v71, v23

    move/from16 v23, v4

    move/from16 v4, v71

    :goto_28
    if-lez v4, :cond_2e

    .line 145
    invoke-static {v8, v4}, Ljava/lang/Math;->min(II)I

    move-result v24

    .line 146
    aput-wide v28, v19, v21

    move/from16 v30, v4

    mul-int v4, v27, v24

    .line 147
    aput v4, v20, v21

    .line 148
    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    move/from16 v31, v8

    move-object v4, v9

    int-to-long v8, v3

    mul-long v8, v8, v17

    .line 149
    aput-wide v8, v12, v21

    const/16 v39, 0x1

    .line 150
    aput v39, v15, v21

    .line 151
    aget v8, v20, v21

    int-to-long v8, v8

    add-long v28, v28, v8

    add-int v3, v3, v24

    sub-int v8, v30, v24

    add-int/lit8 v21, v21, 0x1

    move-object v9, v4

    move v4, v8

    move/from16 v8, v31

    goto :goto_28

    :cond_2e
    move/from16 v31, v8

    move-object v4, v9

    add-int/lit8 v8, v22, 0x1

    move/from16 v22, v21

    move/from16 v4, v23

    move/from16 v21, v2

    move v2, v8

    move/from16 v8, v31

    goto :goto_27

    :cond_2f
    int-to-long v2, v3

    mul-long v2, v2, v17

    move/from16 v22, v0

    move-wide/from16 v45, v2

    move-wide/from16 v29, v6

    move-object/from16 v27, v10

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move/from16 v20, v21

    move/from16 v21, v11

    goto/16 :goto_36

    .line 152
    :goto_29
    new-array v2, v5, [J

    .line 153
    new-array v3, v5, [I

    .line 154
    new-array v4, v5, [J

    .line 155
    new-array v9, v5, [I

    move/from16 v1, v21

    move/from16 v21, v11

    move v11, v1

    move-wide/from16 v29, v6

    move-object/from16 v27, v10

    move v1, v15

    move-wide/from16 v31, v37

    move-wide/from16 v40, v31

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/16 v28, 0x0

    const/16 v34, 0x0

    move v15, v13

    move v13, v8

    move/from16 v8, v22

    move/from16 v22, v0

    const/4 v0, 0x0

    .line 156
    :goto_2a
    const-string v6, "BoxParsers"

    if-ge v0, v5, :cond_38

    const/16 v36, 0x1

    :goto_2b
    if-nez v28, :cond_30

    .line 157
    invoke-virtual {v12}, Ll6/a;->a()Z

    move-result v36

    if-eqz v36, :cond_30

    move-object/from16 v42, v14

    move/from16 v45, v15

    .line 158
    iget-wide v14, v12, Ll6/a;->d:J

    move/from16 v46, v5

    .line 159
    iget v5, v12, Ll6/a;->c:I

    move/from16 v28, v5

    move-wide/from16 v40, v14

    move-object/from16 v14, v42

    move/from16 v15, v45

    move/from16 v5, v46

    goto :goto_2b

    :cond_30
    move/from16 v46, v5

    move-object/from16 v42, v14

    move/from16 v45, v15

    if-nez v36, :cond_31

    .line 160
    const-string v5, "Unexpected end of chunk data"

    invoke-static {v6, v5}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v2

    .line 162
    invoke-static {v3, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    .line 163
    invoke-static {v4, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v4

    .line 164
    invoke-static {v9, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v5

    move-object v15, v5

    move v5, v0

    :goto_2c
    move-object v12, v4

    move/from16 v0, v28

    goto/16 :goto_30

    :cond_31
    if-eqz v23, :cond_33

    move/from16 v6, v34

    :goto_2d
    if-nez v6, :cond_32

    if-lez v20, :cond_32

    .line 165
    invoke-virtual/range {v23 .. v23}, Lp4/s;->y()I

    move-result v6

    .line 166
    invoke-virtual/range {v23 .. v23}, Lp4/s;->g()I

    move-result v10

    add-int/lit8 v20, v20, -0x1

    goto :goto_2d

    :cond_32
    add-int/lit8 v6, v6, -0x1

    move/from16 v34, v6

    .line 167
    :cond_33
    aput-wide v40, v2, v0

    .line 168
    invoke-interface/range {v17 .. v17}, Ll6/b;->o()I

    move-result v5

    aput v5, v3, v0

    if-le v5, v7, :cond_34

    move v7, v5

    :cond_34
    int-to-long v5, v10

    add-long v5, v31, v5

    .line 169
    aput-wide v5, v4, v0

    if-nez v24, :cond_35

    const/4 v5, 0x1

    goto :goto_2e

    :cond_35
    const/4 v5, 0x0

    .line 170
    :goto_2e
    aput v5, v9, v0

    if-ne v0, v8, :cond_36

    const/16 v39, 0x1

    .line 171
    aput v39, v9, v0

    add-int/lit8 v11, v11, -0x1

    if-lez v11, :cond_36

    .line 172
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    invoke-virtual/range {v24 .. v24}, Lp4/s;->y()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    move v8, v5

    :cond_36
    int-to-long v5, v13

    add-long v31, v31, v5

    add-int/lit8 v1, v1, -0x1

    if-nez v1, :cond_37

    if-lez v45, :cond_37

    .line 174
    invoke-virtual/range {v19 .. v19}, Lp4/s;->y()I

    move-result v1

    .line 175
    invoke-virtual/range {v19 .. v19}, Lp4/s;->g()I

    move-result v5

    add-int/lit8 v15, v45, -0x1

    move v13, v5

    goto :goto_2f

    :cond_37
    move/from16 v15, v45

    .line 176
    :goto_2f
    aget v5, v3, v0

    int-to-long v5, v5

    add-long v40, v40, v5

    add-int/lit8 v28, v28, -0x1

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v14, v42

    move/from16 v5, v46

    goto/16 :goto_2a

    :cond_38
    move/from16 v46, v5

    move-object/from16 v42, v14

    move/from16 v45, v15

    move-object v15, v9

    goto :goto_2c

    :goto_30
    int-to-long v8, v10

    add-long v8, v31, v8

    if-eqz v23, :cond_3a

    :goto_31
    if-lez v20, :cond_3a

    .line 177
    invoke-virtual/range {v23 .. v23}, Lp4/s;->y()I

    move-result v4

    if-eqz v4, :cond_39

    const/4 v4, 0x0

    goto :goto_32

    .line 178
    :cond_39
    invoke-virtual/range {v23 .. v23}, Lp4/s;->g()I

    add-int/lit8 v20, v20, -0x1

    goto :goto_31

    :cond_3a
    const/4 v4, 0x1

    :goto_32
    if-nez v11, :cond_3c

    if-nez v1, :cond_3c

    if-nez v0, :cond_3c

    if-nez v45, :cond_3c

    if-nez v34, :cond_3c

    if-nez v4, :cond_3b

    goto :goto_33

    :cond_3b
    move-object/from16 v14, v42

    goto :goto_35

    .line 179
    :cond_3c
    :goto_33
    new-instance v10, Ljava/lang/StringBuilder;

    const-string v13, "Inconsistent stbl box for track "

    invoke-direct {v10, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v14, v42

    iget v13, v14, Ll6/q;->a:I

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v13, ": remainingSynchronizationSamples "

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v11, ", remainingSamplesAtTimestampDelta "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", remainingSamplesInChunk "

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", remainingTimestampDeltaChanges "

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v13, v45

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", remainingSamplesAtTimestampOffset "

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v0, v34

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    if-nez v4, :cond_3d

    .line 180
    const-string v0, ", ctts invalid"

    goto :goto_34

    :cond_3d
    move-object/from16 v0, v18

    :goto_34
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 181
    invoke-static {v6, v0}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    :goto_35
    move-object/from16 v18, v2

    move-object/from16 v19, v3

    move/from16 v20, v7

    move-wide/from16 v45, v8

    .line 182
    :goto_36
    iget-wide v0, v14, Ll6/q;->c:J

    .line 183
    sget-object v53, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v47, 0xf4240

    move-wide/from16 v49, v0

    move-object/from16 v51, v53

    invoke-static/range {v45 .. v51}, Lp4/c0;->V(JJJLjava/math/RoundingMode;)J

    move-result-wide v23

    if-nez v27, :cond_3e

    move-wide/from16 v0, v29

    .line 184
    invoke-static {v12, v0, v1}, Lp4/c0;->U([JJ)V

    .line 185
    new-instance v16, Ll6/t;

    move-object/from16 v21, v12

    move-object/from16 v17, v14

    move-object/from16 v22, v15

    invoke-direct/range {v16 .. v24}, Ll6/t;-><init>(Ll6/q;[J[II[J[IJ)V

    :goto_37
    move-object/from16 v13, v16

    move-object/from16 v0, v26

    goto/16 :goto_1b

    :cond_3e
    move/from16 v3, v22

    move-object/from16 v2, v27

    move-wide/from16 v0, v29

    move-object/from16 v22, v15

    .line 186
    array-length v4, v2

    const/4 v6, 0x1

    if-ne v4, v6, :cond_40

    if-ne v3, v6, :cond_40

    array-length v4, v12

    const/4 v8, 0x2

    if-lt v4, v8, :cond_40

    .line 187
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x0

    .line 188
    aget-wide v7, v16, v4

    .line 189
    aget-wide v47, v2, v4

    iget-wide v9, v14, Ll6/q;->c:J

    move-wide/from16 v23, v7

    const/16 v39, 0x1

    iget-wide v6, v14, Ll6/q;->d:J

    move-wide/from16 v51, v6

    move-wide/from16 v49, v9

    .line 190
    invoke-static/range {v47 .. v53}, Lp4/c0;->V(JJJLjava/math/RoundingMode;)J

    move-result-wide v6

    add-long v6, v23, v6

    .line 191
    array-length v8, v12

    add-int/lit8 v8, v8, -0x1

    const/4 v9, 0x4

    .line 192
    invoke-static {v9, v4, v8}, Lp4/c0;->i(III)I

    move-result v10

    .line 193
    array-length v11, v12

    sub-int/2addr v11, v9

    .line 194
    invoke-static {v11, v4, v8}, Lp4/c0;->i(III)I

    move-result v8

    .line 195
    aget-wide v27, v12, v4

    cmp-long v4, v27, v23

    if-gtz v4, :cond_3f

    aget-wide v9, v12, v10

    cmp-long v4, v23, v9

    if-gez v4, :cond_3f

    aget-wide v8, v12, v8

    cmp-long v4, v8, v6

    if-gez v4, :cond_3f

    cmp-long v4, v6, v45

    if-gtz v4, :cond_3f

    const/4 v4, 0x1

    goto :goto_38

    :cond_3f
    const/4 v4, 0x0

    :goto_38
    if-eqz v4, :cond_40

    sub-long v6, v45, v6

    sub-long v47, v23, v27

    move/from16 v4, v21

    int-to-long v8, v4

    .line 196
    iget-wide v10, v14, Ll6/q;->c:J

    move-wide/from16 v49, v8

    move-wide/from16 v51, v10

    .line 197
    invoke-static/range {v47 .. v53}, Lp4/c0;->V(JJJLjava/math/RoundingMode;)J

    move-result-wide v8

    .line 198
    iget-wide v10, v14, Ll6/q;->c:J

    move-wide/from16 v47, v6

    move-wide/from16 v51, v10

    .line 199
    invoke-static/range {v47 .. v53}, Lp4/c0;->V(JJJLjava/math/RoundingMode;)J

    move-result-wide v6

    cmp-long v4, v8, v37

    if-nez v4, :cond_41

    cmp-long v4, v6, v37

    if-eqz v4, :cond_40

    goto :goto_39

    :cond_40
    move-object/from16 v4, p1

    goto :goto_3a

    :cond_41
    :goto_39
    const-wide/32 v10, 0x7fffffff

    cmp-long v4, v8, v10

    if-gtz v4, :cond_40

    cmp-long v4, v6, v10

    if-gtz v4, :cond_40

    long-to-int v3, v8

    move-object/from16 v4, p1

    .line 200
    iput v3, v4, Lr5/v;->a:I

    long-to-int v3, v6

    .line 201
    iput v3, v4, Lr5/v;->b:I

    .line 202
    invoke-static {v12, v0, v1}, Lp4/c0;->U([JJ)V

    const/16 v33, 0x0

    .line 203
    aget-wide v47, v2, v33

    const-wide/32 v49, 0xf4240

    iget-wide v0, v14, Ll6/q;->d:J

    move-wide/from16 v51, v0

    .line 204
    invoke-static/range {v47 .. v53}, Lp4/c0;->V(JJJLjava/math/RoundingMode;)J

    move-result-wide v23

    .line 205
    new-instance v16, Ll6/t;

    move-object/from16 v21, v12

    move-object/from16 v17, v14

    invoke-direct/range {v16 .. v24}, Ll6/t;-><init>(Ll6/q;[J[II[J[IJ)V

    goto/16 :goto_37

    .line 206
    :goto_3a
    array-length v0, v2

    const/4 v6, 0x1

    const/16 v33, 0x0

    if-ne v0, v6, :cond_44

    aget-wide v0, v2, v33

    cmp-long v6, v0, v37

    if-nez v6, :cond_43

    .line 207
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    aget-wide v0, v16, v33

    const/4 v2, 0x0

    .line 209
    :goto_3b
    array-length v3, v12

    if-ge v2, v3, :cond_42

    .line 210
    aget-wide v5, v12, v2

    sub-long v34, v5, v0

    iget-wide v5, v14, Ll6/q;->c:J

    .line 211
    sget-object v40, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v36, 0xf4240

    move-wide/from16 v38, v5

    invoke-static/range {v34 .. v40}, Lp4/c0;->V(JJJLjava/math/RoundingMode;)J

    move-result-wide v5

    .line 212
    aput-wide v5, v12, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3b

    :cond_42
    sub-long v5, v45, v0

    .line 213
    iget-wide v9, v14, Ll6/q;->c:J

    .line 214
    sget-object v11, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v7, 0xf4240

    invoke-static/range {v5 .. v11}, Lp4/c0;->V(JJJLjava/math/RoundingMode;)J

    move-result-wide v23

    .line 215
    new-instance v16, Ll6/t;

    move-object/from16 v21, v12

    move-object/from16 v17, v14

    invoke-direct/range {v16 .. v24}, Ll6/t;-><init>(Ll6/q;[J[II[J[IJ)V

    move-object/from16 v13, v16

    move-object/from16 v0, v26

    goto/16 :goto_49

    :cond_43
    const/4 v6, 0x1

    :cond_44
    move-object/from16 v0, v18

    move-object/from16 v1, v19

    move-object/from16 v15, v22

    if-ne v3, v6, :cond_45

    const/4 v6, 0x1

    goto :goto_3c

    :cond_45
    const/4 v6, 0x0

    .line 216
    :goto_3c
    array-length v7, v2

    new-array v7, v7, [I

    .line 217
    array-length v8, v2

    new-array v8, v8, [I

    .line 218
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    .line 219
    :goto_3d
    array-length v4, v2

    if-ge v9, v4, :cond_4a

    move-object v4, v7

    move-object/from16 v17, v8

    .line 220
    aget-wide v7, v16, v9

    const-wide/16 v18, -0x1

    cmp-long v21, v7, v18

    if-eqz v21, :cond_49

    .line 221
    aget-wide v45, v2, v9

    move/from16 v18, v9

    move/from16 v19, v10

    iget-wide v9, v14, Ll6/q;->c:J

    move-wide/from16 v47, v9

    iget-wide v9, v14, Ll6/q;->d:J

    .line 222
    sget-object v51, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    move-wide/from16 v49, v9

    invoke-static/range {v45 .. v51}, Lp4/c0;->V(JJJLjava/math/RoundingMode;)J

    move-result-wide v9

    move-object/from16 v21, v4

    const/4 v4, 0x1

    .line 223
    invoke-static {v12, v7, v8, v4}, Lp4/c0;->e([JJZ)I

    move-result v22

    aput v22, v21, v18

    .line 224
    :goto_3e
    aget v22, v21, v18

    if-ltz v22, :cond_46

    aget v23, v15, v22

    and-int/lit8 v23, v23, 0x1

    if-nez v23, :cond_46

    add-int/lit8 v22, v22, -0x1

    .line 225
    aput v22, v21, v18

    const/4 v4, 0x1

    goto :goto_3e

    :cond_46
    add-long/2addr v7, v9

    .line 226
    invoke-static {v12, v7, v8, v6}, Lp4/c0;->a([JJZ)I

    move-result v4

    aput v4, v17, v18

    const/4 v4, 0x2

    if-ne v3, v4, :cond_47

    .line 227
    :goto_3f
    aget v9, v17, v18

    array-length v10, v12

    const/16 v39, 0x1

    add-int/lit8 v10, v10, -0x1

    if-ge v9, v10, :cond_47

    add-int/lit8 v9, v9, 0x1

    aget-wide v22, v12, v9

    cmp-long v10, v22, v7

    if-gtz v10, :cond_47

    .line 228
    aput v9, v17, v18

    goto :goto_3f

    .line 229
    :cond_47
    aget v7, v17, v18

    aget v8, v21, v18

    sub-int v9, v7, v8

    add-int/2addr v9, v11

    if-eq v13, v8, :cond_48

    const/4 v8, 0x1

    goto :goto_40

    :cond_48
    const/4 v8, 0x0

    :goto_40
    or-int v8, v19, v8

    move v13, v7

    move v10, v8

    move v11, v9

    goto :goto_41

    :cond_49
    move-object/from16 v21, v4

    move/from16 v18, v9

    move/from16 v19, v10

    const/4 v4, 0x2

    :goto_41
    add-int/lit8 v9, v18, 0x1

    move-object/from16 v8, v17

    move-object/from16 v7, v21

    goto :goto_3d

    :cond_4a
    move-object/from16 v21, v7

    move-object/from16 v17, v8

    move/from16 v19, v10

    if-eq v11, v5, :cond_4b

    const/4 v5, 0x1

    goto :goto_42

    :cond_4b
    const/4 v5, 0x0

    :goto_42
    or-int v3, v19, v5

    if-eqz v3, :cond_4c

    .line 230
    new-array v4, v11, [J

    goto :goto_43

    :cond_4c
    move-object v4, v0

    :goto_43
    if-eqz v3, :cond_4d

    .line 231
    new-array v5, v11, [I

    goto :goto_44

    :cond_4d
    move-object v5, v1

    :goto_44
    if-eqz v3, :cond_4e

    const/16 v20, 0x0

    :cond_4e
    if-eqz v3, :cond_4f

    .line 232
    new-array v6, v11, [I

    goto :goto_45

    :cond_4f
    move-object v6, v15

    .line 233
    :goto_45
    new-array v7, v11, [J

    move/from16 v49, v20

    move-wide/from16 v50, v37

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 234
    :goto_46
    array-length v11, v2

    if-ge v8, v11, :cond_54

    .line 235
    aget-wide v18, v16, v8

    .line 236
    aget v11, v21, v8

    .line 237
    aget v13, v17, v8

    move-object/from16 v27, v2

    if-eqz v3, :cond_50

    sub-int v2, v13, v11

    .line 238
    invoke-static {v0, v11, v4, v10, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 239
    invoke-static {v1, v11, v5, v10, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 240
    invoke-static {v15, v11, v6, v10, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_50
    move/from16 v2, v49

    :goto_47
    if-ge v11, v13, :cond_53

    move-object/from16 v20, v0

    move-object/from16 v22, v1

    .line 241
    iget-wide v0, v14, Ll6/q;->d:J

    .line 242
    sget-object v56, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v52, 0xf4240

    move-wide/from16 v54, v0

    invoke-static/range {v50 .. v56}, Lp4/c0;->V(JJJLjava/math/RoundingMode;)J

    move-result-wide v0

    .line 243
    aget-wide v23, v12, v11

    sub-long v52, v23, v18

    const-wide/32 v54, 0xf4240

    move-wide/from16 v23, v0

    iget-wide v0, v14, Ll6/q;->c:J

    move-object/from16 v58, v56

    move-wide/from16 v56, v0

    .line 244
    invoke-static/range {v52 .. v58}, Lp4/c0;->V(JJJLjava/math/RoundingMode;)J

    move-result-wide v0

    cmp-long v28, v0, v37

    if-gez v28, :cond_51

    const/4 v9, 0x1

    :cond_51
    add-long v0, v23, v0

    .line 245
    aput-wide v0, v7, v10

    if-eqz v3, :cond_52

    .line 246
    aget v0, v5, v10

    if-le v0, v2, :cond_52

    .line 247
    aget v2, v22, v11

    :cond_52
    add-int/lit8 v10, v10, 0x1

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v0, v20

    move-object/from16 v1, v22

    goto :goto_47

    :cond_53
    move-object/from16 v20, v0

    move-object/from16 v22, v1

    .line 248
    aget-wide v0, v27, v8

    add-long v50, v50, v0

    add-int/lit8 v8, v8, 0x1

    move/from16 v49, v2

    move-object/from16 v0, v20

    move-object/from16 v1, v22

    move-object/from16 v2, v27

    goto :goto_46

    .line 249
    :cond_54
    iget-wide v0, v14, Ll6/q;->d:J

    .line 250
    sget-object v56, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v52, 0xf4240

    move-wide/from16 v54, v0

    invoke-static/range {v50 .. v56}, Lp4/c0;->V(JJJLjava/math/RoundingMode;)J

    move-result-wide v52

    if-eqz v9, :cond_55

    .line 251
    invoke-virtual/range {v25 .. v25}, Lm4/q;->a()Lm4/p;

    move-result-object v0

    const/4 v1, 0x1

    .line 252
    iput-boolean v1, v0, Lm4/p;->s:Z

    .line 253
    new-instance v1, Lm4/q;

    invoke-direct {v1, v0}, Lm4/q;-><init>(Lm4/p;)V

    .line 254
    new-instance v54, Ll6/q;

    iget v0, v14, Ll6/q;->a:I

    iget v2, v14, Ll6/q;->b:I

    iget-wide v8, v14, Ll6/q;->c:J

    iget-wide v10, v14, Ll6/q;->d:J

    iget-wide v12, v14, Ll6/q;->e:J

    move/from16 v55, v0

    move-object/from16 v65, v1

    iget-wide v0, v14, Ll6/q;->f:J

    iget v3, v14, Ll6/q;->h:I

    iget-object v15, v14, Ll6/q;->l:[Ll6/r;

    move-wide/from16 v63, v0

    iget v0, v14, Ll6/q;->k:I

    iget-object v1, v14, Ll6/q;->i:[J

    iget-object v14, v14, Ll6/q;->j:[J

    move/from16 v68, v0

    move-object/from16 v69, v1

    move/from16 v56, v2

    move/from16 v66, v3

    move-wide/from16 v57, v8

    move-wide/from16 v59, v10

    move-wide/from16 v61, v12

    move-object/from16 v70, v14

    move-object/from16 v67, v15

    invoke-direct/range {v54 .. v70}, Ll6/q;-><init>(IIJJJJLm4/q;I[Ll6/r;I[J[J)V

    move-object/from16 v46, v54

    goto :goto_48

    :cond_55
    move-object/from16 v46, v14

    .line 255
    :goto_48
    new-instance v45, Ll6/t;

    move-object/from16 v47, v4

    move-object/from16 v48, v5

    move-object/from16 v51, v6

    move-object/from16 v50, v7

    invoke-direct/range {v45 .. v53}, Ll6/t;-><init>(Ll6/q;[J[II[J[IJ)V

    move-object/from16 v0, v26

    move-object/from16 v13, v45

    .line 256
    :goto_49
    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_4a
    add-int/lit8 v5, v44, 0x1

    move-object v3, v0

    move-object/from16 v2, v43

    move-object/from16 v0, p0

    goto/16 :goto_0

    .line 257
    :cond_56
    const-string v0, "Track has no sample table size information"

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    move-result-object v0

    throw v0

    :cond_57
    const/4 v1, 0x0

    .line 258
    const-string v0, "Malformed sample table (stbl) missing sample description (stsd)"

    invoke-static {v1, v0}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    move-result-object v0

    throw v0

    :cond_58
    move-object v0, v3

    return-object v0
.end method

.method public static h(Lp4/s;IIIIILm4/n;Lce/g;I)V
    .locals 50

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p6

    .line 8
    .line 9
    move-object/from16 v4, p7

    .line 10
    .line 11
    add-int/lit8 v5, v1, 0x10

    .line 12
    .line 13
    invoke-virtual {v0, v5}, Lp4/s;->G(I)V

    .line 14
    .line 15
    .line 16
    const/16 v5, 0x10

    .line 17
    .line 18
    invoke-virtual {v0, v5}, Lp4/s;->H(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lp4/s;->A()I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    invoke-virtual {v0}, Lp4/s;->A()I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    const/16 v7, 0x32

    .line 30
    .line 31
    invoke-virtual {v0, v7}, Lp4/s;->H(I)V

    .line 32
    .line 33
    .line 34
    iget v7, v0, Lp4/s;->b:I

    .line 35
    .line 36
    const v8, 0x656e6376

    .line 37
    .line 38
    .line 39
    move/from16 v10, p1

    .line 40
    .line 41
    if-ne v10, v8, :cond_2

    .line 42
    .line 43
    invoke-static {v0, v1, v2}, Ll6/e;->e(Lp4/s;II)Landroid/util/Pair;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    if-eqz v8, :cond_1

    .line 48
    .line 49
    iget-object v10, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v10, Ljava/lang/Integer;

    .line 52
    .line 53
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v10

    .line 57
    if-nez v3, :cond_0

    .line 58
    .line 59
    const/4 v3, 0x0

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    iget-object v11, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v11, Ll6/r;

    .line 64
    .line 65
    iget-object v11, v11, Ll6/r;->b:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v3, v11}, Lm4/n;->a(Ljava/lang/String;)Lm4/n;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    :goto_0
    iget-object v11, v4, Lce/g;->d:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v11, [Ll6/r;

    .line 74
    .line 75
    iget-object v8, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v8, Ll6/r;

    .line 78
    .line 79
    aput-object v8, v11, p8

    .line 80
    .line 81
    :cond_1
    invoke-virtual {v0, v7}, Lp4/s;->G(I)V

    .line 82
    .line 83
    .line 84
    :cond_2
    const v8, 0x6d317620

    .line 85
    .line 86
    .line 87
    const-string v11, "video/3gpp"

    .line 88
    .line 89
    if-ne v10, v8, :cond_3

    .line 90
    .line 91
    const-string v8, "video/mpeg"

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    const v8, 0x48323633

    .line 95
    .line 96
    .line 97
    if-ne v10, v8, :cond_4

    .line 98
    .line 99
    move-object v8, v11

    .line 100
    goto :goto_1

    .line 101
    :cond_4
    const/4 v8, 0x0

    .line 102
    :goto_1
    const/high16 v14, 0x3f800000    # 1.0f

    .line 103
    .line 104
    const/4 v15, 0x0

    .line 105
    const/16 v16, 0x0

    .line 106
    .line 107
    const/16 v17, 0x0

    .line 108
    .line 109
    const/16 v18, -0x1

    .line 110
    .line 111
    const/16 v19, -0x1

    .line 112
    .line 113
    const/16 v20, -0x1

    .line 114
    .line 115
    const/16 v21, 0x0

    .line 116
    .line 117
    const/16 v22, 0x0

    .line 118
    .line 119
    const/16 v28, -0x1

    .line 120
    .line 121
    const/16 v29, -0x1

    .line 122
    .line 123
    const/16 v30, -0x1

    .line 124
    .line 125
    const/16 v31, 0x8

    .line 126
    .line 127
    const/16 v32, 0x8

    .line 128
    .line 129
    const/16 v33, 0x0

    .line 130
    .line 131
    const/16 v34, 0x0

    .line 132
    .line 133
    :goto_2
    sub-int v12, v7, v1

    .line 134
    .line 135
    if-ge v12, v2, :cond_5

    .line 136
    .line 137
    invoke-virtual {v0, v7}, Lp4/s;->G(I)V

    .line 138
    .line 139
    .line 140
    iget v12, v0, Lp4/s;->b:I

    .line 141
    .line 142
    invoke-virtual {v0}, Lp4/s;->g()I

    .line 143
    .line 144
    .line 145
    move-result v13

    .line 146
    if-nez v13, :cond_6

    .line 147
    .line 148
    iget v9, v0, Lp4/s;->b:I

    .line 149
    .line 150
    sub-int/2addr v9, v1

    .line 151
    if-ne v9, v2, :cond_6

    .line 152
    .line 153
    :cond_5
    move-object/from16 v38, v3

    .line 154
    .line 155
    move-object/from16 v37, v15

    .line 156
    .line 157
    move/from16 v43, v18

    .line 158
    .line 159
    move/from16 v7, v28

    .line 160
    .line 161
    move/from16 v27, v29

    .line 162
    .line 163
    move/from16 v12, v30

    .line 164
    .line 165
    move/from16 v26, v31

    .line 166
    .line 167
    move/from16 v28, v32

    .line 168
    .line 169
    move-object/from16 v31, v8

    .line 170
    .line 171
    goto/16 :goto_4a

    .line 172
    .line 173
    :cond_6
    if-lez v13, :cond_7

    .line 174
    .line 175
    const/4 v9, 0x1

    .line 176
    goto :goto_3

    .line 177
    :cond_7
    const/4 v9, 0x0

    .line 178
    :goto_3
    const-string v1, "childAtomSize must be positive"

    .line 179
    .line 180
    invoke-static {v1, v9}, Lr5/b;->c(Ljava/lang/String;Z)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0}, Lp4/s;->g()I

    .line 184
    .line 185
    .line 186
    move-result v9

    .line 187
    const v2, 0x61766343

    .line 188
    .line 189
    .line 190
    if-ne v9, v2, :cond_a

    .line 191
    .line 192
    if-nez v8, :cond_8

    .line 193
    .line 194
    const/4 v1, 0x1

    .line 195
    :goto_4
    const/4 v2, 0x0

    .line 196
    goto :goto_5

    .line 197
    :cond_8
    const/4 v1, 0x0

    .line 198
    goto :goto_4

    .line 199
    :goto_5
    invoke-static {v2, v1}, Lr5/b;->c(Ljava/lang/String;Z)V

    .line 200
    .line 201
    .line 202
    add-int/lit8 v12, v12, 0x8

    .line 203
    .line 204
    invoke-virtual {v0, v12}, Lp4/s;->G(I)V

    .line 205
    .line 206
    .line 207
    invoke-static {v0}, Lr5/d;->a(Lp4/s;)Lr5/d;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    iget-object v15, v1, Lr5/d;->a:Ljava/util/ArrayList;

    .line 212
    .line 213
    iget v2, v1, Lr5/d;->b:I

    .line 214
    .line 215
    iput v2, v4, Lce/g;->b:I

    .line 216
    .line 217
    if-nez v22, :cond_9

    .line 218
    .line 219
    iget v14, v1, Lr5/d;->k:F

    .line 220
    .line 221
    :cond_9
    iget-object v2, v1, Lr5/d;->l:Ljava/lang/String;

    .line 222
    .line 223
    iget v8, v1, Lr5/d;->j:I

    .line 224
    .line 225
    iget v9, v1, Lr5/d;->g:I

    .line 226
    .line 227
    iget v12, v1, Lr5/d;->h:I

    .line 228
    .line 229
    move-object/from16 v16, v2

    .line 230
    .line 231
    iget v2, v1, Lr5/d;->i:I

    .line 232
    .line 233
    move/from16 v19, v2

    .line 234
    .line 235
    iget v2, v1, Lr5/d;->e:I

    .line 236
    .line 237
    iget v1, v1, Lr5/d;->f:I

    .line 238
    .line 239
    const-string v24, "video/avc"

    .line 240
    .line 241
    move/from16 v31, v2

    .line 242
    .line 243
    move-object/from16 v38, v3

    .line 244
    .line 245
    move/from16 v25, v7

    .line 246
    .line 247
    move/from16 v28, v9

    .line 248
    .line 249
    move/from16 v32, v10

    .line 250
    .line 251
    move-object/from16 v29, v11

    .line 252
    .line 253
    move/from16 v27, v12

    .line 254
    .line 255
    move/from16 v30, v19

    .line 256
    .line 257
    const/16 v10, 0x8

    .line 258
    .line 259
    move v11, v1

    .line 260
    move/from16 v19, v8

    .line 261
    .line 262
    move-object/from16 v8, v24

    .line 263
    .line 264
    :goto_6
    const/4 v1, -0x1

    .line 265
    goto/16 :goto_49

    .line 266
    .line 267
    :cond_a
    const v2, 0x68766343

    .line 268
    .line 269
    .line 270
    move/from16 v25, v7

    .line 271
    .line 272
    const-string v7, "video/hevc"

    .line 273
    .line 274
    if-ne v9, v2, :cond_e

    .line 275
    .line 276
    if-nez v8, :cond_b

    .line 277
    .line 278
    const/4 v1, 0x1

    .line 279
    :goto_7
    const/4 v2, 0x0

    .line 280
    goto :goto_8

    .line 281
    :cond_b
    const/4 v1, 0x0

    .line 282
    goto :goto_7

    .line 283
    :goto_8
    invoke-static {v2, v1}, Lr5/b;->c(Ljava/lang/String;Z)V

    .line 284
    .line 285
    .line 286
    add-int/lit8 v12, v12, 0x8

    .line 287
    .line 288
    invoke-virtual {v0, v12}, Lp4/s;->G(I)V

    .line 289
    .line 290
    .line 291
    const/4 v1, 0x0

    .line 292
    invoke-static {v0, v1, v2}, Lr5/w;->a(Lp4/s;ZLb0/w1;)Lr5/w;

    .line 293
    .line 294
    .line 295
    move-result-object v8

    .line 296
    iget-object v15, v8, Lr5/w;->a:Ljava/util/List;

    .line 297
    .line 298
    iget v1, v8, Lr5/w;->b:I

    .line 299
    .line 300
    iput v1, v4, Lce/g;->b:I

    .line 301
    .line 302
    if-nez v22, :cond_c

    .line 303
    .line 304
    iget v14, v8, Lr5/w;->j:F

    .line 305
    .line 306
    :cond_c
    iget v1, v8, Lr5/w;->k:I

    .line 307
    .line 308
    iget v2, v8, Lr5/w;->c:I

    .line 309
    .line 310
    iget-object v9, v8, Lr5/w;->l:Ljava/lang/String;

    .line 311
    .line 312
    iget v12, v8, Lr5/w;->i:I

    .line 313
    .line 314
    move/from16 v16, v1

    .line 315
    .line 316
    const/4 v1, -0x1

    .line 317
    if-eq v12, v1, :cond_d

    .line 318
    .line 319
    move/from16 v18, v12

    .line 320
    .line 321
    :cond_d
    iget v1, v8, Lr5/w;->f:I

    .line 322
    .line 323
    iget v12, v8, Lr5/w;->g:I

    .line 324
    .line 325
    move/from16 v19, v1

    .line 326
    .line 327
    iget v1, v8, Lr5/w;->h:I

    .line 328
    .line 329
    move/from16 v20, v1

    .line 330
    .line 331
    iget v1, v8, Lr5/w;->d:I

    .line 332
    .line 333
    move/from16 v24, v1

    .line 334
    .line 335
    iget v1, v8, Lr5/w;->e:I

    .line 336
    .line 337
    iget-object v8, v8, Lr5/w;->m:Lb0/w1;

    .line 338
    .line 339
    move-object/from16 v38, v3

    .line 340
    .line 341
    move-object/from16 v34, v8

    .line 342
    .line 343
    move/from16 v32, v10

    .line 344
    .line 345
    move-object/from16 v29, v11

    .line 346
    .line 347
    move/from16 v27, v12

    .line 348
    .line 349
    move/from16 v28, v19

    .line 350
    .line 351
    move/from16 v30, v20

    .line 352
    .line 353
    move/from16 v31, v24

    .line 354
    .line 355
    const/16 v10, 0x8

    .line 356
    .line 357
    move v11, v1

    .line 358
    move/from16 v20, v2

    .line 359
    .line 360
    move-object v8, v7

    .line 361
    move/from16 v19, v16

    .line 362
    .line 363
    const/4 v1, -0x1

    .line 364
    move-object/from16 v16, v9

    .line 365
    .line 366
    goto/16 :goto_49

    .line 367
    .line 368
    :cond_e
    const v2, 0x6c687643

    .line 369
    .line 370
    .line 371
    move-object/from16 v26, v11

    .line 372
    .line 373
    const/4 v11, 0x2

    .line 374
    if-ne v9, v2, :cond_1a

    .line 375
    .line 376
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result v1

    .line 380
    const-string v2, "lhvC must follow hvcC atom"

    .line 381
    .line 382
    invoke-static {v2, v1}, Lr5/b;->c(Ljava/lang/String;Z)V

    .line 383
    .line 384
    .line 385
    move-object/from16 v2, v34

    .line 386
    .line 387
    if-eqz v2, :cond_f

    .line 388
    .line 389
    iget-object v1, v2, Lb0/w1;->c:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v1, Lya/i0;

    .line 392
    .line 393
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 394
    .line 395
    .line 396
    move-result v1

    .line 397
    if-lt v1, v11, :cond_f

    .line 398
    .line 399
    const/4 v1, 0x1

    .line 400
    goto :goto_9

    .line 401
    :cond_f
    const/4 v1, 0x0

    .line 402
    :goto_9
    const-string v7, "must have at least two layers"

    .line 403
    .line 404
    invoke-static {v7, v1}, Lr5/b;->c(Ljava/lang/String;Z)V

    .line 405
    .line 406
    .line 407
    add-int/lit8 v12, v12, 0x8

    .line 408
    .line 409
    invoke-virtual {v0, v12}, Lp4/s;->G(I)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 413
    .line 414
    .line 415
    const/4 v1, 0x1

    .line 416
    invoke-static {v0, v1, v2}, Lr5/w;->a(Lp4/s;ZLb0/w1;)Lr5/w;

    .line 417
    .line 418
    .line 419
    move-result-object v7

    .line 420
    iget v1, v4, Lce/g;->b:I

    .line 421
    .line 422
    iget v8, v7, Lr5/w;->b:I

    .line 423
    .line 424
    if-ne v1, v8, :cond_10

    .line 425
    .line 426
    const/4 v1, 0x1

    .line 427
    goto :goto_a

    .line 428
    :cond_10
    const/4 v1, 0x0

    .line 429
    :goto_a
    const-string v8, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms"

    .line 430
    .line 431
    invoke-static {v8, v1}, Lr5/b;->c(Ljava/lang/String;Z)V

    .line 432
    .line 433
    .line 434
    iget v1, v7, Lr5/w;->f:I

    .line 435
    .line 436
    const/4 v8, -0x1

    .line 437
    move/from16 v9, v28

    .line 438
    .line 439
    if-eq v1, v8, :cond_12

    .line 440
    .line 441
    if-ne v9, v1, :cond_11

    .line 442
    .line 443
    const/4 v1, 0x1

    .line 444
    goto :goto_b

    .line 445
    :cond_11
    const/4 v1, 0x0

    .line 446
    :goto_b
    const-string v11, "colorSpace must be the same for both views"

    .line 447
    .line 448
    invoke-static {v11, v1}, Lr5/b;->c(Ljava/lang/String;Z)V

    .line 449
    .line 450
    .line 451
    :cond_12
    iget v1, v7, Lr5/w;->g:I

    .line 452
    .line 453
    move/from16 v11, v29

    .line 454
    .line 455
    if-eq v1, v8, :cond_14

    .line 456
    .line 457
    if-ne v11, v1, :cond_13

    .line 458
    .line 459
    const/4 v1, 0x1

    .line 460
    goto :goto_c

    .line 461
    :cond_13
    const/4 v1, 0x0

    .line 462
    :goto_c
    const-string v12, "colorRange must be the same for both views"

    .line 463
    .line 464
    invoke-static {v12, v1}, Lr5/b;->c(Ljava/lang/String;Z)V

    .line 465
    .line 466
    .line 467
    :cond_14
    iget v1, v7, Lr5/w;->h:I

    .line 468
    .line 469
    if-eq v1, v8, :cond_16

    .line 470
    .line 471
    move/from16 v8, v30

    .line 472
    .line 473
    if-ne v8, v1, :cond_15

    .line 474
    .line 475
    const/4 v1, 0x1

    .line 476
    goto :goto_d

    .line 477
    :cond_15
    const/4 v1, 0x0

    .line 478
    :goto_d
    const-string v12, "colorTransfer must be the same for both views"

    .line 479
    .line 480
    invoke-static {v12, v1}, Lr5/b;->c(Ljava/lang/String;Z)V

    .line 481
    .line 482
    .line 483
    goto :goto_e

    .line 484
    :cond_16
    move/from16 v8, v30

    .line 485
    .line 486
    :goto_e
    iget v1, v7, Lr5/w;->d:I

    .line 487
    .line 488
    move/from16 v12, v31

    .line 489
    .line 490
    if-ne v12, v1, :cond_17

    .line 491
    .line 492
    const/4 v1, 0x1

    .line 493
    :goto_f
    move/from16 v16, v8

    .line 494
    .line 495
    goto :goto_10

    .line 496
    :cond_17
    const/4 v1, 0x0

    .line 497
    goto :goto_f

    .line 498
    :goto_10
    const-string v8, "bitdepthLuma must be the same for both views"

    .line 499
    .line 500
    invoke-static {v8, v1}, Lr5/b;->c(Ljava/lang/String;Z)V

    .line 501
    .line 502
    .line 503
    iget v1, v7, Lr5/w;->e:I

    .line 504
    .line 505
    move/from16 v8, v32

    .line 506
    .line 507
    if-ne v8, v1, :cond_18

    .line 508
    .line 509
    const/4 v1, 0x1

    .line 510
    :goto_11
    move/from16 v27, v8

    .line 511
    .line 512
    goto :goto_12

    .line 513
    :cond_18
    const/4 v1, 0x0

    .line 514
    goto :goto_11

    .line 515
    :goto_12
    const-string v8, "bitdepthChroma must be the same for both views"

    .line 516
    .line 517
    invoke-static {v8, v1}, Lr5/b;->c(Ljava/lang/String;Z)V

    .line 518
    .line 519
    .line 520
    if-eqz v15, :cond_19

    .line 521
    .line 522
    invoke-static {}, Lya/i0;->p()Lya/f0;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    invoke-virtual {v1, v15}, Lya/c0;->c(Ljava/lang/Iterable;)V

    .line 527
    .line 528
    .line 529
    iget-object v8, v7, Lr5/w;->a:Ljava/util/List;

    .line 530
    .line 531
    invoke-virtual {v1, v8}, Lya/c0;->c(Ljava/lang/Iterable;)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v1}, Lya/f0;->f()Lya/a1;

    .line 535
    .line 536
    .line 537
    move-result-object v15

    .line 538
    goto :goto_13

    .line 539
    :cond_19
    const-string v1, "initializationData must be already set from hvcC atom"

    .line 540
    .line 541
    const/4 v8, 0x0

    .line 542
    invoke-static {v1, v8}, Lr5/b;->c(Ljava/lang/String;Z)V

    .line 543
    .line 544
    .line 545
    :goto_13
    iget-object v1, v7, Lr5/w;->l:Ljava/lang/String;

    .line 546
    .line 547
    const-string v7, "video/mv-hevc"

    .line 548
    .line 549
    move/from16 v8, v27

    .line 550
    .line 551
    move/from16 v27, v11

    .line 552
    .line 553
    move v11, v8

    .line 554
    move-object/from16 v34, v2

    .line 555
    .line 556
    move-object/from16 v38, v3

    .line 557
    .line 558
    move-object v8, v7

    .line 559
    move/from16 v28, v9

    .line 560
    .line 561
    move/from16 v32, v10

    .line 562
    .line 563
    move/from16 v31, v12

    .line 564
    .line 565
    move/from16 v30, v16

    .line 566
    .line 567
    move-object/from16 v29, v26

    .line 568
    .line 569
    const/16 v10, 0x8

    .line 570
    .line 571
    move-object/from16 v16, v1

    .line 572
    .line 573
    goto/16 :goto_6

    .line 574
    .line 575
    :cond_1a
    move/from16 v7, v28

    .line 576
    .line 577
    move/from16 v27, v29

    .line 578
    .line 579
    move/from16 v35, v30

    .line 580
    .line 581
    move/from16 v28, v32

    .line 582
    .line 583
    move-object/from16 v2, v34

    .line 584
    .line 585
    move-object/from16 v29, v26

    .line 586
    .line 587
    move/from16 v26, v31

    .line 588
    .line 589
    const v11, 0x76657875

    .line 590
    .line 591
    .line 592
    move-object/from16 v31, v8

    .line 593
    .line 594
    const/16 v32, 0x5

    .line 595
    .line 596
    if-ne v9, v11, :cond_2a

    .line 597
    .line 598
    add-int/lit8 v9, v12, 0x8

    .line 599
    .line 600
    invoke-virtual {v0, v9}, Lp4/s;->G(I)V

    .line 601
    .line 602
    .line 603
    iget v9, v0, Lp4/s;->b:I

    .line 604
    .line 605
    const/4 v11, 0x0

    .line 606
    :goto_14
    sub-int v8, v9, v12

    .line 607
    .line 608
    if-ge v8, v13, :cond_23

    .line 609
    .line 610
    invoke-virtual {v0, v9}, Lp4/s;->G(I)V

    .line 611
    .line 612
    .line 613
    invoke-virtual {v0}, Lp4/s;->g()I

    .line 614
    .line 615
    .line 616
    move-result v8

    .line 617
    move/from16 v36, v9

    .line 618
    .line 619
    if-lez v8, :cond_1b

    .line 620
    .line 621
    const/4 v9, 0x1

    .line 622
    goto :goto_15

    .line 623
    :cond_1b
    const/4 v9, 0x0

    .line 624
    :goto_15
    invoke-static {v1, v9}, Lr5/b;->c(Ljava/lang/String;Z)V

    .line 625
    .line 626
    .line 627
    invoke-virtual {v0}, Lp4/s;->g()I

    .line 628
    .line 629
    .line 630
    move-result v9

    .line 631
    const v4, 0x65796573

    .line 632
    .line 633
    .line 634
    if-ne v9, v4, :cond_22

    .line 635
    .line 636
    add-int/lit8 v9, v36, 0x8

    .line 637
    .line 638
    invoke-virtual {v0, v9}, Lp4/s;->G(I)V

    .line 639
    .line 640
    .line 641
    iget v4, v0, Lp4/s;->b:I

    .line 642
    .line 643
    :goto_16
    sub-int v9, v4, v36

    .line 644
    .line 645
    if-ge v9, v8, :cond_21

    .line 646
    .line 647
    invoke-virtual {v0, v4}, Lp4/s;->G(I)V

    .line 648
    .line 649
    .line 650
    invoke-virtual {v0}, Lp4/s;->g()I

    .line 651
    .line 652
    .line 653
    move-result v9

    .line 654
    if-lez v9, :cond_1c

    .line 655
    .line 656
    const/4 v11, 0x1

    .line 657
    goto :goto_17

    .line 658
    :cond_1c
    const/4 v11, 0x0

    .line 659
    :goto_17
    invoke-static {v1, v11}, Lr5/b;->c(Ljava/lang/String;Z)V

    .line 660
    .line 661
    .line 662
    invoke-virtual {v0}, Lp4/s;->g()I

    .line 663
    .line 664
    .line 665
    move-result v11

    .line 666
    move-object/from16 v37, v1

    .line 667
    .line 668
    const v1, 0x73747269

    .line 669
    .line 670
    .line 671
    if-ne v11, v1, :cond_20

    .line 672
    .line 673
    const/4 v1, 0x4

    .line 674
    invoke-virtual {v0, v1}, Lp4/s;->H(I)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v0}, Lp4/s;->u()I

    .line 678
    .line 679
    .line 680
    move-result v1

    .line 681
    new-instance v4, Li7/p2;

    .line 682
    .line 683
    new-instance v9, Ll6/c;

    .line 684
    .line 685
    and-int/lit8 v11, v1, 0x1

    .line 686
    .line 687
    move/from16 v38, v1

    .line 688
    .line 689
    const/4 v1, 0x1

    .line 690
    if-ne v11, v1, :cond_1d

    .line 691
    .line 692
    const/4 v1, 0x1

    .line 693
    goto :goto_18

    .line 694
    :cond_1d
    const/4 v1, 0x0

    .line 695
    :goto_18
    and-int/lit8 v11, v38, 0x2

    .line 696
    .line 697
    move/from16 v39, v8

    .line 698
    .line 699
    const/4 v8, 0x2

    .line 700
    if-ne v11, v8, :cond_1e

    .line 701
    .line 702
    const/4 v8, 0x1

    .line 703
    goto :goto_19

    .line 704
    :cond_1e
    const/4 v8, 0x0

    .line 705
    :goto_19
    and-int/lit8 v11, v38, 0x8

    .line 706
    .line 707
    move-object/from16 v38, v3

    .line 708
    .line 709
    const/16 v3, 0x8

    .line 710
    .line 711
    if-ne v11, v3, :cond_1f

    .line 712
    .line 713
    const/4 v3, 0x1

    .line 714
    goto :goto_1a

    .line 715
    :cond_1f
    const/4 v3, 0x0

    .line 716
    :goto_1a
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 717
    .line 718
    .line 719
    iput-boolean v1, v9, Ll6/c;->a:Z

    .line 720
    .line 721
    iput-boolean v8, v9, Ll6/c;->b:Z

    .line 722
    .line 723
    iput-boolean v3, v9, Ll6/c;->c:Z

    .line 724
    .line 725
    invoke-direct {v4, v9}, Li7/p2;-><init>(Ljava/lang/Object;)V

    .line 726
    .line 727
    .line 728
    goto :goto_1b

    .line 729
    :cond_20
    move-object/from16 v38, v3

    .line 730
    .line 731
    move/from16 v39, v8

    .line 732
    .line 733
    add-int/2addr v4, v9

    .line 734
    move-object/from16 v1, v37

    .line 735
    .line 736
    goto :goto_16

    .line 737
    :cond_21
    move-object/from16 v37, v1

    .line 738
    .line 739
    move-object/from16 v38, v3

    .line 740
    .line 741
    move/from16 v39, v8

    .line 742
    .line 743
    const/4 v4, 0x0

    .line 744
    :goto_1b
    move-object v11, v4

    .line 745
    goto :goto_1c

    .line 746
    :cond_22
    move-object/from16 v37, v1

    .line 747
    .line 748
    move-object/from16 v38, v3

    .line 749
    .line 750
    move/from16 v39, v8

    .line 751
    .line 752
    :goto_1c
    add-int v9, v36, v39

    .line 753
    .line 754
    move-object/from16 v4, p7

    .line 755
    .line 756
    move-object/from16 v1, v37

    .line 757
    .line 758
    move-object/from16 v3, v38

    .line 759
    .line 760
    goto/16 :goto_14

    .line 761
    .line 762
    :cond_23
    move-object/from16 v38, v3

    .line 763
    .line 764
    if-nez v11, :cond_24

    .line 765
    .line 766
    const/4 v1, 0x0

    .line 767
    goto :goto_1d

    .line 768
    :cond_24
    new-instance v1, Li7/p2;

    .line 769
    .line 770
    invoke-direct {v1, v11}, Li7/p2;-><init>(Ljava/lang/Object;)V

    .line 771
    .line 772
    .line 773
    :goto_1d
    if-eqz v1, :cond_26

    .line 774
    .line 775
    iget-object v1, v1, Li7/p2;->a:Ljava/lang/Object;

    .line 776
    .line 777
    check-cast v1, Li7/p2;

    .line 778
    .line 779
    iget-object v1, v1, Li7/p2;->a:Ljava/lang/Object;

    .line 780
    .line 781
    check-cast v1, Ll6/c;

    .line 782
    .line 783
    if-eqz v2, :cond_27

    .line 784
    .line 785
    iget-object v3, v2, Lb0/w1;->c:Ljava/lang/Object;

    .line 786
    .line 787
    check-cast v3, Lya/i0;

    .line 788
    .line 789
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    .line 790
    .line 791
    .line 792
    move-result v3

    .line 793
    const/4 v8, 0x2

    .line 794
    if-lt v3, v8, :cond_27

    .line 795
    .line 796
    iget-boolean v3, v1, Ll6/c;->a:Z

    .line 797
    .line 798
    if-eqz v3, :cond_25

    .line 799
    .line 800
    iget-boolean v3, v1, Ll6/c;->b:Z

    .line 801
    .line 802
    if-eqz v3, :cond_25

    .line 803
    .line 804
    const/4 v3, 0x1

    .line 805
    goto :goto_1e

    .line 806
    :cond_25
    const/4 v3, 0x0

    .line 807
    :goto_1e
    const-string v4, "both eye views must be marked as available"

    .line 808
    .line 809
    invoke-static {v4, v3}, Lr5/b;->c(Ljava/lang/String;Z)V

    .line 810
    .line 811
    .line 812
    iget-boolean v1, v1, Ll6/c;->c:Z

    .line 813
    .line 814
    const/16 v24, 0x1

    .line 815
    .line 816
    xor-int/lit8 v1, v1, 0x1

    .line 817
    .line 818
    const-string v3, "for MV-HEVC, eye_views_reversed must be set to false"

    .line 819
    .line 820
    invoke-static {v3, v1}, Lr5/b;->c(Ljava/lang/String;Z)V

    .line 821
    .line 822
    .line 823
    :cond_26
    move/from16 v3, v18

    .line 824
    .line 825
    goto :goto_1f

    .line 826
    :cond_27
    move/from16 v3, v18

    .line 827
    .line 828
    const/4 v8, -0x1

    .line 829
    if-ne v3, v8, :cond_29

    .line 830
    .line 831
    iget-boolean v1, v1, Ll6/c;->c:Z

    .line 832
    .line 833
    if-eqz v1, :cond_28

    .line 834
    .line 835
    const/16 v18, 0x5

    .line 836
    .line 837
    goto :goto_20

    .line 838
    :cond_28
    const/16 v18, 0x4

    .line 839
    .line 840
    goto :goto_20

    .line 841
    :cond_29
    :goto_1f
    move/from16 v18, v3

    .line 842
    .line 843
    :goto_20
    move-object/from16 v34, v2

    .line 844
    .line 845
    :goto_21
    move/from16 v32, v10

    .line 846
    .line 847
    move/from16 v11, v28

    .line 848
    .line 849
    move-object/from16 v8, v31

    .line 850
    .line 851
    move/from16 v30, v35

    .line 852
    .line 853
    :goto_22
    const/4 v1, -0x1

    .line 854
    const/16 v10, 0x8

    .line 855
    .line 856
    :goto_23
    move/from16 v28, v7

    .line 857
    .line 858
    :goto_24
    move/from16 v31, v26

    .line 859
    .line 860
    goto/16 :goto_49

    .line 861
    .line 862
    :cond_2a
    move-object/from16 v38, v3

    .line 863
    .line 864
    move/from16 v3, v18

    .line 865
    .line 866
    const v1, 0x64766343

    .line 867
    .line 868
    .line 869
    if-eq v9, v1, :cond_2b

    .line 870
    .line 871
    const v1, 0x64767643

    .line 872
    .line 873
    .line 874
    if-ne v9, v1, :cond_2c

    .line 875
    .line 876
    :cond_2b
    move-object/from16 v18, v2

    .line 877
    .line 878
    move/from16 v43, v3

    .line 879
    .line 880
    move/from16 v32, v10

    .line 881
    .line 882
    move-object/from16 v37, v15

    .line 883
    .line 884
    move/from16 v12, v35

    .line 885
    .line 886
    const/4 v1, -0x1

    .line 887
    const/16 v10, 0x8

    .line 888
    .line 889
    goto/16 :goto_47

    .line 890
    .line 891
    :cond_2c
    const v1, 0x76706343

    .line 892
    .line 893
    .line 894
    const/16 v18, 0xa

    .line 895
    .line 896
    const/16 v36, 0xb

    .line 897
    .line 898
    const/16 v4, 0xc

    .line 899
    .line 900
    const/16 v37, 0x7

    .line 901
    .line 902
    if-ne v9, v1, :cond_32

    .line 903
    .line 904
    if-nez v31, :cond_2d

    .line 905
    .line 906
    const/4 v1, 0x1

    .line 907
    :goto_25
    const/4 v7, 0x0

    .line 908
    goto :goto_26

    .line 909
    :cond_2d
    const/4 v1, 0x0

    .line 910
    goto :goto_25

    .line 911
    :goto_26
    invoke-static {v7, v1}, Lr5/b;->c(Ljava/lang/String;Z)V

    .line 912
    .line 913
    .line 914
    const v1, 0x76703038

    .line 915
    .line 916
    .line 917
    const-string v7, "video/x-vnd.on2.vp9"

    .line 918
    .line 919
    if-ne v10, v1, :cond_2e

    .line 920
    .line 921
    const-string v1, "video/x-vnd.on2.vp8"

    .line 922
    .line 923
    goto :goto_27

    .line 924
    :cond_2e
    move-object v1, v7

    .line 925
    :goto_27
    add-int/lit8 v12, v12, 0xc

    .line 926
    .line 927
    invoke-virtual {v0, v12}, Lp4/s;->G(I)V

    .line 928
    .line 929
    .line 930
    invoke-virtual {v0}, Lp4/s;->u()I

    .line 931
    .line 932
    .line 933
    move-result v9

    .line 934
    int-to-byte v9, v9

    .line 935
    invoke-virtual {v0}, Lp4/s;->u()I

    .line 936
    .line 937
    .line 938
    move-result v12

    .line 939
    int-to-byte v12, v12

    .line 940
    invoke-virtual {v0}, Lp4/s;->u()I

    .line 941
    .line 942
    .line 943
    move-result v26

    .line 944
    const/16 v39, 0x6

    .line 945
    .line 946
    shr-int/lit8 v11, v26, 0x4

    .line 947
    .line 948
    shr-int/lit8 v27, v26, 0x1

    .line 949
    .line 950
    const/16 v40, 0x3

    .line 951
    .line 952
    and-int/lit8 v8, v27, 0x7

    .line 953
    .line 954
    int-to-byte v8, v8

    .line 955
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 956
    .line 957
    .line 958
    move-result v7

    .line 959
    if-eqz v7, :cond_2f

    .line 960
    .line 961
    int-to-byte v7, v11

    .line 962
    sget-object v15, Lp4/d;->a:[B

    .line 963
    .line 964
    new-array v4, v4, [B

    .line 965
    .line 966
    const/4 v15, 0x0

    .line 967
    const/16 v24, 0x1

    .line 968
    .line 969
    aput-byte v24, v4, v15

    .line 970
    .line 971
    aput-byte v24, v4, v24

    .line 972
    .line 973
    const/16 v30, 0x2

    .line 974
    .line 975
    aput-byte v9, v4, v30

    .line 976
    .line 977
    aput-byte v30, v4, v40

    .line 978
    .line 979
    const/16 v34, 0x4

    .line 980
    .line 981
    aput-byte v24, v4, v34

    .line 982
    .line 983
    aput-byte v12, v4, v32

    .line 984
    .line 985
    aput-byte v40, v4, v39

    .line 986
    .line 987
    aput-byte v24, v4, v37

    .line 988
    .line 989
    const/16 v9, 0x8

    .line 990
    .line 991
    aput-byte v7, v4, v9

    .line 992
    .line 993
    const/16 v7, 0x9

    .line 994
    .line 995
    aput-byte v34, v4, v7

    .line 996
    .line 997
    aput-byte v24, v4, v18

    .line 998
    .line 999
    aput-byte v8, v4, v36

    .line 1000
    .line 1001
    invoke-static {v4}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v15

    .line 1005
    :cond_2f
    and-int/lit8 v4, v26, 0x1

    .line 1006
    .line 1007
    if-eqz v4, :cond_30

    .line 1008
    .line 1009
    const/4 v4, 0x1

    .line 1010
    goto :goto_28

    .line 1011
    :cond_30
    const/4 v4, 0x0

    .line 1012
    :goto_28
    invoke-virtual {v0}, Lp4/s;->u()I

    .line 1013
    .line 1014
    .line 1015
    move-result v7

    .line 1016
    invoke-virtual {v0}, Lp4/s;->u()I

    .line 1017
    .line 1018
    .line 1019
    move-result v8

    .line 1020
    invoke-static {v7}, Lm4/h;->f(I)I

    .line 1021
    .line 1022
    .line 1023
    move-result v28

    .line 1024
    if-eqz v4, :cond_31

    .line 1025
    .line 1026
    const/16 v24, 0x1

    .line 1027
    .line 1028
    goto :goto_29

    .line 1029
    :cond_31
    const/16 v24, 0x2

    .line 1030
    .line 1031
    :goto_29
    invoke-static {v8}, Lm4/h;->g(I)I

    .line 1032
    .line 1033
    .line 1034
    move-result v30

    .line 1035
    move-object v8, v1

    .line 1036
    move-object/from16 v34, v2

    .line 1037
    .line 1038
    move/from16 v18, v3

    .line 1039
    .line 1040
    move/from16 v32, v10

    .line 1041
    .line 1042
    move/from16 v31, v11

    .line 1043
    .line 1044
    move/from16 v27, v24

    .line 1045
    .line 1046
    const/4 v1, -0x1

    .line 1047
    const/16 v10, 0x8

    .line 1048
    .line 1049
    goto/16 :goto_49

    .line 1050
    .line 1051
    :cond_32
    const/16 v39, 0x6

    .line 1052
    .line 1053
    const/16 v40, 0x3

    .line 1054
    .line 1055
    const v1, 0x61763143

    .line 1056
    .line 1057
    .line 1058
    const-string v8, "BoxParsers"

    .line 1059
    .line 1060
    if-ne v9, v1, :cond_4b

    .line 1061
    .line 1062
    add-int/lit8 v1, v13, -0x8

    .line 1063
    .line 1064
    new-array v7, v1, [B

    .line 1065
    .line 1066
    const/4 v15, 0x0

    .line 1067
    invoke-virtual {v0, v7, v15, v1}, Lp4/s;->e([BII)V

    .line 1068
    .line 1069
    .line 1070
    invoke-static {v7}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v15

    .line 1074
    add-int/lit8 v12, v12, 0x8

    .line 1075
    .line 1076
    invoke-virtual {v0, v12}, Lp4/s;->G(I)V

    .line 1077
    .line 1078
    .line 1079
    new-instance v1, Lp4/r;

    .line 1080
    .line 1081
    iget-object v7, v0, Lp4/s;->a:[B

    .line 1082
    .line 1083
    array-length v9, v7

    .line 1084
    invoke-direct {v1, v7, v9}, Lp4/r;-><init>([BI)V

    .line 1085
    .line 1086
    .line 1087
    iget v7, v0, Lp4/s;->b:I

    .line 1088
    .line 1089
    const/16 v9, 0x8

    .line 1090
    .line 1091
    mul-int/lit8 v7, v7, 0x8

    .line 1092
    .line 1093
    invoke-virtual {v1, v7}, Lp4/r;->q(I)V

    .line 1094
    .line 1095
    .line 1096
    const/4 v7, 0x1

    .line 1097
    invoke-virtual {v1, v7}, Lp4/r;->u(I)V

    .line 1098
    .line 1099
    .line 1100
    const/4 v7, 0x3

    .line 1101
    invoke-virtual {v1, v7}, Lp4/r;->i(I)I

    .line 1102
    .line 1103
    .line 1104
    move-result v9

    .line 1105
    const/4 v7, 0x6

    .line 1106
    invoke-virtual {v1, v7}, Lp4/r;->t(I)V

    .line 1107
    .line 1108
    .line 1109
    invoke-virtual {v1}, Lp4/r;->h()Z

    .line 1110
    .line 1111
    .line 1112
    move-result v7

    .line 1113
    invoke-virtual {v1}, Lp4/r;->h()Z

    .line 1114
    .line 1115
    .line 1116
    move-result v11

    .line 1117
    const/16 v42, -0x1

    .line 1118
    .line 1119
    const/4 v12, 0x2

    .line 1120
    if-ne v9, v12, :cond_35

    .line 1121
    .line 1122
    if-eqz v7, :cond_35

    .line 1123
    .line 1124
    if-eqz v11, :cond_33

    .line 1125
    .line 1126
    const/16 v7, 0xc

    .line 1127
    .line 1128
    goto :goto_2a

    .line 1129
    :cond_33
    const/16 v7, 0xa

    .line 1130
    .line 1131
    :goto_2a
    if-eqz v11, :cond_34

    .line 1132
    .line 1133
    const/16 v18, 0xc

    .line 1134
    .line 1135
    :cond_34
    move/from16 v46, v7

    .line 1136
    .line 1137
    :goto_2b
    move/from16 v47, v18

    .line 1138
    .line 1139
    goto :goto_2e

    .line 1140
    :cond_35
    if-gt v9, v12, :cond_38

    .line 1141
    .line 1142
    if-eqz v7, :cond_36

    .line 1143
    .line 1144
    const/16 v9, 0xa

    .line 1145
    .line 1146
    goto :goto_2c

    .line 1147
    :cond_36
    const/16 v9, 0x8

    .line 1148
    .line 1149
    :goto_2c
    if-eqz v7, :cond_37

    .line 1150
    .line 1151
    goto :goto_2d

    .line 1152
    :cond_37
    const/16 v18, 0x8

    .line 1153
    .line 1154
    :goto_2d
    move/from16 v46, v9

    .line 1155
    .line 1156
    goto :goto_2b

    .line 1157
    :cond_38
    const/16 v46, -0x1

    .line 1158
    .line 1159
    const/16 v47, -0x1

    .line 1160
    .line 1161
    :goto_2e
    const/16 v7, 0xd

    .line 1162
    .line 1163
    invoke-virtual {v1, v7}, Lp4/r;->t(I)V

    .line 1164
    .line 1165
    .line 1166
    invoke-virtual {v1}, Lp4/r;->s()V

    .line 1167
    .line 1168
    .line 1169
    const/4 v9, 0x4

    .line 1170
    invoke-virtual {v1, v9}, Lp4/r;->i(I)I

    .line 1171
    .line 1172
    .line 1173
    move-result v11

    .line 1174
    const/16 v45, 0x0

    .line 1175
    .line 1176
    const/4 v9, 0x1

    .line 1177
    if-eq v11, v9, :cond_39

    .line 1178
    .line 1179
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1180
    .line 1181
    const-string v4, "Unsupported obu_type: "

    .line 1182
    .line 1183
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1187
    .line 1188
    .line 1189
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v1

    .line 1193
    invoke-static {v8, v1}, Lp4/c;->s(Ljava/lang/String;Ljava/lang/String;)V

    .line 1194
    .line 1195
    .line 1196
    new-instance v41, Lm4/h;

    .line 1197
    .line 1198
    move/from16 v43, v42

    .line 1199
    .line 1200
    move/from16 v44, v42

    .line 1201
    .line 1202
    invoke-direct/range {v41 .. v47}, Lm4/h;-><init>(III[BII)V

    .line 1203
    .line 1204
    .line 1205
    :goto_2f
    move-object/from16 v1, v41

    .line 1206
    .line 1207
    goto/16 :goto_36

    .line 1208
    .line 1209
    :cond_39
    invoke-virtual {v1}, Lp4/r;->h()Z

    .line 1210
    .line 1211
    .line 1212
    move-result v9

    .line 1213
    if-eqz v9, :cond_3a

    .line 1214
    .line 1215
    const-string v1, "Unsupported obu_extension_flag"

    .line 1216
    .line 1217
    invoke-static {v8, v1}, Lp4/c;->s(Ljava/lang/String;Ljava/lang/String;)V

    .line 1218
    .line 1219
    .line 1220
    new-instance v41, Lm4/h;

    .line 1221
    .line 1222
    move/from16 v43, v42

    .line 1223
    .line 1224
    move/from16 v44, v42

    .line 1225
    .line 1226
    invoke-direct/range {v41 .. v47}, Lm4/h;-><init>(III[BII)V

    .line 1227
    .line 1228
    .line 1229
    goto :goto_2f

    .line 1230
    :cond_3a
    invoke-virtual {v1}, Lp4/r;->h()Z

    .line 1231
    .line 1232
    .line 1233
    move-result v9

    .line 1234
    invoke-virtual {v1}, Lp4/r;->s()V

    .line 1235
    .line 1236
    .line 1237
    if-eqz v9, :cond_3b

    .line 1238
    .line 1239
    const/16 v9, 0x8

    .line 1240
    .line 1241
    invoke-virtual {v1, v9}, Lp4/r;->i(I)I

    .line 1242
    .line 1243
    .line 1244
    move-result v11

    .line 1245
    const/16 v9, 0x7f

    .line 1246
    .line 1247
    if-le v11, v9, :cond_3b

    .line 1248
    .line 1249
    const-string v1, "Excessive obu_size"

    .line 1250
    .line 1251
    invoke-static {v8, v1}, Lp4/c;->s(Ljava/lang/String;Ljava/lang/String;)V

    .line 1252
    .line 1253
    .line 1254
    new-instance v41, Lm4/h;

    .line 1255
    .line 1256
    move/from16 v43, v42

    .line 1257
    .line 1258
    move/from16 v44, v42

    .line 1259
    .line 1260
    invoke-direct/range {v41 .. v47}, Lm4/h;-><init>(III[BII)V

    .line 1261
    .line 1262
    .line 1263
    goto :goto_2f

    .line 1264
    :cond_3b
    const/4 v9, 0x3

    .line 1265
    invoke-virtual {v1, v9}, Lp4/r;->i(I)I

    .line 1266
    .line 1267
    .line 1268
    move-result v11

    .line 1269
    invoke-virtual {v1}, Lp4/r;->s()V

    .line 1270
    .line 1271
    .line 1272
    invoke-virtual {v1}, Lp4/r;->h()Z

    .line 1273
    .line 1274
    .line 1275
    move-result v9

    .line 1276
    if-eqz v9, :cond_3c

    .line 1277
    .line 1278
    const-string v1, "Unsupported reduced_still_picture_header"

    .line 1279
    .line 1280
    invoke-static {v8, v1}, Lp4/c;->s(Ljava/lang/String;Ljava/lang/String;)V

    .line 1281
    .line 1282
    .line 1283
    new-instance v41, Lm4/h;

    .line 1284
    .line 1285
    move/from16 v43, v42

    .line 1286
    .line 1287
    move/from16 v44, v42

    .line 1288
    .line 1289
    invoke-direct/range {v41 .. v47}, Lm4/h;-><init>(III[BII)V

    .line 1290
    .line 1291
    .line 1292
    goto :goto_2f

    .line 1293
    :cond_3c
    invoke-virtual {v1}, Lp4/r;->h()Z

    .line 1294
    .line 1295
    .line 1296
    move-result v9

    .line 1297
    if-eqz v9, :cond_3d

    .line 1298
    .line 1299
    const-string v1, "Unsupported timing_info_present_flag"

    .line 1300
    .line 1301
    invoke-static {v8, v1}, Lp4/c;->s(Ljava/lang/String;Ljava/lang/String;)V

    .line 1302
    .line 1303
    .line 1304
    new-instance v41, Lm4/h;

    .line 1305
    .line 1306
    move/from16 v43, v42

    .line 1307
    .line 1308
    move/from16 v44, v42

    .line 1309
    .line 1310
    invoke-direct/range {v41 .. v47}, Lm4/h;-><init>(III[BII)V

    .line 1311
    .line 1312
    .line 1313
    goto :goto_2f

    .line 1314
    :cond_3d
    invoke-virtual {v1}, Lp4/r;->h()Z

    .line 1315
    .line 1316
    .line 1317
    move-result v9

    .line 1318
    if-eqz v9, :cond_3e

    .line 1319
    .line 1320
    const-string v1, "Unsupported initial_display_delay_present_flag"

    .line 1321
    .line 1322
    invoke-static {v8, v1}, Lp4/c;->s(Ljava/lang/String;Ljava/lang/String;)V

    .line 1323
    .line 1324
    .line 1325
    new-instance v41, Lm4/h;

    .line 1326
    .line 1327
    move/from16 v43, v42

    .line 1328
    .line 1329
    move/from16 v44, v42

    .line 1330
    .line 1331
    invoke-direct/range {v41 .. v47}, Lm4/h;-><init>(III[BII)V

    .line 1332
    .line 1333
    .line 1334
    goto/16 :goto_2f

    .line 1335
    .line 1336
    :cond_3e
    const/4 v8, 0x5

    .line 1337
    invoke-virtual {v1, v8}, Lp4/r;->i(I)I

    .line 1338
    .line 1339
    .line 1340
    move-result v9

    .line 1341
    const/4 v12, 0x0

    .line 1342
    :goto_30
    if-gt v12, v9, :cond_40

    .line 1343
    .line 1344
    invoke-virtual {v1, v4}, Lp4/r;->t(I)V

    .line 1345
    .line 1346
    .line 1347
    invoke-virtual {v1, v8}, Lp4/r;->i(I)I

    .line 1348
    .line 1349
    .line 1350
    move-result v4

    .line 1351
    const/4 v8, 0x7

    .line 1352
    if-le v4, v8, :cond_3f

    .line 1353
    .line 1354
    invoke-virtual {v1}, Lp4/r;->s()V

    .line 1355
    .line 1356
    .line 1357
    :cond_3f
    add-int/lit8 v12, v12, 0x1

    .line 1358
    .line 1359
    const/16 v4, 0xc

    .line 1360
    .line 1361
    const/4 v8, 0x5

    .line 1362
    const/16 v37, 0x7

    .line 1363
    .line 1364
    goto :goto_30

    .line 1365
    :cond_40
    const/4 v4, 0x4

    .line 1366
    invoke-virtual {v1, v4}, Lp4/r;->i(I)I

    .line 1367
    .line 1368
    .line 1369
    move-result v8

    .line 1370
    invoke-virtual {v1, v4}, Lp4/r;->i(I)I

    .line 1371
    .line 1372
    .line 1373
    move-result v4

    .line 1374
    const/16 v24, 0x1

    .line 1375
    .line 1376
    add-int/lit8 v8, v8, 0x1

    .line 1377
    .line 1378
    invoke-virtual {v1, v8}, Lp4/r;->t(I)V

    .line 1379
    .line 1380
    .line 1381
    add-int/lit8 v4, v4, 0x1

    .line 1382
    .line 1383
    invoke-virtual {v1, v4}, Lp4/r;->t(I)V

    .line 1384
    .line 1385
    .line 1386
    invoke-virtual {v1}, Lp4/r;->h()Z

    .line 1387
    .line 1388
    .line 1389
    move-result v4

    .line 1390
    const/4 v8, 0x7

    .line 1391
    if-eqz v4, :cond_41

    .line 1392
    .line 1393
    invoke-virtual {v1, v8}, Lp4/r;->t(I)V

    .line 1394
    .line 1395
    .line 1396
    :cond_41
    invoke-virtual {v1, v8}, Lp4/r;->t(I)V

    .line 1397
    .line 1398
    .line 1399
    invoke-virtual {v1}, Lp4/r;->h()Z

    .line 1400
    .line 1401
    .line 1402
    move-result v4

    .line 1403
    if-eqz v4, :cond_42

    .line 1404
    .line 1405
    const/4 v8, 0x2

    .line 1406
    invoke-virtual {v1, v8}, Lp4/r;->t(I)V

    .line 1407
    .line 1408
    .line 1409
    :cond_42
    invoke-virtual {v1}, Lp4/r;->h()Z

    .line 1410
    .line 1411
    .line 1412
    move-result v8

    .line 1413
    if-eqz v8, :cond_43

    .line 1414
    .line 1415
    const/4 v8, 0x2

    .line 1416
    const/4 v9, 0x1

    .line 1417
    goto :goto_31

    .line 1418
    :cond_43
    const/4 v9, 0x1

    .line 1419
    invoke-virtual {v1, v9}, Lp4/r;->i(I)I

    .line 1420
    .line 1421
    .line 1422
    move-result v8

    .line 1423
    :goto_31
    if-lez v8, :cond_44

    .line 1424
    .line 1425
    invoke-virtual {v1}, Lp4/r;->h()Z

    .line 1426
    .line 1427
    .line 1428
    move-result v8

    .line 1429
    if-nez v8, :cond_44

    .line 1430
    .line 1431
    invoke-virtual {v1, v9}, Lp4/r;->t(I)V

    .line 1432
    .line 1433
    .line 1434
    :cond_44
    const/4 v9, 0x3

    .line 1435
    if-eqz v4, :cond_45

    .line 1436
    .line 1437
    invoke-virtual {v1, v9}, Lp4/r;->t(I)V

    .line 1438
    .line 1439
    .line 1440
    :cond_45
    invoke-virtual {v1, v9}, Lp4/r;->t(I)V

    .line 1441
    .line 1442
    .line 1443
    invoke-virtual {v1}, Lp4/r;->h()Z

    .line 1444
    .line 1445
    .line 1446
    move-result v4

    .line 1447
    const/4 v8, 0x2

    .line 1448
    if-ne v11, v8, :cond_46

    .line 1449
    .line 1450
    if-eqz v4, :cond_46

    .line 1451
    .line 1452
    invoke-virtual {v1}, Lp4/r;->s()V

    .line 1453
    .line 1454
    .line 1455
    :cond_46
    const/4 v9, 0x1

    .line 1456
    if-eq v11, v9, :cond_47

    .line 1457
    .line 1458
    invoke-virtual {v1}, Lp4/r;->h()Z

    .line 1459
    .line 1460
    .line 1461
    move-result v4

    .line 1462
    if-eqz v4, :cond_47

    .line 1463
    .line 1464
    const/4 v4, 0x1

    .line 1465
    goto :goto_32

    .line 1466
    :cond_47
    const/4 v4, 0x0

    .line 1467
    :goto_32
    invoke-virtual {v1}, Lp4/r;->h()Z

    .line 1468
    .line 1469
    .line 1470
    move-result v8

    .line 1471
    if-eqz v8, :cond_4a

    .line 1472
    .line 1473
    const/16 v9, 0x8

    .line 1474
    .line 1475
    invoke-virtual {v1, v9}, Lp4/r;->i(I)I

    .line 1476
    .line 1477
    .line 1478
    move-result v8

    .line 1479
    invoke-virtual {v1, v9}, Lp4/r;->i(I)I

    .line 1480
    .line 1481
    .line 1482
    move-result v11

    .line 1483
    invoke-virtual {v1, v9}, Lp4/r;->i(I)I

    .line 1484
    .line 1485
    .line 1486
    move-result v12

    .line 1487
    const/4 v9, 0x1

    .line 1488
    if-nez v4, :cond_48

    .line 1489
    .line 1490
    if-ne v8, v9, :cond_48

    .line 1491
    .line 1492
    if-ne v11, v7, :cond_48

    .line 1493
    .line 1494
    if-nez v12, :cond_48

    .line 1495
    .line 1496
    const/4 v1, 0x1

    .line 1497
    goto :goto_33

    .line 1498
    :cond_48
    invoke-virtual {v1, v9}, Lp4/r;->i(I)I

    .line 1499
    .line 1500
    .line 1501
    move-result v24

    .line 1502
    move/from16 v1, v24

    .line 1503
    .line 1504
    :goto_33
    invoke-static {v8}, Lm4/h;->f(I)I

    .line 1505
    .line 1506
    .line 1507
    move-result v42

    .line 1508
    if-ne v1, v9, :cond_49

    .line 1509
    .line 1510
    const/4 v9, 0x1

    .line 1511
    goto :goto_34

    .line 1512
    :cond_49
    const/4 v9, 0x2

    .line 1513
    :goto_34
    invoke-static {v11}, Lm4/h;->g(I)I

    .line 1514
    .line 1515
    .line 1516
    move-result v1

    .line 1517
    move/from16 v44, v42

    .line 1518
    .line 1519
    move/from16 v48, v46

    .line 1520
    .line 1521
    move/from16 v46, v1

    .line 1522
    .line 1523
    move/from16 v42, v9

    .line 1524
    .line 1525
    goto :goto_35

    .line 1526
    :cond_4a
    move/from16 v48, v46

    .line 1527
    .line 1528
    const/16 v44, -0x1

    .line 1529
    .line 1530
    const/16 v46, -0x1

    .line 1531
    .line 1532
    :goto_35
    new-instance v43, Lm4/h;

    .line 1533
    .line 1534
    move/from16 v49, v47

    .line 1535
    .line 1536
    move-object/from16 v47, v45

    .line 1537
    .line 1538
    move/from16 v45, v42

    .line 1539
    .line 1540
    invoke-direct/range {v43 .. v49}, Lm4/h;-><init>(III[BII)V

    .line 1541
    .line 1542
    .line 1543
    move-object/from16 v1, v43

    .line 1544
    .line 1545
    :goto_36
    const-string v4, "video/av01"

    .line 1546
    .line 1547
    iget v7, v1, Lm4/h;->e:I

    .line 1548
    .line 1549
    iget v8, v1, Lm4/h;->f:I

    .line 1550
    .line 1551
    iget v9, v1, Lm4/h;->a:I

    .line 1552
    .line 1553
    iget v11, v1, Lm4/h;->b:I

    .line 1554
    .line 1555
    iget v1, v1, Lm4/h;->c:I

    .line 1556
    .line 1557
    move/from16 v30, v1

    .line 1558
    .line 1559
    move-object/from16 v34, v2

    .line 1560
    .line 1561
    move/from16 v18, v3

    .line 1562
    .line 1563
    move/from16 v31, v7

    .line 1564
    .line 1565
    move/from16 v28, v9

    .line 1566
    .line 1567
    move/from16 v32, v10

    .line 1568
    .line 1569
    move/from16 v27, v11

    .line 1570
    .line 1571
    const/4 v1, -0x1

    .line 1572
    const/16 v10, 0x8

    .line 1573
    .line 1574
    move v11, v8

    .line 1575
    move-object v8, v4

    .line 1576
    goto/16 :goto_49

    .line 1577
    .line 1578
    :cond_4b
    const v1, 0x636c6c69

    .line 1579
    .line 1580
    .line 1581
    const/16 v4, 0x19

    .line 1582
    .line 1583
    if-ne v9, v1, :cond_4d

    .line 1584
    .line 1585
    if-nez v21, :cond_4c

    .line 1586
    .line 1587
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v1

    .line 1591
    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 1592
    .line 1593
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 1594
    .line 1595
    .line 1596
    move-result-object v21

    .line 1597
    :cond_4c
    move-object/from16 v1, v21

    .line 1598
    .line 1599
    const/16 v4, 0x15

    .line 1600
    .line 1601
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 1602
    .line 1603
    .line 1604
    invoke-virtual {v0}, Lp4/s;->r()S

    .line 1605
    .line 1606
    .line 1607
    move-result v4

    .line 1608
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1609
    .line 1610
    .line 1611
    invoke-virtual {v0}, Lp4/s;->r()S

    .line 1612
    .line 1613
    .line 1614
    move-result v4

    .line 1615
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1616
    .line 1617
    .line 1618
    move-object/from16 v21, v1

    .line 1619
    .line 1620
    move-object/from16 v34, v2

    .line 1621
    .line 1622
    move/from16 v18, v3

    .line 1623
    .line 1624
    goto/16 :goto_21

    .line 1625
    .line 1626
    :cond_4d
    const v1, 0x6d646376

    .line 1627
    .line 1628
    .line 1629
    if-ne v9, v1, :cond_4f

    .line 1630
    .line 1631
    if-nez v21, :cond_4e

    .line 1632
    .line 1633
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 1634
    .line 1635
    .line 1636
    move-result-object v1

    .line 1637
    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 1638
    .line 1639
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v21

    .line 1643
    :cond_4e
    move-object/from16 v1, v21

    .line 1644
    .line 1645
    invoke-virtual {v0}, Lp4/s;->r()S

    .line 1646
    .line 1647
    .line 1648
    move-result v4

    .line 1649
    invoke-virtual {v0}, Lp4/s;->r()S

    .line 1650
    .line 1651
    .line 1652
    move-result v8

    .line 1653
    invoke-virtual {v0}, Lp4/s;->r()S

    .line 1654
    .line 1655
    .line 1656
    move-result v9

    .line 1657
    invoke-virtual {v0}, Lp4/s;->r()S

    .line 1658
    .line 1659
    .line 1660
    move-result v11

    .line 1661
    invoke-virtual {v0}, Lp4/s;->r()S

    .line 1662
    .line 1663
    .line 1664
    move-result v12

    .line 1665
    move-object/from16 v18, v2

    .line 1666
    .line 1667
    invoke-virtual {v0}, Lp4/s;->r()S

    .line 1668
    .line 1669
    .line 1670
    move-result v2

    .line 1671
    move/from16 v32, v10

    .line 1672
    .line 1673
    invoke-virtual {v0}, Lp4/s;->r()S

    .line 1674
    .line 1675
    .line 1676
    move-result v10

    .line 1677
    move-object/from16 v37, v15

    .line 1678
    .line 1679
    invoke-virtual {v0}, Lp4/s;->r()S

    .line 1680
    .line 1681
    .line 1682
    move-result v15

    .line 1683
    invoke-virtual {v0}, Lp4/s;->w()J

    .line 1684
    .line 1685
    .line 1686
    move-result-wide v39

    .line 1687
    invoke-virtual {v0}, Lp4/s;->w()J

    .line 1688
    .line 1689
    .line 1690
    move-result-wide v41

    .line 1691
    move/from16 v43, v3

    .line 1692
    .line 1693
    const/4 v3, 0x1

    .line 1694
    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 1695
    .line 1696
    .line 1697
    invoke-virtual {v1, v12}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1698
    .line 1699
    .line 1700
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1701
    .line 1702
    .line 1703
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1704
    .line 1705
    .line 1706
    invoke-virtual {v1, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1707
    .line 1708
    .line 1709
    invoke-virtual {v1, v9}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1710
    .line 1711
    .line 1712
    invoke-virtual {v1, v11}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1713
    .line 1714
    .line 1715
    invoke-virtual {v1, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1716
    .line 1717
    .line 1718
    invoke-virtual {v1, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1719
    .line 1720
    .line 1721
    const-wide/16 v2, 0x2710

    .line 1722
    .line 1723
    div-long v8, v39, v2

    .line 1724
    .line 1725
    long-to-int v4, v8

    .line 1726
    int-to-short v4, v4

    .line 1727
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1728
    .line 1729
    .line 1730
    div-long v2, v41, v2

    .line 1731
    .line 1732
    long-to-int v3, v2

    .line 1733
    int-to-short v2, v3

    .line 1734
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 1735
    .line 1736
    .line 1737
    move-object/from16 v21, v1

    .line 1738
    .line 1739
    :goto_37
    move-object/from16 v34, v18

    .line 1740
    .line 1741
    move/from16 v11, v28

    .line 1742
    .line 1743
    move-object/from16 v8, v31

    .line 1744
    .line 1745
    move/from16 v30, v35

    .line 1746
    .line 1747
    move-object/from16 v15, v37

    .line 1748
    .line 1749
    move/from16 v18, v43

    .line 1750
    .line 1751
    goto/16 :goto_22

    .line 1752
    .line 1753
    :cond_4f
    move-object/from16 v18, v2

    .line 1754
    .line 1755
    move/from16 v43, v3

    .line 1756
    .line 1757
    move/from16 v32, v10

    .line 1758
    .line 1759
    move-object/from16 v37, v15

    .line 1760
    .line 1761
    const v1, 0x64323633

    .line 1762
    .line 1763
    .line 1764
    if-ne v9, v1, :cond_51

    .line 1765
    .line 1766
    if-nez v31, :cond_50

    .line 1767
    .line 1768
    const/4 v9, 0x1

    .line 1769
    :goto_38
    const/4 v2, 0x0

    .line 1770
    goto :goto_39

    .line 1771
    :cond_50
    const/4 v9, 0x0

    .line 1772
    goto :goto_38

    .line 1773
    :goto_39
    invoke-static {v2, v9}, Lr5/b;->c(Ljava/lang/String;Z)V

    .line 1774
    .line 1775
    .line 1776
    move-object/from16 v34, v18

    .line 1777
    .line 1778
    move/from16 v31, v26

    .line 1779
    .line 1780
    move/from16 v11, v28

    .line 1781
    .line 1782
    move-object/from16 v8, v29

    .line 1783
    .line 1784
    move/from16 v30, v35

    .line 1785
    .line 1786
    move-object/from16 v15, v37

    .line 1787
    .line 1788
    :goto_3a
    move/from16 v18, v43

    .line 1789
    .line 1790
    const/4 v1, -0x1

    .line 1791
    const/16 v10, 0x8

    .line 1792
    .line 1793
    :goto_3b
    move/from16 v28, v7

    .line 1794
    .line 1795
    goto/16 :goto_49

    .line 1796
    .line 1797
    :cond_51
    const/4 v2, 0x0

    .line 1798
    const v1, 0x65736473

    .line 1799
    .line 1800
    .line 1801
    if-ne v9, v1, :cond_54

    .line 1802
    .line 1803
    if-nez v31, :cond_52

    .line 1804
    .line 1805
    const/4 v9, 0x1

    .line 1806
    goto :goto_3c

    .line 1807
    :cond_52
    const/4 v9, 0x0

    .line 1808
    :goto_3c
    invoke-static {v2, v9}, Lr5/b;->c(Ljava/lang/String;Z)V

    .line 1809
    .line 1810
    .line 1811
    invoke-static {v12, v0}, Ll6/e;->a(ILp4/s;)Lj5/x0;

    .line 1812
    .line 1813
    .line 1814
    move-result-object v1

    .line 1815
    iget-object v3, v1, Lj5/x0;->c:Ljava/lang/Object;

    .line 1816
    .line 1817
    check-cast v3, Ljava/lang/String;

    .line 1818
    .line 1819
    iget-object v4, v1, Lj5/x0;->d:Ljava/lang/Object;

    .line 1820
    .line 1821
    check-cast v4, [B

    .line 1822
    .line 1823
    if-eqz v4, :cond_53

    .line 1824
    .line 1825
    invoke-static {v4}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v15

    .line 1829
    goto :goto_3d

    .line 1830
    :cond_53
    move-object/from16 v15, v37

    .line 1831
    .line 1832
    :goto_3d
    move-object/from16 v33, v1

    .line 1833
    .line 1834
    move-object v8, v3

    .line 1835
    move-object/from16 v34, v18

    .line 1836
    .line 1837
    move/from16 v31, v26

    .line 1838
    .line 1839
    move/from16 v11, v28

    .line 1840
    .line 1841
    move/from16 v30, v35

    .line 1842
    .line 1843
    goto :goto_3a

    .line 1844
    :cond_54
    const v1, 0x70617370

    .line 1845
    .line 1846
    .line 1847
    if-ne v9, v1, :cond_55

    .line 1848
    .line 1849
    add-int/lit8 v12, v12, 0x8

    .line 1850
    .line 1851
    invoke-virtual {v0, v12}, Lp4/s;->G(I)V

    .line 1852
    .line 1853
    .line 1854
    invoke-virtual {v0}, Lp4/s;->y()I

    .line 1855
    .line 1856
    .line 1857
    move-result v1

    .line 1858
    invoke-virtual {v0}, Lp4/s;->y()I

    .line 1859
    .line 1860
    .line 1861
    move-result v3

    .line 1862
    int-to-float v1, v1

    .line 1863
    int-to-float v3, v3

    .line 1864
    div-float/2addr v1, v3

    .line 1865
    move v14, v1

    .line 1866
    move-object/from16 v34, v18

    .line 1867
    .line 1868
    move/from16 v11, v28

    .line 1869
    .line 1870
    move-object/from16 v8, v31

    .line 1871
    .line 1872
    move/from16 v30, v35

    .line 1873
    .line 1874
    move-object/from16 v15, v37

    .line 1875
    .line 1876
    move/from16 v18, v43

    .line 1877
    .line 1878
    const/4 v1, -0x1

    .line 1879
    const/16 v10, 0x8

    .line 1880
    .line 1881
    const/16 v22, 0x1

    .line 1882
    .line 1883
    goto/16 :goto_23

    .line 1884
    .line 1885
    :cond_55
    const v1, 0x73763364

    .line 1886
    .line 1887
    .line 1888
    if-ne v9, v1, :cond_58

    .line 1889
    .line 1890
    add-int/lit8 v1, v12, 0x8

    .line 1891
    .line 1892
    :goto_3e
    sub-int v3, v1, v12

    .line 1893
    .line 1894
    if-ge v3, v13, :cond_57

    .line 1895
    .line 1896
    invoke-virtual {v0, v1}, Lp4/s;->G(I)V

    .line 1897
    .line 1898
    .line 1899
    invoke-virtual {v0}, Lp4/s;->g()I

    .line 1900
    .line 1901
    .line 1902
    move-result v3

    .line 1903
    invoke-virtual {v0}, Lp4/s;->g()I

    .line 1904
    .line 1905
    .line 1906
    move-result v4

    .line 1907
    const v8, 0x70726f6a

    .line 1908
    .line 1909
    .line 1910
    if-ne v4, v8, :cond_56

    .line 1911
    .line 1912
    iget-object v4, v0, Lp4/s;->a:[B

    .line 1913
    .line 1914
    add-int/2addr v3, v1

    .line 1915
    invoke-static {v4, v1, v3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 1916
    .line 1917
    .line 1918
    move-result-object v1

    .line 1919
    move-object/from16 v17, v1

    .line 1920
    .line 1921
    goto/16 :goto_37

    .line 1922
    .line 1923
    :cond_56
    add-int/2addr v1, v3

    .line 1924
    goto :goto_3e

    .line 1925
    :cond_57
    move-object/from16 v17, v2

    .line 1926
    .line 1927
    goto/16 :goto_37

    .line 1928
    .line 1929
    :cond_58
    const v1, 0x73743364

    .line 1930
    .line 1931
    .line 1932
    if-ne v9, v1, :cond_5e

    .line 1933
    .line 1934
    invoke-virtual {v0}, Lp4/s;->u()I

    .line 1935
    .line 1936
    .line 1937
    move-result v1

    .line 1938
    const/4 v9, 0x3

    .line 1939
    invoke-virtual {v0, v9}, Lp4/s;->H(I)V

    .line 1940
    .line 1941
    .line 1942
    if-nez v1, :cond_5d

    .line 1943
    .line 1944
    invoke-virtual {v0}, Lp4/s;->u()I

    .line 1945
    .line 1946
    .line 1947
    move-result v1

    .line 1948
    if-eqz v1, :cond_5c

    .line 1949
    .line 1950
    const/4 v3, 0x1

    .line 1951
    if-eq v1, v3, :cond_5b

    .line 1952
    .line 1953
    const/4 v8, 0x2

    .line 1954
    if-eq v1, v8, :cond_5a

    .line 1955
    .line 1956
    if-eq v1, v9, :cond_59

    .line 1957
    .line 1958
    goto :goto_3f

    .line 1959
    :cond_59
    const/16 v24, 0x3

    .line 1960
    .line 1961
    goto :goto_40

    .line 1962
    :cond_5a
    const/16 v24, 0x2

    .line 1963
    .line 1964
    goto :goto_40

    .line 1965
    :cond_5b
    const/16 v24, 0x1

    .line 1966
    .line 1967
    goto :goto_40

    .line 1968
    :cond_5c
    const/16 v24, 0x0

    .line 1969
    .line 1970
    goto :goto_40

    .line 1971
    :cond_5d
    :goto_3f
    move/from16 v24, v43

    .line 1972
    .line 1973
    :goto_40
    move-object/from16 v34, v18

    .line 1974
    .line 1975
    move/from16 v18, v24

    .line 1976
    .line 1977
    move/from16 v11, v28

    .line 1978
    .line 1979
    move-object/from16 v8, v31

    .line 1980
    .line 1981
    move/from16 v30, v35

    .line 1982
    .line 1983
    move-object/from16 v15, v37

    .line 1984
    .line 1985
    goto/16 :goto_22

    .line 1986
    .line 1987
    :cond_5e
    const v1, 0x61707643

    .line 1988
    .line 1989
    .line 1990
    if-ne v9, v1, :cond_63

    .line 1991
    .line 1992
    add-int/lit8 v1, v13, -0x8

    .line 1993
    .line 1994
    new-array v3, v1, [B

    .line 1995
    .line 1996
    const/4 v15, 0x0

    .line 1997
    invoke-virtual {v0, v3, v15, v1}, Lp4/s;->e([BII)V

    .line 1998
    .line 1999
    .line 2000
    invoke-static {v3}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    .line 2001
    .line 2002
    .line 2003
    move-result-object v1

    .line 2004
    add-int/lit8 v12, v12, 0x8

    .line 2005
    .line 2006
    invoke-virtual {v0, v12}, Lp4/s;->G(I)V

    .line 2007
    .line 2008
    .line 2009
    new-instance v3, Lp4/r;

    .line 2010
    .line 2011
    iget-object v4, v0, Lp4/s;->a:[B

    .line 2012
    .line 2013
    array-length v7, v4

    .line 2014
    invoke-direct {v3, v4, v7}, Lp4/r;-><init>([BI)V

    .line 2015
    .line 2016
    .line 2017
    iget v4, v0, Lp4/s;->b:I

    .line 2018
    .line 2019
    const/16 v10, 0x8

    .line 2020
    .line 2021
    mul-int/lit8 v4, v4, 0x8

    .line 2022
    .line 2023
    invoke-virtual {v3, v4}, Lp4/r;->q(I)V

    .line 2024
    .line 2025
    .line 2026
    const/4 v9, 0x4

    .line 2027
    invoke-virtual {v3, v9}, Lp4/r;->u(I)V

    .line 2028
    .line 2029
    .line 2030
    const/4 v4, 0x1

    .line 2031
    invoke-virtual {v3, v4}, Lp4/r;->u(I)V

    .line 2032
    .line 2033
    .line 2034
    invoke-virtual {v3, v10}, Lp4/r;->i(I)I

    .line 2035
    .line 2036
    .line 2037
    move-result v7

    .line 2038
    const/4 v8, 0x0

    .line 2039
    const/4 v9, -0x1

    .line 2040
    const/4 v11, -0x1

    .line 2041
    const/4 v12, -0x1

    .line 2042
    const/16 v28, -0x1

    .line 2043
    .line 2044
    const/16 v31, -0x1

    .line 2045
    .line 2046
    :goto_41
    if-ge v8, v7, :cond_62

    .line 2047
    .line 2048
    invoke-virtual {v3, v4}, Lp4/r;->u(I)V

    .line 2049
    .line 2050
    .line 2051
    invoke-virtual {v3, v10}, Lp4/r;->i(I)I

    .line 2052
    .line 2053
    .line 2054
    move-result v2

    .line 2055
    move/from16 v24, v12

    .line 2056
    .line 2057
    move v12, v11

    .line 2058
    move v11, v9

    .line 2059
    const/4 v9, 0x0

    .line 2060
    :goto_42
    if-ge v9, v2, :cond_61

    .line 2061
    .line 2062
    const/4 v15, 0x6

    .line 2063
    invoke-virtual {v3, v15}, Lp4/r;->t(I)V

    .line 2064
    .line 2065
    .line 2066
    invoke-virtual {v3}, Lp4/r;->h()Z

    .line 2067
    .line 2068
    .line 2069
    move-result v24

    .line 2070
    invoke-virtual {v3}, Lp4/r;->s()V

    .line 2071
    .line 2072
    .line 2073
    const/16 v15, 0xb

    .line 2074
    .line 2075
    invoke-virtual {v3, v15}, Lp4/r;->u(I)V

    .line 2076
    .line 2077
    .line 2078
    const/4 v15, 0x4

    .line 2079
    invoke-virtual {v3, v15}, Lp4/r;->t(I)V

    .line 2080
    .line 2081
    .line 2082
    invoke-virtual {v3, v15}, Lp4/r;->i(I)I

    .line 2083
    .line 2084
    .line 2085
    move-result v26

    .line 2086
    add-int/lit8 v31, v26, 0x8

    .line 2087
    .line 2088
    invoke-virtual {v3, v4}, Lp4/r;->u(I)V

    .line 2089
    .line 2090
    .line 2091
    if-eqz v24, :cond_60

    .line 2092
    .line 2093
    invoke-virtual {v3, v10}, Lp4/r;->i(I)I

    .line 2094
    .line 2095
    .line 2096
    move-result v11

    .line 2097
    invoke-virtual {v3, v10}, Lp4/r;->i(I)I

    .line 2098
    .line 2099
    .line 2100
    move-result v12

    .line 2101
    invoke-virtual {v3, v4}, Lp4/r;->u(I)V

    .line 2102
    .line 2103
    .line 2104
    invoke-virtual {v3}, Lp4/r;->h()Z

    .line 2105
    .line 2106
    .line 2107
    move-result v24

    .line 2108
    invoke-static {v11}, Lm4/h;->f(I)I

    .line 2109
    .line 2110
    .line 2111
    move-result v11

    .line 2112
    if-eqz v24, :cond_5f

    .line 2113
    .line 2114
    const/16 v24, 0x1

    .line 2115
    .line 2116
    goto :goto_43

    .line 2117
    :cond_5f
    const/16 v24, 0x2

    .line 2118
    .line 2119
    :goto_43
    invoke-static {v12}, Lm4/h;->g(I)I

    .line 2120
    .line 2121
    .line 2122
    move-result v12

    .line 2123
    move/from16 v28, v11

    .line 2124
    .line 2125
    move/from16 v11, v24

    .line 2126
    .line 2127
    :cond_60
    add-int/lit8 v9, v9, 0x1

    .line 2128
    .line 2129
    move/from16 v24, v31

    .line 2130
    .line 2131
    const/4 v15, 0x0

    .line 2132
    const/16 v36, 0xb

    .line 2133
    .line 2134
    goto :goto_42

    .line 2135
    :cond_61
    const/4 v15, 0x4

    .line 2136
    add-int/lit8 v8, v8, 0x1

    .line 2137
    .line 2138
    move v9, v11

    .line 2139
    move v11, v12

    .line 2140
    move/from16 v12, v24

    .line 2141
    .line 2142
    const/4 v2, 0x0

    .line 2143
    const/4 v15, 0x0

    .line 2144
    const/16 v36, 0xb

    .line 2145
    .line 2146
    goto :goto_41

    .line 2147
    :cond_62
    new-instance v2, Lm4/h;

    .line 2148
    .line 2149
    const-string v2, "video/apv"

    .line 2150
    .line 2151
    move-object v15, v1

    .line 2152
    move-object v8, v2

    .line 2153
    move/from16 v27, v9

    .line 2154
    .line 2155
    move/from16 v30, v11

    .line 2156
    .line 2157
    move v11, v12

    .line 2158
    move-object/from16 v34, v18

    .line 2159
    .line 2160
    move/from16 v18, v43

    .line 2161
    .line 2162
    goto/16 :goto_6

    .line 2163
    .line 2164
    :cond_63
    const/4 v4, 0x1

    .line 2165
    const/16 v10, 0x8

    .line 2166
    .line 2167
    const v1, 0x636f6c72

    .line 2168
    .line 2169
    .line 2170
    if-ne v9, v1, :cond_68

    .line 2171
    .line 2172
    const/4 v1, -0x1

    .line 2173
    move/from16 v12, v35

    .line 2174
    .line 2175
    if-ne v7, v1, :cond_69

    .line 2176
    .line 2177
    if-ne v12, v1, :cond_69

    .line 2178
    .line 2179
    invoke-virtual {v0}, Lp4/s;->g()I

    .line 2180
    .line 2181
    .line 2182
    move-result v2

    .line 2183
    const v3, 0x6e636c78

    .line 2184
    .line 2185
    .line 2186
    if-eq v2, v3, :cond_65

    .line 2187
    .line 2188
    const v3, 0x6e636c63

    .line 2189
    .line 2190
    .line 2191
    if-ne v2, v3, :cond_64

    .line 2192
    .line 2193
    goto :goto_44

    .line 2194
    :cond_64
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2195
    .line 2196
    const-string v4, "Unsupported color type: "

    .line 2197
    .line 2198
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2199
    .line 2200
    .line 2201
    invoke-static {v2}, Lq4/d;->c(I)Ljava/lang/String;

    .line 2202
    .line 2203
    .line 2204
    move-result-object v2

    .line 2205
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2206
    .line 2207
    .line 2208
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2209
    .line 2210
    .line 2211
    move-result-object v2

    .line 2212
    invoke-static {v8, v2}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 2213
    .line 2214
    .line 2215
    goto :goto_46

    .line 2216
    :cond_65
    :goto_44
    invoke-virtual {v0}, Lp4/s;->A()I

    .line 2217
    .line 2218
    .line 2219
    move-result v2

    .line 2220
    invoke-virtual {v0}, Lp4/s;->A()I

    .line 2221
    .line 2222
    .line 2223
    move-result v3

    .line 2224
    const/4 v8, 0x2

    .line 2225
    invoke-virtual {v0, v8}, Lp4/s;->H(I)V

    .line 2226
    .line 2227
    .line 2228
    const/16 v7, 0x13

    .line 2229
    .line 2230
    if-ne v13, v7, :cond_66

    .line 2231
    .line 2232
    invoke-virtual {v0}, Lp4/s;->u()I

    .line 2233
    .line 2234
    .line 2235
    move-result v7

    .line 2236
    and-int/lit16 v7, v7, 0x80

    .line 2237
    .line 2238
    if-eqz v7, :cond_66

    .line 2239
    .line 2240
    const/4 v7, 0x1

    .line 2241
    goto :goto_45

    .line 2242
    :cond_66
    const/4 v7, 0x0

    .line 2243
    :goto_45
    invoke-static {v2}, Lm4/h;->f(I)I

    .line 2244
    .line 2245
    .line 2246
    move-result v2

    .line 2247
    if-eqz v7, :cond_67

    .line 2248
    .line 2249
    const/4 v8, 0x1

    .line 2250
    :cond_67
    invoke-static {v3}, Lm4/h;->g(I)I

    .line 2251
    .line 2252
    .line 2253
    move-result v30

    .line 2254
    move/from16 v27, v8

    .line 2255
    .line 2256
    move-object/from16 v34, v18

    .line 2257
    .line 2258
    move/from16 v11, v28

    .line 2259
    .line 2260
    move-object/from16 v8, v31

    .line 2261
    .line 2262
    move-object/from16 v15, v37

    .line 2263
    .line 2264
    move/from16 v18, v43

    .line 2265
    .line 2266
    move/from16 v28, v2

    .line 2267
    .line 2268
    goto/16 :goto_24

    .line 2269
    .line 2270
    :cond_68
    move/from16 v12, v35

    .line 2271
    .line 2272
    const/4 v1, -0x1

    .line 2273
    :cond_69
    :goto_46
    move/from16 v30, v12

    .line 2274
    .line 2275
    move-object/from16 v34, v18

    .line 2276
    .line 2277
    move/from16 v11, v28

    .line 2278
    .line 2279
    move-object/from16 v8, v31

    .line 2280
    .line 2281
    move-object/from16 v15, v37

    .line 2282
    .line 2283
    move/from16 v18, v43

    .line 2284
    .line 2285
    goto/16 :goto_23

    .line 2286
    .line 2287
    :goto_47
    invoke-static {v0}, Lapp/nekogram/translator/r;->b(Lp4/s;)Lapp/nekogram/translator/r;

    .line 2288
    .line 2289
    .line 2290
    move-result-object v2

    .line 2291
    if-eqz v2, :cond_6a

    .line 2292
    .line 2293
    iget-object v2, v2, Lapp/nekogram/translator/r;->b:Ljava/lang/String;

    .line 2294
    .line 2295
    const-string v8, "video/dolby-vision"

    .line 2296
    .line 2297
    move-object/from16 v16, v2

    .line 2298
    .line 2299
    goto :goto_48

    .line 2300
    :cond_6a
    move-object/from16 v8, v31

    .line 2301
    .line 2302
    :goto_48
    move/from16 v30, v12

    .line 2303
    .line 2304
    move-object/from16 v34, v18

    .line 2305
    .line 2306
    move/from16 v31, v26

    .line 2307
    .line 2308
    move/from16 v11, v28

    .line 2309
    .line 2310
    move-object/from16 v15, v37

    .line 2311
    .line 2312
    move/from16 v18, v43

    .line 2313
    .line 2314
    goto/16 :goto_3b

    .line 2315
    .line 2316
    :goto_49
    add-int v7, v25, v13

    .line 2317
    .line 2318
    move/from16 v1, p2

    .line 2319
    .line 2320
    move/from16 v2, p3

    .line 2321
    .line 2322
    move-object/from16 v4, p7

    .line 2323
    .line 2324
    move/from16 v10, v32

    .line 2325
    .line 2326
    move-object/from16 v3, v38

    .line 2327
    .line 2328
    move/from16 v32, v11

    .line 2329
    .line 2330
    move-object/from16 v11, v29

    .line 2331
    .line 2332
    move/from16 v29, v27

    .line 2333
    .line 2334
    goto/16 :goto_2

    .line 2335
    .line 2336
    :goto_4a
    if-nez v31, :cond_6b

    .line 2337
    .line 2338
    return-void

    .line 2339
    :cond_6b
    new-instance v0, Lm4/p;

    .line 2340
    .line 2341
    invoke-direct {v0}, Lm4/p;-><init>()V

    .line 2342
    .line 2343
    .line 2344
    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 2345
    .line 2346
    .line 2347
    move-result-object v1

    .line 2348
    iput-object v1, v0, Lm4/p;->a:Ljava/lang/String;

    .line 2349
    .line 2350
    invoke-static/range {v31 .. v31}, Lm4/o0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 2351
    .line 2352
    .line 2353
    move-result-object v1

    .line 2354
    iput-object v1, v0, Lm4/p;->m:Ljava/lang/String;

    .line 2355
    .line 2356
    move-object/from16 v9, v16

    .line 2357
    .line 2358
    iput-object v9, v0, Lm4/p;->j:Ljava/lang/String;

    .line 2359
    .line 2360
    iput v5, v0, Lm4/p;->t:I

    .line 2361
    .line 2362
    iput v6, v0, Lm4/p;->u:I

    .line 2363
    .line 2364
    iput v14, v0, Lm4/p;->x:F

    .line 2365
    .line 2366
    move/from16 v1, p5

    .line 2367
    .line 2368
    iput v1, v0, Lm4/p;->w:I

    .line 2369
    .line 2370
    move-object/from16 v9, v17

    .line 2371
    .line 2372
    iput-object v9, v0, Lm4/p;->y:[B

    .line 2373
    .line 2374
    move/from16 v3, v43

    .line 2375
    .line 2376
    iput v3, v0, Lm4/p;->z:I

    .line 2377
    .line 2378
    move-object/from16 v9, v37

    .line 2379
    .line 2380
    iput-object v9, v0, Lm4/p;->p:Ljava/util/List;

    .line 2381
    .line 2382
    move/from16 v1, v19

    .line 2383
    .line 2384
    iput v1, v0, Lm4/p;->o:I

    .line 2385
    .line 2386
    move/from16 v1, v20

    .line 2387
    .line 2388
    iput v1, v0, Lm4/p;->B:I

    .line 2389
    .line 2390
    move-object/from16 v3, v38

    .line 2391
    .line 2392
    iput-object v3, v0, Lm4/p;->q:Lm4/n;

    .line 2393
    .line 2394
    if-eqz v21, :cond_6c

    .line 2395
    .line 2396
    invoke-virtual/range {v21 .. v21}, Ljava/nio/ByteBuffer;->array()[B

    .line 2397
    .line 2398
    .line 2399
    move-result-object v9

    .line 2400
    move-object/from16 v25, v9

    .line 2401
    .line 2402
    goto :goto_4b

    .line 2403
    :cond_6c
    const/16 v25, 0x0

    .line 2404
    .line 2405
    :goto_4b
    new-instance v21, Lm4/h;

    .line 2406
    .line 2407
    move/from16 v22, v7

    .line 2408
    .line 2409
    move/from16 v24, v12

    .line 2410
    .line 2411
    move/from16 v23, v27

    .line 2412
    .line 2413
    move/from16 v27, v28

    .line 2414
    .line 2415
    invoke-direct/range {v21 .. v27}, Lm4/h;-><init>(III[BII)V

    .line 2416
    .line 2417
    .line 2418
    move-object/from16 v1, v21

    .line 2419
    .line 2420
    iput-object v1, v0, Lm4/p;->A:Lm4/h;

    .line 2421
    .line 2422
    move-object/from16 v9, v33

    .line 2423
    .line 2424
    if-eqz v9, :cond_6d

    .line 2425
    .line 2426
    iget-wide v1, v9, Lj5/x0;->a:J

    .line 2427
    .line 2428
    invoke-static {v1, v2}, Lg8/a;->Y(J)I

    .line 2429
    .line 2430
    .line 2431
    move-result v1

    .line 2432
    iput v1, v0, Lm4/p;->h:I

    .line 2433
    .line 2434
    iget-wide v1, v9, Lj5/x0;->b:J

    .line 2435
    .line 2436
    invoke-static {v1, v2}, Lg8/a;->Y(J)I

    .line 2437
    .line 2438
    .line 2439
    move-result v1

    .line 2440
    iput v1, v0, Lm4/p;->i:I

    .line 2441
    .line 2442
    :cond_6d
    new-instance v1, Lm4/q;

    .line 2443
    .line 2444
    invoke-direct {v1, v0}, Lm4/q;-><init>(Lm4/p;)V

    .line 2445
    .line 2446
    .line 2447
    move-object/from16 v4, p7

    .line 2448
    .line 2449
    iput-object v1, v4, Lce/g;->e:Ljava/lang/Object;

    .line 2450
    .line 2451
    return-void
.end method

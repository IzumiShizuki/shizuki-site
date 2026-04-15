.class public final Lz6/e;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lr5/b0;


# instance fields
.field public final a:Ll6/d;

.field public final b:I

.field public final c:J

.field public final d:J

.field public final e:J


# direct methods
.method public constructor <init>(Ll6/d;IJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz6/e;->a:Ll6/d;

    .line 5
    .line 6
    iput p2, p0, Lz6/e;->b:I

    .line 7
    .line 8
    iput-wide p3, p0, Lz6/e;->c:J

    .line 9
    .line 10
    sub-long/2addr p5, p3

    .line 11
    iget p1, p1, Ll6/d;->d:I

    .line 12
    .line 13
    int-to-long p1, p1

    .line 14
    div-long/2addr p5, p1

    .line 15
    iput-wide p5, p0, Lz6/e;->d:J

    .line 16
    .line 17
    invoke-virtual {p0, p5, p6}, Lz6/e;->a(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide p1

    .line 21
    iput-wide p1, p0, Lz6/e;->e:J

    .line 22
    .line 23
    return-void
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


# virtual methods
.method public final a(J)J
    .locals 9

    .line 1
    iget v0, p0, Lz6/e;->b:I

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    mul-long v2, p1, v0

    .line 5
    .line 6
    iget-object p1, p0, Lz6/e;->a:Ll6/d;

    .line 7
    .line 8
    iget p1, p1, Ll6/d;->c:I

    .line 9
    .line 10
    int-to-long v6, p1

    .line 11
    sget p1, Lp4/c0;->a:I

    .line 12
    .line 13
    sget-object v8, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 14
    .line 15
    const-wide/32 v4, 0xf4240

    .line 16
    .line 17
    .line 18
    invoke-static/range {v2 .. v8}, Lp4/c0;->V(JJJLjava/math/RoundingMode;)J

    .line 19
    .line 20
    .line 21
    move-result-wide p1

    .line 22
    return-wide p1
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

.method public final e()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

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

.method public final k(J)Lr5/a0;
    .locals 14

    .line 1
    iget-object v0, p0, Lz6/e;->a:Ll6/d;

    .line 2
    .line 3
    iget v1, v0, Ll6/d;->c:I

    .line 4
    .line 5
    int-to-long v1, v1

    .line 6
    mul-long v1, v1, p1

    .line 7
    .line 8
    iget v3, p0, Lz6/e;->b:I

    .line 9
    .line 10
    int-to-long v3, v3

    .line 11
    const-wide/32 v5, 0xf4240

    .line 12
    .line 13
    .line 14
    mul-long v3, v3, v5

    .line 15
    .line 16
    div-long v5, v1, v3

    .line 17
    .line 18
    iget-wide v1, p0, Lz6/e;->d:J

    .line 19
    .line 20
    const-wide/16 v3, 0x1

    .line 21
    .line 22
    sub-long v9, v1, v3

    .line 23
    .line 24
    const-wide/16 v7, 0x0

    .line 25
    .line 26
    invoke-static/range {v5 .. v10}, Lp4/c0;->j(JJJ)J

    .line 27
    .line 28
    .line 29
    move-result-wide v5

    .line 30
    iget v7, v0, Ll6/d;->d:I

    .line 31
    .line 32
    int-to-long v7, v7

    .line 33
    mul-long v7, v7, v5

    .line 34
    .line 35
    iget-wide v9, p0, Lz6/e;->c:J

    .line 36
    .line 37
    add-long/2addr v7, v9

    .line 38
    invoke-virtual {p0, v5, v6}, Lz6/e;->a(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v11

    .line 42
    new-instance v13, Lr5/c0;

    .line 43
    .line 44
    invoke-direct {v13, v11, v12, v7, v8}, Lr5/c0;-><init>(JJ)V

    .line 45
    .line 46
    .line 47
    cmp-long v7, v11, p1

    .line 48
    .line 49
    if-gez v7, :cond_1

    .line 50
    .line 51
    sub-long/2addr v1, v3

    .line 52
    cmp-long v7, v5, v1

    .line 53
    .line 54
    if-nez v7, :cond_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    add-long/2addr v5, v3

    .line 58
    iget v0, v0, Ll6/d;->d:I

    .line 59
    .line 60
    int-to-long v0, v0

    .line 61
    mul-long v0, v0, v5

    .line 62
    .line 63
    add-long/2addr v0, v9

    .line 64
    invoke-virtual {p0, v5, v6}, Lz6/e;->a(J)J

    .line 65
    .line 66
    .line 67
    move-result-wide v2

    .line 68
    new-instance v4, Lr5/c0;

    .line 69
    .line 70
    invoke-direct {v4, v2, v3, v0, v1}, Lr5/c0;-><init>(JJ)V

    .line 71
    .line 72
    .line 73
    new-instance v0, Lr5/a0;

    .line 74
    .line 75
    invoke-direct {v0, v13, v4}, Lr5/a0;-><init>(Lr5/c0;Lr5/c0;)V

    .line 76
    .line 77
    .line 78
    return-object v0

    .line 79
    :cond_1
    :goto_0
    new-instance v0, Lr5/a0;

    .line 80
    .line 81
    invoke-direct {v0, v13, v13}, Lr5/a0;-><init>(Lr5/c0;Lr5/c0;)V

    .line 82
    .line 83
    .line 84
    return-object v0
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

.method public final m()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lz6/e;->e:J

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

.class public final Lm6/f;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public a:I

.field public b:J

.field public c:I

.field public d:I

.field public e:I

.field public final f:[I

.field public final g:Lp4/s;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xff

    .line 5
    .line 6
    new-array v1, v0, [I

    .line 7
    .line 8
    iput-object v1, p0, Lm6/f;->f:[I

    .line 9
    .line 10
    new-instance v1, Lp4/s;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lp4/s;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lm6/f;->g:Lp4/s;

    .line 16
    .line 17
    return-void
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


# virtual methods
.method public final a(Lr5/o;Z)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lm6/f;->a:I

    .line 3
    .line 4
    const-wide/16 v1, 0x0

    .line 5
    .line 6
    iput-wide v1, p0, Lm6/f;->b:J

    .line 7
    .line 8
    iput v0, p0, Lm6/f;->c:I

    .line 9
    .line 10
    iput v0, p0, Lm6/f;->d:I

    .line 11
    .line 12
    iput v0, p0, Lm6/f;->e:I

    .line 13
    .line 14
    iget-object v1, p0, Lm6/f;->g:Lp4/s;

    .line 15
    .line 16
    const/16 v2, 0x1b

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Lp4/s;->D(I)V

    .line 19
    .line 20
    .line 21
    iget-object v3, v1, Lp4/s;->a:[B

    .line 22
    .line 23
    :try_start_0
    invoke-interface {p1, v3, v0, v2, p2}, Lr5/o;->i([BIIZ)Z

    .line 24
    .line 25
    .line 26
    move-result v2
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception v2

    .line 29
    if-eqz p2, :cond_7

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    :goto_0
    if-eqz v2, :cond_6

    .line 33
    .line 34
    invoke-virtual {v1}, Lp4/s;->w()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    const-wide/32 v4, 0x4f676753

    .line 39
    .line 40
    .line 41
    cmp-long v6, v2, v4

    .line 42
    .line 43
    if-eqz v6, :cond_0

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_0
    invoke-virtual {v1}, Lp4/s;->u()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    if-eqz p2, :cond_1

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_1
    const-string p1, "unsupported bit stream revision"

    .line 56
    .line 57
    invoke-static {p1}, Lm4/p0;->c(Ljava/lang/String;)Lm4/p0;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    throw p1

    .line 62
    :cond_2
    invoke-virtual {v1}, Lp4/s;->u()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    iput v2, p0, Lm6/f;->a:I

    .line 67
    .line 68
    invoke-virtual {v1}, Lp4/s;->j()J

    .line 69
    .line 70
    .line 71
    move-result-wide v2

    .line 72
    iput-wide v2, p0, Lm6/f;->b:J

    .line 73
    .line 74
    invoke-virtual {v1}, Lp4/s;->l()J

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Lp4/s;->l()J

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Lp4/s;->l()J

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Lp4/s;->u()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    iput v2, p0, Lm6/f;->c:I

    .line 88
    .line 89
    add-int/lit8 v3, v2, 0x1b

    .line 90
    .line 91
    iput v3, p0, Lm6/f;->d:I

    .line 92
    .line 93
    invoke-virtual {v1, v2}, Lp4/s;->D(I)V

    .line 94
    .line 95
    .line 96
    iget-object v2, v1, Lp4/s;->a:[B

    .line 97
    .line 98
    iget v3, p0, Lm6/f;->c:I

    .line 99
    .line 100
    :try_start_1
    invoke-interface {p1, v2, v0, v3, p2}, Lr5/o;->i([BIIZ)Z

    .line 101
    .line 102
    .line 103
    move-result p1
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_1

    .line 104
    goto :goto_1

    .line 105
    :catch_1
    move-exception p1

    .line 106
    if-eqz p2, :cond_5

    .line 107
    .line 108
    const/4 p1, 0x0

    .line 109
    :goto_1
    if-nez p1, :cond_3

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_3
    :goto_2
    iget p1, p0, Lm6/f;->c:I

    .line 113
    .line 114
    if-ge v0, p1, :cond_4

    .line 115
    .line 116
    invoke-virtual {v1}, Lp4/s;->u()I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    iget-object p2, p0, Lm6/f;->f:[I

    .line 121
    .line 122
    aput p1, p2, v0

    .line 123
    .line 124
    iget p2, p0, Lm6/f;->e:I

    .line 125
    .line 126
    add-int/2addr p2, p1

    .line 127
    iput p2, p0, Lm6/f;->e:I

    .line 128
    .line 129
    add-int/lit8 v0, v0, 0x1

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_4
    const/4 p1, 0x1

    .line 133
    return p1

    .line 134
    :cond_5
    throw p1

    .line 135
    :cond_6
    :goto_3
    return v0

    .line 136
    :cond_7
    throw v2
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

.method public final b(Lr5/o;J)Z
    .locals 9

    .line 1
    invoke-interface {p1}, Lr5/o;->getPosition()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-interface {p1}, Lr5/o;->j()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    cmp-long v6, v0, v2

    .line 12
    .line 13
    if-nez v6, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    invoke-static {v0}, Lp4/c;->c(Z)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lm6/f;->g:Lp4/s;

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    invoke-virtual {v0, v1}, Lp4/s;->D(I)V

    .line 25
    .line 26
    .line 27
    :goto_1
    const-wide/16 v2, -0x1

    .line 28
    .line 29
    cmp-long v6, p2, v2

    .line 30
    .line 31
    if-eqz v6, :cond_1

    .line 32
    .line 33
    invoke-interface {p1}, Lr5/o;->getPosition()J

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    const-wide/16 v7, 0x4

    .line 38
    .line 39
    add-long/2addr v2, v7

    .line 40
    cmp-long v7, v2, p2

    .line 41
    .line 42
    if-gez v7, :cond_3

    .line 43
    .line 44
    :cond_1
    iget-object v2, v0, Lp4/s;->a:[B

    .line 45
    .line 46
    :try_start_0
    invoke-interface {p1, v2, v4, v1, v5}, Lr5/o;->i([BIIZ)Z

    .line 47
    .line 48
    .line 49
    move-result v2
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    goto :goto_2

    .line 51
    :catch_0
    nop

    .line 52
    const/4 v2, 0x0

    .line 53
    :goto_2
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-virtual {v0, v4}, Lp4/s;->G(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Lp4/s;->w()J

    .line 59
    .line 60
    .line 61
    move-result-wide v2

    .line 62
    const-wide/32 v6, 0x4f676753

    .line 63
    .line 64
    .line 65
    cmp-long v8, v2, v6

    .line 66
    .line 67
    if-nez v8, :cond_2

    .line 68
    .line 69
    invoke-interface {p1}, Lr5/o;->q()V

    .line 70
    .line 71
    .line 72
    return v5

    .line 73
    :cond_2
    invoke-interface {p1, v5}, Lr5/o;->r(I)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    :goto_3
    if-eqz v6, :cond_4

    .line 78
    .line 79
    invoke-interface {p1}, Lr5/o;->getPosition()J

    .line 80
    .line 81
    .line 82
    move-result-wide v0

    .line 83
    cmp-long v2, v0, p2

    .line 84
    .line 85
    if-gez v2, :cond_5

    .line 86
    .line 87
    :cond_4
    invoke-interface {p1, v5}, Lr5/o;->m(I)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    const/4 v1, -0x1

    .line 92
    if-eq v0, v1, :cond_5

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_5
    return v4
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

.class public final Lph/h;
.super Lph/b;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public b:I

.field public c:I

.field public d:B

.field public e:B

.field public f:Lph/l;

.field public g:Lph/l;


# direct methods
.method public static e(B)Z
    .locals 1

    .line 1
    and-int/lit16 p0, p0, 0xff

    .line 2
    .line 3
    const/16 v0, 0xea

    .line 4
    .line 5
    if-eq p0, v0, :cond_1

    .line 6
    .line 7
    const/16 v0, 0xed

    .line 8
    .line 9
    if-eq p0, v0, :cond_1

    .line 10
    .line 11
    const/16 v0, 0xef

    .line 12
    .line 13
    if-eq p0, v0, :cond_1

    .line 14
    .line 15
    const/16 v0, 0xf3

    .line 16
    .line 17
    if-eq p0, v0, :cond_1

    .line 18
    .line 19
    const/16 v0, 0xf5

    .line 20
    .line 21
    if-ne p0, v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return p0

    .line 26
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 27
    return p0
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
.method public final a()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lph/h;->b:I

    .line 2
    .line 3
    iget v1, p0, Lph/h;->c:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    const/4 v1, 0x5

    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    sget-object v0, Loh/a;->t:Ljava/lang/String;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v1, -0x5

    .line 13
    if-gt v0, v1, :cond_1

    .line 14
    .line 15
    sget-object v0, Loh/a;->f:Ljava/lang/String;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_1
    iget-object v1, p0, Lph/h;->f:Lph/l;

    .line 19
    .line 20
    invoke-virtual {v1}, Lph/l;->b()F

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iget-object v2, p0, Lph/h;->g:Lph/l;

    .line 25
    .line 26
    invoke-virtual {v2}, Lph/l;->b()F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    sub-float/2addr v1, v2

    .line 31
    const v2, 0x3c23d70a    # 0.01f

    .line 32
    .line 33
    .line 34
    cmpl-float v2, v1, v2

    .line 35
    .line 36
    if-lez v2, :cond_2

    .line 37
    .line 38
    sget-object v0, Loh/a;->t:Ljava/lang/String;

    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_2
    const v2, -0x43dc28f6    # -0.01f

    .line 42
    .line 43
    .line 44
    cmpg-float v1, v1, v2

    .line 45
    .line 46
    if-gez v1, :cond_3

    .line 47
    .line 48
    sget-object v0, Loh/a;->f:Ljava/lang/String;

    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_3
    if-gez v0, :cond_4

    .line 52
    .line 53
    sget-object v0, Loh/a;->f:Ljava/lang/String;

    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_4
    sget-object v0, Loh/a;->t:Ljava/lang/String;

    .line 57
    .line 58
    return-object v0
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

.method public final b()F
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

.method public final c([BI)I
    .locals 5

    .line 1
    iget-object v0, p0, Lph/h;->f:Lph/l;

    .line 2
    .line 3
    iget v0, v0, Lph/l;->b:I

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lph/h;->g:Lph/l;

    .line 9
    .line 10
    iget v0, v0, Lph/l;->b:I

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x1

    .line 16
    :goto_0
    const/4 v0, 0x3

    .line 17
    if-ne v1, v0, :cond_1

    .line 18
    .line 19
    return v0

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    :goto_1
    const/4 v1, 0x1

    .line 22
    if-ge v0, p2, :cond_6

    .line 23
    .line 24
    aget-byte v2, p1, v0

    .line 25
    .line 26
    const/16 v3, 0x20

    .line 27
    .line 28
    if-ne v2, v3, :cond_4

    .line 29
    .line 30
    iget-byte v4, p0, Lph/h;->e:B

    .line 31
    .line 32
    if-eq v4, v3, :cond_5

    .line 33
    .line 34
    iget-byte v3, p0, Lph/h;->d:B

    .line 35
    .line 36
    invoke-static {v3}, Lph/h;->e(B)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    iget v3, p0, Lph/h;->b:I

    .line 43
    .line 44
    add-int/2addr v3, v1

    .line 45
    iput v3, p0, Lph/h;->b:I

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    iget-byte v3, p0, Lph/h;->d:B

    .line 49
    .line 50
    and-int/lit16 v3, v3, 0xff

    .line 51
    .line 52
    const/16 v4, 0xeb

    .line 53
    .line 54
    if-eq v3, v4, :cond_3

    .line 55
    .line 56
    const/16 v4, 0xee

    .line 57
    .line 58
    if-eq v3, v4, :cond_3

    .line 59
    .line 60
    const/16 v4, 0xf0

    .line 61
    .line 62
    if-eq v3, v4, :cond_3

    .line 63
    .line 64
    const/16 v4, 0xf4

    .line 65
    .line 66
    if-ne v3, v4, :cond_5

    .line 67
    .line 68
    :cond_3
    iget v3, p0, Lph/h;->c:I

    .line 69
    .line 70
    add-int/2addr v3, v1

    .line 71
    iput v3, p0, Lph/h;->c:I

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    iget-byte v4, p0, Lph/h;->e:B

    .line 75
    .line 76
    if-ne v4, v3, :cond_5

    .line 77
    .line 78
    iget-byte v4, p0, Lph/h;->d:B

    .line 79
    .line 80
    invoke-static {v4}, Lph/h;->e(B)Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-eqz v4, :cond_5

    .line 85
    .line 86
    if-eq v2, v3, :cond_5

    .line 87
    .line 88
    iget v3, p0, Lph/h;->c:I

    .line 89
    .line 90
    add-int/2addr v3, v1

    .line 91
    iput v3, p0, Lph/h;->c:I

    .line 92
    .line 93
    :cond_5
    :goto_2
    iget-byte v1, p0, Lph/h;->d:B

    .line 94
    .line 95
    iput-byte v1, p0, Lph/h;->e:B

    .line 96
    .line 97
    iput-byte v2, p0, Lph/h;->d:B

    .line 98
    .line 99
    add-int/lit8 v0, v0, 0x1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_6
    return v1
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

.method public final d()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lph/h;->b:I

    .line 3
    .line 4
    iput v0, p0, Lph/h;->c:I

    .line 5
    .line 6
    const/16 v0, 0x20

    .line 7
    .line 8
    iput-byte v0, p0, Lph/h;->d:B

    .line 9
    .line 10
    iput-byte v0, p0, Lph/h;->e:B

    .line 11
    .line 12
    return-void
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

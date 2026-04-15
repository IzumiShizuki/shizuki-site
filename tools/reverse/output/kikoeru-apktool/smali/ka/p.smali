.class public final synthetic Lka/p;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lj1/q;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:F

.field public final synthetic f:Lf1/f;

.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lf1/f;Lf1/f;JJFLj1/q;II)V
    .locals 0

    .line 1
    const/4 p9, 0x0

    iput p9, p0, Lka/p;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lka/p;->f:Lf1/f;

    iput-object p2, p0, Lka/p;->h:Ljava/lang/Object;

    iput-wide p3, p0, Lka/p;->c:J

    iput-wide p5, p0, Lka/p;->d:J

    iput p7, p0, Lka/p;->e:F

    iput-object p8, p0, Lka/p;->b:Lj1/q;

    iput p10, p0, Lka/p;->g:I

    return-void
.end method

.method public synthetic constructor <init>(Ly/r1;Lj1/q;JJFLf1/f;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lka/p;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lka/p;->h:Ljava/lang/Object;

    iput-object p2, p0, Lka/p;->b:Lj1/q;

    iput-wide p3, p0, Lka/p;->c:J

    iput-wide p5, p0, Lka/p;->d:J

    iput p7, p0, Lka/p;->e:F

    iput-object p8, p0, Lka/p;->f:Lf1/f;

    iput p9, p0, Lka/p;->g:I

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lka/p;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lka/p;->h:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Ly/r1;

    .line 10
    .line 11
    move-object v9, p1

    .line 12
    check-cast v9, Lx0/o;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget p1, p0, Lka/p;->g:I

    .line 20
    .line 21
    or-int/lit8 p1, p1, 0x1

    .line 22
    .line 23
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 24
    .line 25
    .line 26
    move-result v10

    .line 27
    iget-object v2, p0, Lka/p;->b:Lj1/q;

    .line 28
    .line 29
    iget-wide v3, p0, Lka/p;->c:J

    .line 30
    .line 31
    iget-wide v5, p0, Lka/p;->d:J

    .line 32
    .line 33
    iget v7, p0, Lka/p;->e:F

    .line 34
    .line 35
    iget-object v8, p0, Lka/p;->f:Lf1/f;

    .line 36
    .line 37
    invoke-static/range {v1 .. v10}, Lm0/r0;->b(Ly/r1;Lj1/q;JJFLf1/f;Lx0/o;I)V

    .line 38
    .line 39
    .line 40
    :goto_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_0
    iget-object v0, p0, Lka/p;->h:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v2, v0

    .line 46
    check-cast v2, Lf1/f;

    .line 47
    .line 48
    move-object v9, p1

    .line 49
    check-cast v9, Lx0/o;

    .line 50
    .line 51
    check-cast p2, Ljava/lang/Integer;

    .line 52
    .line 53
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    const/16 p1, 0x187

    .line 57
    .line 58
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 59
    .line 60
    .line 61
    move-result v10

    .line 62
    iget-object v1, p0, Lka/p;->f:Lf1/f;

    .line 63
    .line 64
    iget-wide v3, p0, Lka/p;->c:J

    .line 65
    .line 66
    iget-wide v5, p0, Lka/p;->d:J

    .line 67
    .line 68
    iget v7, p0, Lka/p;->e:F

    .line 69
    .line 70
    iget-object v8, p0, Lka/p;->b:Lj1/q;

    .line 71
    .line 72
    iget v11, p0, Lka/p;->g:I

    .line 73
    .line 74
    invoke-static/range {v1 .. v11}, Lka/b;->i(Lf1/f;Lf1/f;JJFLj1/q;Lx0/o;II)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

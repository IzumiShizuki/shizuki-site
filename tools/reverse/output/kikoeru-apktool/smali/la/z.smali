.class public final synthetic Lla/z;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lic/a;

.field public final synthetic c:Lj1/q;

.field public final synthetic d:Z

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lbg/a2;Lj1/q;ZLic/a;Lic/a;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lla/z;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lla/z;->g:Ljava/lang/Object;

    iput-object p2, p0, Lla/z;->c:Lj1/q;

    iput-boolean p3, p0, Lla/z;->d:Z

    iput-object p4, p0, Lla/z;->b:Lic/a;

    iput-object p5, p0, Lla/z;->h:Ljava/lang/Object;

    iput p6, p0, Lla/z;->e:I

    iput p7, p0, Lla/z;->f:I

    return-void
.end method

.method public synthetic constructor <init>(Lic/a;Lj1/q;ZLy/d1;Lic/o;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lla/z;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lla/z;->b:Lic/a;

    iput-object p2, p0, Lla/z;->c:Lj1/q;

    iput-boolean p3, p0, Lla/z;->d:Z

    iput-object p4, p0, Lla/z;->g:Ljava/lang/Object;

    iput-object p5, p0, Lla/z;->h:Ljava/lang/Object;

    iput p6, p0, Lla/z;->e:I

    iput p7, p0, Lla/z;->f:I

    return-void
.end method

.method public synthetic constructor <init>(Ls2/a;Lic/a;Lj1/q;ZLm0/p1;II)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput v0, p0, Lla/z;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lla/z;->g:Ljava/lang/Object;

    iput-object p2, p0, Lla/z;->b:Lic/a;

    iput-object p3, p0, Lla/z;->c:Lj1/q;

    iput-boolean p4, p0, Lla/z;->d:Z

    iput-object p5, p0, Lla/z;->h:Ljava/lang/Object;

    iput p6, p0, Lla/z;->e:I

    iput p7, p0, Lla/z;->f:I

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lla/z;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lla/z;->g:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Ls2/a;

    .line 10
    .line 11
    iget-object v0, p0, Lla/z;->h:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v5, v0

    .line 14
    check-cast v5, Lm0/p1;

    .line 15
    .line 16
    move-object v6, p1

    .line 17
    check-cast v6, Lx0/o;

    .line 18
    .line 19
    check-cast p2, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget p1, p0, Lla/z;->e:I

    .line 25
    .line 26
    or-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    iget-object v2, p0, Lla/z;->b:Lic/a;

    .line 33
    .line 34
    iget-object v3, p0, Lla/z;->c:Lj1/q;

    .line 35
    .line 36
    iget-boolean v4, p0, Lla/z;->d:Z

    .line 37
    .line 38
    iget v8, p0, Lla/z;->f:I

    .line 39
    .line 40
    invoke-static/range {v1 .. v8}, Lm0/z0;->c(Ls2/a;Lic/a;Lj1/q;ZLm0/p1;Lx0/o;II)V

    .line 41
    .line 42
    .line 43
    :goto_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 44
    .line 45
    return-object p1

    .line 46
    :pswitch_0
    iget-object v0, p0, Lla/z;->g:Ljava/lang/Object;

    .line 47
    .line 48
    move-object v4, v0

    .line 49
    check-cast v4, Ly/d1;

    .line 50
    .line 51
    iget-object v0, p0, Lla/z;->h:Ljava/lang/Object;

    .line 52
    .line 53
    move-object v5, v0

    .line 54
    check-cast v5, Lic/o;

    .line 55
    .line 56
    move-object v6, p1

    .line 57
    check-cast v6, Lx0/o;

    .line 58
    .line 59
    check-cast p2, Ljava/lang/Integer;

    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget p1, p0, Lla/z;->e:I

    .line 65
    .line 66
    or-int/lit8 p1, p1, 0x1

    .line 67
    .line 68
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    iget-object v1, p0, Lla/z;->b:Lic/a;

    .line 73
    .line 74
    iget-object v2, p0, Lla/z;->c:Lj1/q;

    .line 75
    .line 76
    iget-boolean v3, p0, Lla/z;->d:Z

    .line 77
    .line 78
    iget v8, p0, Lla/z;->f:I

    .line 79
    .line 80
    invoke-static/range {v1 .. v8}, Lm0/b0;->b(Lic/a;Lj1/q;ZLy/d1;Lic/o;Lx0/o;II)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :pswitch_1
    iget-object v0, p0, Lla/z;->g:Ljava/lang/Object;

    .line 85
    .line 86
    move-object v1, v0

    .line 87
    check-cast v1, Lbg/a2;

    .line 88
    .line 89
    iget-object v0, p0, Lla/z;->h:Ljava/lang/Object;

    .line 90
    .line 91
    move-object v5, v0

    .line 92
    check-cast v5, Lic/a;

    .line 93
    .line 94
    move-object v6, p1

    .line 95
    check-cast v6, Lx0/o;

    .line 96
    .line 97
    check-cast p2, Ljava/lang/Integer;

    .line 98
    .line 99
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    iget p1, p0, Lla/z;->e:I

    .line 103
    .line 104
    or-int/lit8 p1, p1, 0x1

    .line 105
    .line 106
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    iget-object v2, p0, Lla/z;->c:Lj1/q;

    .line 111
    .line 112
    iget-boolean v3, p0, Lla/z;->d:Z

    .line 113
    .line 114
    iget-object v4, p0, Lla/z;->b:Lic/a;

    .line 115
    .line 116
    iget v8, p0, Lla/z;->f:I

    .line 117
    .line 118
    invoke-static/range {v1 .. v8}, Lla/d0;->d(Lbg/a2;Lj1/q;ZLic/a;Lic/a;Lx0/o;II)V

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
